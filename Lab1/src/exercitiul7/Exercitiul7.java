package exercitiul7;

import java.util.Scanner;

// Sa se afiseze al n-lea termen din seria Fibonacci,
// unde n este citit de la tastatura.

public class Exercitiul7 {
    static int fibonacci(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 0){
            System.out.println("n este negativ!");
        }
        else {
            System.out.println("Al " + n + "-lea termen al sirului lui Fibonacci este " + fibonacci(n));
        }
    }
}
