package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ConsoleUtils;
import utils.Recursion;

public class Ex2 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercicío 2 ---");

        int num = 0;
        while (true) {
            try{
                System.out.println("Digite um número para calcular a soma dos n primeiros números naturais:");
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
        long result = Recursion.soma_numeros_naturais(num);
        System.out.println("O somatório resultou em " + result);

    }
}