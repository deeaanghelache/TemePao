package exercitiul2;

import java.util.Scanner;

// Scrieți un program care sa compare doua numere a și b
// citite de la tastatura si sa afiseze numarul mai mare.

public class Exercitiul2 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Dati 2 numere naturale: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b){
            System.out.println("Numarul " + a + " este mai mare");
        }
        else{
            System.out.println("Numarul " + b + " este mai mare");
        }
    }
}
