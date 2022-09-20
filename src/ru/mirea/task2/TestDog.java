package ru.mirea.task2;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many dogs do you want to add?");
        int num = in.nextInt();
        Dog[] arrdog = new Dog[num];

        for (int i = 0; i < num; i++) {
            arrdog[i] = new Dog(" ", 0);
            System.out.print("Set name: ");
            String name = in.next();
            arrdog[i].setName(name);
            System.out.print("Set age: ");
            int age = in.nextInt();
            arrdog[i].setAge(age);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(arrdog[i]);
        }
    }
}
