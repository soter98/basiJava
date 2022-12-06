package Esercizi;

import java.util.Scanner;

public class Prenotazione {


        DB_ES prenotazione = new DB_ES();
        Scanner in = new Scanner(System.in);

        public void inserimento(){

            System.out.println("a che ora si gioca? ");
            int orainizio = in.nextInt();
            System.out.println("inserisci minuti");
            int minutiinizio = in.nextInt();
            System.out.println("a che ora finisce la parita? ");
            int orafine = in.nextInt();
            System.out.println("inserisci i minuti");
            int minutifine = in.nextInt();
            System.out.println("seleziona un id cliente");
            String idcliente = in.nextLine();
            in.nextInt();

            if (orainizio > 23 || orainizio < 0 || minutiinizio>59 || minutiinizio < 0 || orafine > 23 || orafine < 0 || minutifine >59 || minutifine < 0 ){

                System.out.println("errore nella prenotazione");

            } else {
                prenotazione.aggPren(orainizio, minutiinizio, orafine, minutifine, idcliente);
            }

        }



}
