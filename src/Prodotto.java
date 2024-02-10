public class Prodotto {
    public String tipoProdotto;
    public int giacenza;
    public String codiceProdotto;
    public double prezzoProdotto;
    public String descrizione;


    public Prodotto(String tipoProdotto, String descrizione, int giacenza, String codiceProdotto, double prezzoProdotto){
        this.tipoProdotto = tipoProdotto;
        this.giacenza = giacenza;
        this.codiceProdotto = codiceProdotto;
        this.prezzoProdotto = prezzoProdotto;
        this.descrizione = descrizione;
    }

    public void stampa(){
        System.out.println("Tipo prodotto: " + this.tipoProdotto);
        System.out.println("Descrizione: " + this.descrizione);
        System.out.println("Giacenza: " + this.giacenza);
        System.out.println("Codice prodotto: " + this.codiceProdotto);
        System.out.println("Prezzo prodotto: " + this.prezzoProdotto + "€");
    }

    public String getTipoProdotto() {
        return tipoProdotto;
    }

    public void setNomeProdotto(String tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getGiacenza() {
        return giacenza;
    }

    public void setGiacenza(int giacenza) {
        this.giacenza = giacenza;
    }

    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(String codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

    public double getPrezzoProdotto() {
        return prezzoProdotto;
    }

    public void setPrezzoProdotto(double prezzoProdotto) {
        this.prezzoProdotto = prezzoProdotto;
    }
}
