package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ConsoleUtils;
import utils.Recursion;

public class Ex6 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercicío 5 ---");

        String str;
        sc.nextLine();
        while (true) {
            try{
                System.out.println("Digite uma palavra para verificar se é um palíndromo:");
                System.out.print("||");
                str = sc.nextLine();
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
        Boolean result = Recursion.is_palindromo(str);
        if(result)
            System.out.println(str + " é um palíndromo!");
        else
            System.out.println(str + " não é um palíndromo!");
    }
}