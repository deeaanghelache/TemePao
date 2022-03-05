package exercitiul4;

import java.util.Scanner;

// Fiind dat un numar n, scrieti o metoda care insumeaza toti
// multiplii de 3 si 5 pana la n (inclusiv).

public class Exercitiul4 {

    static int sumaMultiplii3Si5(int n){
        int suma = 0;
        for(int i = 1; i <= n; i++){
            if(i % 15 == 0 || i % 5 == 0 || i % 3 == 0){
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner;
        scanner =  new Scanner(System.in);

        System.out.println("Dati un numar natural: ");
        int n = scanner.nextInt();

        System.out.println("Suma = " + sumaMultiplii3Si5(n));
    }
}