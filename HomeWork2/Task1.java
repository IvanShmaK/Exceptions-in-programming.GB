package org.example.homeWorks.HomeWork2;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
пользователя ввод данных.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите дробное число: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String userText = sc.nextLine();
                System.out.println(Float.parseFloat(userText));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не дробное число! Введите правильно!");
            }
        }
        sc.close();
    }

}
