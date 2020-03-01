package sef.ATestTask.fibonacci;

import java.util.Scanner;

public class fibonacci {

    static void fibonacciNr(int n){
        int f1=0, f2=1;
        for (int i=1;i<=n;i++){
            System.out.println(f2+" ");
            int fn=f1+f2;
            f1=f2;
            f2=fn;
        }
    }
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        System.out.println("Insert number for fibonnacy nr");
        int a=console.nextInt();
        fibonacciNr(a);
    }

}
