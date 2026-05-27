package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ConsoleUtils;
import utils.Recursion;

public class Ex11 implements Exercise {

    private static final int ARRAY_SIZE = 10;

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 11 ---");

        int[] vetor = new int[ARRAY_SIZE];
        
        sc.nextLine();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            while (true) {
                try {
                    ConsoleUtils.clear();
                    System.out.println("Digite o número para a posição [" + (i + 1) + "/"+ARRAY_SIZE+"]:");
                    System.out.print("|| ");
                    vetor[i] = sc.nextInt();
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
        }

        ConsoleUtils.clear();
        System.out.println("--- Resultados das Operações Recursivas ---");
        System.out.println("a) Soma dos elementos: " + Recursion.somar_elementos_vetor(vetor));
        System.out.println("b) Elemento máximo: " + Recursion.max_vetor(vetor));
        System.out.println("c) Elemento mínimo: " + Recursion.min_vetor(vetor));
        System.out.println("d) Média dos elementos: " + Recursion.media_vetor(vetor));
    }
}