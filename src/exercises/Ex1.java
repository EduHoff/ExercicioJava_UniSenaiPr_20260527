package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ConsoleUtils;
import utils.Recursion;

public class Ex1 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercicío 1 ---");

        int num = 0;
        sc.nextLine();
        while (true) {
            try{
                System.out.println("Digite um número natural para calcular o fatorial:");
                System.out.print("||");
                num = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                ConsoleUtils.clear();
                System.out.println("Digite apenas números inteiros positivos!\n");
                sc.nextLine();
            }catch(Exception e){
                ConsoleUtils.clear();
                e.printStackTrace();
            } 
        }

        ConsoleUtils.clear();
        long result = Recursion.fatorial(num);
        System.out.println(num + "! = " + result);

    }
}