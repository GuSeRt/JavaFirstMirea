package ru.mirea.task26;
import java.util.Scanner;

public class OplataNalichka implements Oplata{
    private String walletNumber;
    public void pay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[+] Введите номер телефона");
        this.walletNumber = sc.nextLine();
        System.out.println("Спасибо за покупку!");
    }
}