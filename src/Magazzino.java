public class Magazzino {
    public Prodotto[] magazzino;
    public int n;

    public Magazzino(int nMax){
        this.magazzino = new Prodotto[nMax];
        this.n = 0;
    }

    public int ricerca(String codiceProdotto){
        for (int i = 0; i < n; i++) {
            if(this.magazzino[i].getCodiceProdotto().equals(codiceProdotto)){
                return i;
            }
        }
        return -1;
    }

    public boolean aggiungi(String tipoProdotto, String descrizione, int giacenza, String codiceProdotto, double prezzoProdotto){
        if(n == this.magazzino.length){
            return false;
        }
        if(ricerca(codiceProdotto) == -1){
            Prodotto p = new Prodotto(tipoProdotto, descrizione, giacenza, codiceProdotto, prezzoProdotto);
            this.magazzino[n] = p;
            n++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean elimina(String codiceProdotto){
        int esitoRicerca = ricerca(codiceProdotto);
        if(esitoRicerca == -1){
            return false;
        }
        this.magazzino[esitoRicerca] = this.magazzino[n - 1];
        this.magazzino[n - 1] = null;
        n--;
        return true;
    }

    public boolean modifica(int giacenza, String codiceProdotto, double prezzoProdotto){
        int esitoRicerca = ricerca(codiceProdotto);
        if(esitoRicerca == -1){
            return false;
        }
        else{
            this.magazzino[esitoRicerca].setGiacenza(giacenza);
            this.magazzino[esitoRicerca].setPrezzoProdotto(prezzoProdotto);
            return true;
        }
    }

    public void stampaProdotto(String codiceProdotto){
        int esitoRicerca = ricerca(codiceProdotto);
        if(esitoRicerca == -1){
            System.out.println("Il prodotto non esiste");
        }
        else{
            this.magazzino[esitoRicerca].stampa();
        }
    }

    public void stampaTutti(){
        if(n == 0){
            System.out.println("Nessun prodotto presente");
        }
        for (int i = 0; i < n; i++) {
            this.magazzino[i].stampa();
            System.out.println();
        }
    }

}
