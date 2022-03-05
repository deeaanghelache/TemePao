package exercitiul1;

import java.util.Scanner;

// Scrieti un program care sa afișeze toate numerele pare din
// intervalul [0,n], unde n este un numar citit de la tastatura.

public class Exercitiul1 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Dati un numar natural: ");
        int n = scanner.nextInt();

        System.out.println("Numerele pare din intervalul [0, " + n + "] sunt:");
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
