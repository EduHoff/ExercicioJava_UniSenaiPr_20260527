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

}
