package org.example.homeWorks.HomeWork2;

import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите что-нибудь: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if (text.equals("")) throw new RuntimeException("Пустые строки вводить нельзя!");
        sc.close();
    }
}
