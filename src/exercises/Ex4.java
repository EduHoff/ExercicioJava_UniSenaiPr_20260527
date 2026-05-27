package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ConsoleUtils;
import utils.Recursion;

public class Ex4 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 4 ---");

        int x = 0;
        int y = 0;

        while (true) {
            try {
                System.out.println("Digite a base para calcular a potência:");
                System.out.print("|| ");
                x = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                ConsoleUtils.clear();
                System.out.println("Digite apenas números inteiros!\n");
                sc.nextLine();
            } catch (Exception e) {
                ConsoleUtils.clear();
                e.printStackTrace();
                sc.nextLine();
            }
        }

        ConsoleUtils.clear();

        while (true) {
            try {
                System.out.println("Digite o expoente para calcular a potência::");
                System.out.print("|| ");
                y = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                ConsoleUtils.clear();
                System.out.println("Digite apenas números inteiros!\n");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                ConsoleUtils.clear();
                System.out.println(e.getMessage() + "\n");
                sc.nextLine();
            } catch (Exception e) {
                ConsoleUtils.clear();
                e.printStackTrace();
                sc.nextLine();
            }
        }

        ConsoleUtils.clear();
        int result = Recursion.potencia(x, y);
        System.out.println(x + "^" + y + " = " + result);
    }
}