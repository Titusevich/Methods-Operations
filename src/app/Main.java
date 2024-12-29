package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int count;
    static double radius;
    static double height;
    static int[] array;

    public static void main(String[] args) {

        count++;
        Scanner scan = new Scanner(System.in);
        System.out.print("\n" + count + ") Enter int number:");
        int number = scan.nextInt();
        int square = square(number);
        System.out.println("The square of number " + number + " is " + square + ".");

        count++;
        radius = 4.5;
        height = 8.5;
        System.out.println("\n" + count +  ") The volume of cylinder with radius " + radius +
                " and height " + height + " is " + volume(radius, height) + ".");

        count++;
        array = new int[]{14, 6, 21, 9, 11};
        String strArray = Arrays.toString(array);
        System.out.println("\n" + count + ") Array of numbers: " + strArray +
                "\nSum of all array elements equals " + getSumma(array) + ".");
    }

    public static int square(int num) {
        return num * num;
    }
    public static double volume(double radius, double height) {
        return Math.pow(radius, 2) * height * Math.PI;
    }
    public static int getSumma(int... numbers) {
        int summa = 0;
        for (int num : numbers) {
            summa += num;
        }
        return summa;
    }
}
