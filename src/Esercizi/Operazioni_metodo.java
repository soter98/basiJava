package Esercizi;

import java.util.Scanner;

public class Operazioni_metodo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2;

        System.out.println("inserisci il primo numero");
        n1 = input.nextInt();

        System.out.println("inserisci il secondo numero");
        n2 = input.nextInt();
/*
        System.out.println("il rapporto tra i numeri scelti è: " + rapporto(n1,n2));
        System.out.println("il prodotto tra i numeri scelti è: " + prodotto(n1,n2));
        System.out.println("la somma tra i numeri scelti è: " + somma(n1,n2));
        System.out.println("la sottrazione tra i numeri scelti è: " + sottrazione(n1,n2));
*/

    }


    public static String Somma(String a, String b){
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        return String.valueOf(x + y);
    }

    public static String Sottrazione(String a, String b){
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        return String.valueOf(x - y);
    }

    public static String Prodotto(String a, String b){
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        return String.valueOf(x * y);
    }

    public static String Rapporto(String a, String b) {
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        if (y != 0) {
            return  String.valueOf(x / y);
        } else {
            System.out.println("operazione non consentita");

        }
        return "Errore";
    }


    public static String Modulo(String a, String b){
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        if (y != 0) {
            return  String.valueOf(x % y);
        } else {
            System.out.println("operazione non consentita");
        }
        return "Errore";
    }
    }


