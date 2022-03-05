package exercitiul3;

import java.util.Scanner;

// Scrieți o metoda care sa calculeze factorialul
// unui numar n citit de la tastatura.

public class Exercitiul3 {
    static int factorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Dati un numar natural: ");
        int n = scanner.nextInt();

        System.out.println(n + "! = " + factorial(n));
    }
}
