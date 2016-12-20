package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        for(int i=1;i<=n;i++){
            int k=i;
            while(n-k>0){
                System.out.print(" ");
                k++;
            }

                for(int j=1;j<=(2*i-1);j++)
                    System.out.print("*");

            System.out.println();
        }


    }
}
