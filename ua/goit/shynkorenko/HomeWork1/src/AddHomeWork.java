/**
 * Created by Artem on 01.03.2016.
 */
package ua.goit.shynkorenko.homework1;

import java.util.Scanner;

public class AddHomeWork {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.printf("Введите любое число : ");
        int number = console.nextInt();
        if ((number % 2) == 0) {
            System.out.printf("Число %d четное число %n", number);
        } else {
            System.out.println("Это число нечетное");


        }
    }
}
