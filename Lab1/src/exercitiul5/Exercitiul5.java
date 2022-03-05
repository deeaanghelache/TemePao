package exercitiul5;

import java.util.Scanner;
import java.util.ArrayList;

// Cititi de la tastatura n numere. Elementele citite vor fi organizate
// in doi vectori diferiti, in functie de
// paritate (de ex: elementele pare in vectorul x, iar cele
// impare in vectorul y).

public class Exercitiul5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int pare[] = new int[n], impare[] = new int[n], contorPare = 0, contorImpare = 0;

        for(int i = 0; i < n; i++){
            int elementCurent = scanner.nextInt();
            if(elementCurent % 2 == 0){
                pare[contorPare] = elementCurent;
                contorPare++;
            }
            else{
                impare[contorImpare] = elementCurent;
                contorImpare++;
            }
        }

        // AFISAREA VECTORILOR

//        for(int i = 0; i < contorPare; i++){
//            System.out.print(pare[i] + " ");
//        }
//        System.out.println();
//        for(int i = 0; i < contorImpare; i++) {
//            System.out.print(impare[i] + " ");
//        }

        // METODA CU ArrayList -> pentru push_back()

//        ArrayList<Integer> pare = new ArrayList<Integer>();
//        ArrayList<Integer> impare = new ArrayList<Integer>();
//        for (int i = 0; i < n; i++){
//            int x = scanner.nextInt();
//            if (x % 2 == 0){
//                pare.add(x);
//            } else{
//                impare.add(x);
//            }
//        }
//        for (int i = 0; i < pare.size(); i++){
//            System.out.print(pare.get(i) + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < impare.size(); i++){
//            System.out.print(impare.get(i) + " ");
//        }
//    }
    }
}
