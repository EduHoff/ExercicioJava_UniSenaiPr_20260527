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
        return fibonacci(pos, 1, 0, 1);
    }

    private static long fibonacci(int pos, int acc, int penult_num, int ult_num) {
        if (acc == pos)
            return ult_num;

        return fibonacci(pos, acc + 1, ult_num, penult_num + ult_num);
    }

    public static int potencia(int x, int y){
        if(y < 0) throw new InputMismatchException("Y não pode ser negativo!");
        if(y == 0 && x == 0) throw new ArithmeticException("Impossível elevar 0 por 0");
        return potencia(x, y, 1);
    }

    private static int potencia(int x, int y, int acc){
        
        if(y == 0) return acc;
        
        return potencia(x, y-1, acc * x);
    }

    public static void contagem_regressiva(int num){
        if(num < 0) throw new InputMismatchException("Número não pode ser negativo!");

        System.out.println(num + "!");

        if(num == 0) return;
        contagem_regressiva(num-1);
    }

    public static boolean is_palindromo(String str){
        String str_tratado = str.replaceAll("\\s", "").toLowerCase();

        if (str_tratado.isEmpty()) return true;

        return is_palindromo(str_tratado, 0, str_tratado.length()-1);
    }

    private static boolean is_palindromo(String str, int esq, int dir){

        if(esq >= dir) return true;

        if(str.charAt(esq) == str.charAt(dir)) 
            return is_palindromo(str, esq+1, dir-1);
        else
            return false;
    }

    public static String inverter_str(String str){
        StringBuilder sb = new StringBuilder();
        return inverter_str(str, sb, str.length()-1);
    }

    private static String inverter_str(String str, StringBuilder sb, int acc){
        
        if (acc < 0) return sb.toString();

        sb.append(str.charAt(acc));
        return inverter_str(str, sb, acc-1);
    }

    public static int multiplicacao_por_soma_sucessiva(int x, int y){
        
        if (y < 0) return multiplicacao_por_soma_sucessiva(-x, -y, 0);

        return multiplicacao_por_soma_sucessiva(x, y, 0);
    }

    private static int multiplicacao_por_soma_sucessiva(int x, int y, int acc){

        if (y == 0) return acc;

        return multiplicacao_por_soma_sucessiva(x,y-1, acc+x);
    }

    public static int soma_por_intervalo(int n, int m){

        if(n > m){
            int aux = n;
            n = m;
            m = aux;
        }

        return soma_por_intervalo(n, m, 0);
    }

    private static int soma_por_intervalo(int n, int m, int acc){
        
        if(n > m) return acc;
        
        return soma_por_intervalo(n+1, m, acc+n);
    }
}
