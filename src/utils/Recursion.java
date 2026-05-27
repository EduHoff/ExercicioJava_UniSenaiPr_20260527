package utils;

public class Recursion {

    public static long fatorial(long num){

        if(num == 0)
            return 1;
        else
            return num * fatorial(num-1);
    }

}
