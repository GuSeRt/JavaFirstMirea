package ru.mirea.task1;

import java.util.Arrays;
import java.util.Scanner;



class Solve3 {
    public static void SolveFor(String[] numbers) {
        numbers = numbers;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        System.out.println("The sum of the numbers by for: " + sum);
        System.out.println(Arrays.toString(numbers));
    }

    public static void SolveWhile(String[] numbers){
        numbers = numbers;
        int sum = 0;
        int i=0;
        while(i!=numbers.length){
            sum += Integer.parseInt(numbers[i]);
            i++;
        }
        System.out.println("The sum of the numbers by while: " + sum);
        System.out.println(Arrays.toString(numbers));
    }

    public static void SolveDoWhile(String[] numbers){
        numbers = numbers;
        int sum = 0;
        int i=0;
        do {
            sum += Integer.parseInt(numbers[i]);
            i++;
        } while(i!= numbers.length);
        System.out.println("The sum of the numbers by do while: " + sum);
        System.out.println(Arrays.toString(numbers));
    }



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");
        Solve3 start = new Solve3();
        start.SolveFor(numbers);
        start.SolveWhile(numbers);
        start.SolveDoWhile(numbers);

    }
}

