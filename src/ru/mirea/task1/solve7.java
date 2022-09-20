package ru.mirea.task1;

import java.util.Scanner;

public class solve7 {
    public static void main(String[] args){
        solve7 start = new solve7();
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.println(start.getFactorial(num));

    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
