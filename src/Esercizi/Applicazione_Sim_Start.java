package Esercizi;

import java.util.Scanner;

public class Applicazione_Sim_Start {
    public static void main(String[] args) {

        //ciclo for per richiedere più esecuzioni

        esecuzione();

    }



















    public static void esecuzione() {

            Scanner in = new Scanner(System.in);
            int operazione, importo;

            System.out.println("inserisci numero di telefono");
            long numero_tel = in.nextLong();
            in.nextLine();
            System.out.println("inserisci il proprietario della sim");
            String proprietario = in.nextLine();
            System.out.println("inserisci credito sulla sim");
            double credito = in.nextDouble();
            in.nextLine();

            Applicazione_Sim cl1 = new Applicazione_Sim(numero_tel, proprietario, credito);


       // try {
            do {
                System.out.println("\nBenvenuto sul tuo Telefono \n1) Effettua ricarica Sim \n2) Credito Residuo \n3) Info Account \n4) Chiama Qualcuno \n5) Quante chiamate ho fatto?  \n6) Registro chiamate  \n7) Minuti Consumati \n0) Exit \n");
                operazione = in.nextInt();

                if (operazione == 1) {
                    System.out.println("Inserisci importo da ricaricare ");
                    importo = in.nextInt();
                    if (importo == 10 || importo == 15 || importo == 20 || importo == 50) {
                        System.out.println("operazione consentita");
                        cl1.Ricarica(importo);
                    } else {
                        System.out.println("operazione non consentita, prego riprovare");
                    }

                } else if (operazione == 2) {
                    System.out.println("il tuo credito residuo è di: " + cl1.getCredito() + "€");
                } else if (operazione == 3) {
                    cl1.info();

                } else if (operazione == 4) {
                    cl1.Rubrica();
                } else if (operazione == 5) {
                    cl1.numero_chiamate();
                } else if (operazione == 6) {
                    cl1.stampa_chiamate();
                } else if (operazione == 7) {
                    cl1.minutiToT();
                } else if (operazione == 0) {
                    System.out.println("EXIT");

                } else {
                    System.out.println("operzione non consentita, riprovare");
                }

            } while (operazione != 0);
       /* } catch (Exception e) {
            System.out.println("C'è stato un errore di tipo: " + e);
        }*/
    }
}
 /*    Scanner in = new Scanner(System.in);

        int operazione, importo;

        System.out.println("inserisci numero di telefono");
        long numero_tel = in.nextLong();
        in.nextLine();
        System.out.println("inserisci il proprietario della sim");
        String proprietario = in.nextLine();
        System.out.println("inserisci credito sulla sim");
        double credito = in.nextDouble();
        in.nextLine();
        Applicazione_Sim cl1 =  new Applicazione_Sim(numero_tel, proprietario, credito);

       do {
            System.out.println("\nBenvenuto sul tuo Telefono \n1) Effettua ricarica Sim \n2) Credito Residuo \n3) Info Account \n4) Chiama Qualcuno \n5) Quante chiamate ho fatto?  \n6) Registro chiamate  \n7) Minuti Consumati \n0) Exit \n");
            operazione = in.nextInt();

            if (operazione == 1){
                System.out.println("Inserisci importo da ricaricare ");
                importo = in.nextInt();
                if (importo == 10 || importo == 15 || importo == 20 || importo == 50){
                    System.out.println("operazione consentita");
                    cl1.Ricarica(importo);
                }else{
                    System.out.println("operazione non consentita, prego riprovare");
                }

                }

            else if (operazione == 2){
                System.out.println("il tuo credito residuo è di: " + cl1.getCredito() + "€");
            }

            else if (operazione == 3) {
                cl1.info();

            } else if (operazione == 4) {
                cl1.Rubrica();
            }

            else if (operazione == 5) {
                cl1.numero_chiamate();
            }

            else if (operazione == 6) {
                cl1.stampa_chiamate();
            }
            else if (operazione == 7) {
                cl1.minutiToT();
            }
            else if (operazione == 0) {
                System.out.println("EXIT");

            } else {
                System.out.println("operzione non consentita, riprovare");
            }

        }while (operazione != 0); */