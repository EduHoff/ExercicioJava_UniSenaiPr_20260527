package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ConsoleUtils;
import utils.Recursion;

public class Ex9 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 9 ---");

        int n = 0;
        int m = 0;

        sc.nextLine();
        while (true) {
            try {
                System.out.println("Digite o primeiro valor do intervalo (n):");
                System.out.print("|| ");
                n = sc.nextInt();
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
        sc.nextLine();
        while (true) {
            try {
                System.out.println("Digite o segundo valor do intervalo (m):");
                System.out.print("|| ");
                m = sc.nextInt();
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
        int result = Recursion.soma_por_intervalo(n, m);
        System.out.println("A soma dos números entre " + n + " e " + m + " é " + result);
    }
}