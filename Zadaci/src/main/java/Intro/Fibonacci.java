package Intro;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){
        int a =0,b=1;
        int[] k = new int[40];
        k[0]=1;
        k[1]=1;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(k[0]);
        System.out.println(k[1]);

        for(int i = 2;i<n;i++){
        k[i]=k[i-1]+k[i-2];
        System.out.println(k[i]);
        }
    }
}
