import java.util.Scanner;

public class Interfaccia {
    Magazzino m = new Magazzino(1000);
    public void stampaInterfaccia(){
        String tipoProdotto;
        int giacenza;
        String codiceProdotto;
        double prezzoProdotto;
        String descrizione;
        Scanner s1 = new Scanner(System.in); // NUMERI
        Scanner s2 = new Scanner(System.in); // STRINGHE
        int scelta = 0;
        while(true){
            System.out.println("\n\t\tMENU MAGAZZINO");
            System.out.println("1. Aggiungi Prodotto");
            System.out.println("2. Elimina Prodotto");
            System.out.println("3. Modifica Prodotto");
            System.out.println("4. Stampa Prodotto");
            System.out.println("5. Stampa tutti i prodotti");
            System.out.print("\nDigita la scelta: ");
            scelta = s1.nextInt();
            switch (scelta){
                case 1:
                    System.out.println("\nHai selezionato: AGGIUNGI PRODOTTO");
                    System.out.print("Inserisci il tipo di prodotto: ");
                    tipoProdotto = s2.nextLine();
                    System.out.print("Inserisci la descrizione del prodotto: ");
                    descrizione = s2.nextLine();
                    System.out.print("Inserisci la giacenza: ");
                    giacenza = s1.nextInt();
                    System.out.print("Inserisci il codice del prodotto: ");
                    codiceProdotto = s2.nextLine();
                    System.out.print("Inserisci il prezzo del prodotto: ");
                    prezzoProdotto = s1.nextDouble();
                    System.out.println(m.aggiungi(tipoProdotto, descrizione, giacenza, codiceProdotto, prezzoProdotto));
                    System.out.println("PRODOTTO INSERITO");
                    break;

                case 2:
                    System.out.println("\nHai selezionato: ELIMINA PRODOTTO");
                    System.out.print("Inserisci il codice del prodotto: ");
                    codiceProdotto = s2.nextLine();
                    System.out.println(m.elimina(codiceProdotto));
                    System.out.println("PRODOTTO ELIMINATO");
                    break;

                case 3:
                    System.out.println("\nHai selezionato: MODIFICA PRODOTTO");
                    System.out.print("Inserisci la giacenza: ");
                    giacenza = s1.nextInt();
                    System.out.print("Inserisci il codice del prodotto: ");
                    codiceProdotto = s2.nextLine();
                    System.out.print("Inserisci il prezzo del prodotto: ");
                    prezzoProdotto = s1.nextDouble();
                    System.out.println(m.modifica(giacenza, codiceProdotto, prezzoProdotto));
                    System.out.println("PRODOTTO MODIFICATO");
                    break;

                case 4:
                    System.out.println("\nHai selezionato: STAMPA PRODOTTO");
                    System.out.print("Inserisci il codice del prodotto: ");
                    codiceProdotto = s2.nextLine();
                    m.stampaProdotto(codiceProdotto);
                    break;

                case 5:
                    System.out.println("\nHai selezionato: STAMPA TUTTI I PRODOTTI");
                    m.stampaTutti();
                    break;
            }
        }
    }
}
