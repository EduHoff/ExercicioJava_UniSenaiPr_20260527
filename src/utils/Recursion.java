package utils;

import java.util.InputMismatchException;

public class Recursion {

    public static long fatorial(long num){
        if(num < 0) throw new InputMismatchException("Número não pode ser negativo!");

        if(num == 0)
            return 1;
        else
            return num * fatorial(num-1);
    }

    public static int soma_numeros_naturais(int num){       
        if(num < 0) throw new InputMismatchException("Número não pode ser negativo!");

        if(num == 0)
            return 0;
        else
            return num + soma_numeros_naturais(num-1);
    }

    public static long fibonacci(int pos) {
        if (pos <= 0) throw new IndexOutOfBoundsException("Posição na sequência não pode ser menor ou igual a zero!");
        return fibonacciTail(pos, 1, 0, 1);
    }

    private static long fibonacciTail(int pos, int acc, int penult_num, int ult_num) {
        if (acc == pos)
            return ult_num;

        return fibonacciTail(pos, acc + 1, ult_num, penult_num + ult_num);
    }
}
