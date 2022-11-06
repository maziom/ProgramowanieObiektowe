import java.io.FilterOutputStream;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    //zad1
    public static float suma(float[] jakasTablica) {
        float suma = 0;
        for (int i = 0; i < jakasTablica.length; i++) {
            suma += jakasTablica[i];
        }
        return suma;
    }

    public static float srednia(float[] jakasTablica) {
        float suma = 0;
        for (float Kolejnyelement : jakasTablica) {
            suma += Kolejnyelement;
        }

        float srednia = suma / jakasTablica.length;
        return srednia;
    }

    public static void losuj(float[] jakasTablica) {
        for (int i = 0; i < jakasTablica.length; i++) {
            float losowaWartosc = (float) Math.random() * 1000;
            jakasTablica[i] = losowaWartosc;
        }

    }

    //zad2
    public static void WypiszCoDrugi() {
        float[] tablica1 = new float[6];
        float[] tablica2 = new float[5];
        losuj(tablica1);
        losuj(tablica2);
        // Sprytne wypisywanie elementów tablicy
        System.out.println("Elementy tablicy1: " + Arrays.toString(tablica1));
        for (int i = 1; i < tablica1.length; i += 2) {
            System.out.println(tablica1[i]);
        }
        System.out.println("Elementy tablicy2: " + Arrays.toString(tablica2));
        for (int i = 1; i < tablica2.length; i += 2) {
            System.out.println(tablica2[i]);
        }

    }

    //zad3
    public static void zad3() {
        String[] stringi = new String[2];
        stringi[0] = "kot";
        stringi[1] = "ala";
        for (String next : stringi) {
            System.out.println(next.toUpperCase());
        }

    }

    public static void zad4() {
        String[] stringi2 = new String[5];
        Scanner pobierane = new Scanner(System.in);
        System.out.println("Podaj stringi: ");
        for (int i = 0; i < 5; i++) {
            String linijka = pobierane.nextLine();
            stringi2[i] = linijka;
            System.out.println("Zapisuje linijke pod indeksem " + i);
        }
        for (int i = 4; i >= 0; i--) {
            String next = stringi2[i];
            StringBuilder sb = new StringBuilder(next);
            sb.reverse();
            String odwrotny = sb.toString();
            System.out.println("na odwrot: " + odwrotny);

        }
    }

    //zad5
    //zad6
    public static void zad6() {
        int[] tablica = new int[5];
        for (int i = 0; i < 5; i++) {
            Scanner skaner = new Scanner(System.in);
            int pobieranie = skaner.nextInt();
            tablica[i] = pobieranie;
            int wynik = silnia(pobieranie);
            System.out.println("Silnia od:" + pobieranie + " " + "wynosi: " + wynik);
        }

    }

    public static int silnia(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void zad7() {
        String[] stringi = new String[3];
        stringi[0] = "hej";
        stringi[1] = "jak";
        stringi[2] = "tam";
        String[] stringi2 = new String[3];
        stringi2[0] = "hej";
        stringi2[1] = "jak";
        stringi2[2] = "tam";

        boolean tabliceTakieSame = true;

        for (int i = 0; i < 3; i++) {
            String slowo1 = stringi[i];
            String slowo2 = stringi2[i];

            boolean tosamo = slowo1.equals(slowo2);
            if (tosamo == false) {
                tabliceTakieSame = false;
            }
        }

        System.out.println("tabliceTakieSame=" + tabliceTakieSame);
    }

    public static void main(String[] args) {
//zad1
        float[] tablica = new float[4];

        losuj(tablica);

        float suma = suma(tablica);
        float srednia = srednia(tablica);

        System.out.println("Suma = " + suma);
        System.out.println("Srednia = " + srednia);

        //WypiszCoDrugi();

        //zad3();
        //zad4();
        //zad6();
        zad7();
    }

}