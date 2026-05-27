package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ConsoleUtils;
import utils.Recursion;

public class Ex10 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercicío 10 ---");

        int num = 0;
        sc.nextLine();
        while (true) {
            try{
                System.out.println("Digite um número para começar a contagem crescente:");
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
        Recursion.ordem_crescente(num);
    }
}