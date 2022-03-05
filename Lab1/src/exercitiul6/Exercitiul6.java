package exercitiul6;

import java.util.Scanner;
import java.util.ArrayList;

// Cititi de la tastatura n note, numere intregi, intr-un vector.
// Cand cititi valoarea -1 de la tastatura, citirea
// notelor se opreste si programul afiseaza media acestora.

public class Exercitiul6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int element = scanner.nextInt();
        double suma = 0;
        ArrayList<Integer> note = new ArrayList<Integer>();

        while(element != -1){
            note.add(element);
            element = scanner.nextInt();
        }

        for (Integer integer : note) {
            suma += integer;
        }

        System.out.println("Media notelor este = " + suma / note.size());
    }
}
