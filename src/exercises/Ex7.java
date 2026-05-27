package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ConsoleUtils;
import utils.Recursion;

public class Ex7 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercicío 7 ---");

        String str;
        sc.nextLine();
        while (true) {
            try{
                System.out.println("Digite uma palavra para inverter:");
                System.out.print("||");
                str = sc.nextLine();
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
        String result = Recursion.inverter_str(str);
        System.out.println("Palavra original : " + str);
        System.out.println("Palavra invertida: " + result);
    }
}