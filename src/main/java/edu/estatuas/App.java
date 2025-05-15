package edu.estatuas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el número romano:");

        String roman = scanner.nextLine();

        RomanNumber rn = new RomanNumber(roman);

        System.out.println("El valor de: " + roman + " es: " + rn.toDecimal()); 
    }
}
