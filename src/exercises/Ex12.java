package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ConsoleUtils;
import utils.Recursion;

public class Ex12 implements Exercise {

    private static final int LINHAS = 3;
    private static final int COLUNAS = 3;

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 12 ---");

        int[][] matriz = new int[LINHAS][COLUNAS];
        
        sc.nextLine();
        for (int l = 0; l < LINHAS; l++) {
            for (int c = 0; c < COLUNAS; c++) {
                while (true) {
                    try {
                        ConsoleUtils.clear();
                        System.out.println("Preenchendo a Matriz " + LINHAS + "x" + COLUNAS);
                        System.out.println("Digite o valor para a posição [" + (l + 1) + "][" + (c + 1) + "]:");
                        System.out.print("|| ");
                        matriz[l][c] = sc.nextInt();
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
        }

        ConsoleUtils.clear();
        boolean simetrica = Recursion.is_simetrica(matriz);
        int[][] transposta = Recursion.transpor_matriz(matriz);

        System.out.println("--- Resultados das Operações com Matrizes ---");
        System.out.println("a) A matriz é simétrica? " + (simetrica ? "SIM" : "NÃO"));
        System.out.println();
        
        System.out.println("b) Matriz Transposta Resultante:");
        imprimirMatriz(transposta);
    }

    private void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}