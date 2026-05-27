package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ConsoleUtils;
import utils.Recursion;

public class Ex3 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercicío 3 ---");

        int pos = 1;
        sc.nextLine();
        while (true) {
            try{
                System.out.println("Digite qual posição da sequência de Fibonacci quer calcular o número:");
                System.out.print("||");
                pos = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                ConsoleUtils.clear();
                System.out.println("Digite apenas números inteiros positivos!\n");
                sc.nextLine();
            }catch(IndexOutOfBoundsException e){
                ConsoleUtils.clear();
                System.out.println("A posição precisa ser maior que zero!\n");
                sc.nextLine();
            }catch(Exception e){
                ConsoleUtils.clear();
                e.printStackTrace();
            } 
        }

        ConsoleUtils.clear();
        long result = Recursion.fibonacci(pos);
        System.out.println(result + " é o " + pos + "º número da sequência de Fibonacci!");
    }
}