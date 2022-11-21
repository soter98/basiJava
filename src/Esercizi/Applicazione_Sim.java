package Esercizi;
import java.util.ArrayList;
import java.util.Scanner;

public class Applicazione_Sim {

    private long num_tel;
    private String proprietario;
    private double credito;
    private ArrayList<String> Registro_Chiamate = new ArrayList<String>();

    private int minutiM = 0, minutiP = 0, minutiF = 0, minutiS = 0;

    Applicazione_Sim (long num_tel, String proprietario, double credito) {

        this.num_tel = num_tel;
        this.proprietario = proprietario;
        this.credito = credito;

    }

    public void info() {

        System.out.println("Il proprietario è: " + proprietario);
        System.out.println("il numero di telefono è: " + num_tel);

    }


    public void Ricarica(int vers) {

        credito += vers;
        System.out.println("ricarica effettuata, il nuovo credito è: " + credito + "€");
    }

    public double getCredito(){
        return credito ;
    }


    public void Rubrica(){

        Scanner in = new Scanner(System.in);
        int scelta;
        try {
            do
            {
                System.out.println("\n1) MAMMA \n2) PAPA \n3) FRATELLO \n4) SORELLA \n0) EXIT");
                scelta= in.nextInt();
                in.nextLine();

                if(scelta == 1){
                    System.out.println("Ho chiamato MAMMA ");
                    conta_Chiamate ++;
                    conta_mamma ++;
                    System.out.println("quanti minuti è durata la telefonata ?");
                    minutiM = in.nextInt();
                    this.Registro_Chiamate("MAMMA");

                }

                else if (scelta == 2){
                    System.out.println("Ho chiamato PAPA ");
                    conta_Chiamate ++;
                    conta_papa ++;
                    System.out.println("quanti minuti è durata la telefonata ?");
                    minutiP = in.nextInt();
                    this.Registro_Chiamate("PAPA");

                }
                else if (scelta == 3){
                    System.out.println("Ho chiamato FRATELLO ");
                    conta_Chiamate ++;
                    conta_fratello ++;
                    System.out.println("quanti minuti è durata la telefonata ?");
                    minutiF = in.nextInt();
                    this.Registro_Chiamate("FRATELLO");

                }
                else if (scelta == 4){
                    System.out.println("ho chiamato SORELLA");
                    conta_Chiamate ++;
                    conta_sorella ++;
                    System.out.println("quanti minuti è durata la telefonata ?");
                    minutiS = in.nextInt();
                    this.Registro_Chiamate("SORELLA");
                }
                else if (scelta == 0) {
                    System.out.println("EXIT");
                }

                else {
                    System.out.println("scelta non consentita");
                }

            }while (scelta != 0);
    }
        catch (Exception e) {
            System.out.println("C'è stato un errore di tipo: " + e);
        }
    }


    ArrayList<String> chiamate = new ArrayList<String>();
    private int conta_Chiamate = 0;
    private int conta_mamma = 0;
    private int conta_papa = 0;
    private int conta_fratello = 0;
    private int conta_sorella = 0;


     void Registro_Chiamate (String chiamata){
        if(chiamate.size() > 4){
            chiamate.remove(0);
            chiamate.add(chiamata);
        }else{
            chiamate.add(chiamata);
        }
    }

    void stampa_chiamate(){
        for (int i = 0; i < chiamate.size(); i++) {
            System.out.println(chiamate.get(i));
        }
    }


    void numero_chiamate(){
        System.out.println("hai chiamato " + conta_Chiamate + " volte");
        System.out.println("hai chiamato MAMMA " + conta_mamma + " volte");
        System.out.println("hai chiamato PAPA " + conta_papa + " volte");
        System.out.println("hai chiamato FRATELLO " + conta_fratello + " volte");
        System.out.println("hai chiamato SORELLA " + conta_sorella + " volte");
    }

    void minutiMamma(){
        System.out.println("hai parlato con MAMMA per " + minutiM + " minuti");
    }

    void minutiPapa(){
        System.out.println("hai parlato con PAPA per " + (minutiP) + " minuti" );
    }

    void minutiFratello(){
        System.out.println("hai parlato con FRATELLO per " + (minutiF) + " minuti");
    }

    void minutiSorella(){
        System.out.println("hai parlato con SORELLA per " + (minutiS) + " minuti");
    }

    void minutiToT(){
         int minutiToT = minutiM + minutiP + minutiF + minutiS;
         System.out.println("hai chiamato per " + minutiToT + " minuti");
         minutiMamma();
         minutiPapa();
         minutiFratello();
         minutiSorella();
    }

}
