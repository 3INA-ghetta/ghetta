package superEnalotto;

import java.util.Scanner;

public class SuperEnalottoTestNew {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        SuperEnalottoNew s1 = new SuperEnalottoNew();

        int array1[] = new int[6];
        int[] rispostaCorr = s1.superEnalottoArray();
        for (int i = 0; i < array1.length; i++) {
            System.out.print("inserisci un numero: ");
            n = in.nextInt();
            array1[i] = n;
        }
        System.out.println("\n");
        System.out.print("la tua risposta: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }

        System.out.println("la risposta corretta: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(rispostaCorr[i] + " ");
        }
        for (int i = 0; i < array1.length; i++) {
            for (int b = 0; b < array1.length; b++) {
                if (array1[i] == rispostaCorr[b]) {
                    System.out.println("il valore " + (array1[i]) + " è corretto");
                }
            }

        }
    }
}

