package bankAccount;

public class BankAccount {
    //TODO DONE in allen Klassen Felder auf private 
    private String iban;
    private long kontostand;
    
    public BankAccount (String iban) {
        this.iban = iban;
        this.kontostand = 0;
    }
    
    public BankAccount (String iban, long startguthaben) {
        //TODO assert für BEIDE paraameter => auch in anderen Methoden
        assert kontostand >= 0: "Startguthaben nicht möglich.";
        assert iban != null: "IBAN ungültig";
        
        this.iban = iban;
        this.kontostand = startguthaben;
    }
    //Geld abheben
    public long withdraw (long abhebebetrag) {
        //TODO assert für Parameter (mehrere Meter)
        //checken, ob überhaupt genug Geld auf dem Konto
        assert abhebebetrag <= kontostand: "Nicht genug Geld auf dem Konto.";
        
        kontostand = kontostand - abhebebetrag;
        return kontostand;
    }
    
    //Geld einzahlen
    public long  deposit (long einzahlbetrag) {
        kontostand = kontostand + einzahlbetrag;
        return kontostand;
    }
    
    //Kontostand ausgeben
    public long getAccountBalance () {
        return kontostand;
    }
    
    //IBAN ausgeben
    public String getAccountId() {
        return iban;
    }
    
    @Override
    public String toString() {
        return String.format("<%s>: Konto:%s, Kontostand:%d", BankAccount.class.getSimpleName(), iban, kontostand);
    }

}
