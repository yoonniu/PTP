package bankAccount;
//Girokonto
public class CurrentAccount extends BankAccount { 
    
    private int standardgebühr;
    
    //Parameter werden gegeben und initialisiert ohne Startguthaben
    public CurrentAccount (String iban, int standardgebühr) {
        
        super(iban);
        assert iban != null: "ungültige IBAN.";
        assert standardgebühr >= 0: "Gebühr kann nicht negativ sein.";
        this.standardgebühr = standardgebühr;
        

    }
    
    //Parameter werden gegeben und initialisiert mit Startguthaben
    public CurrentAccount (String iban, long startguthaben, int standardgebühr) {
        super(iban, startguthaben);
        assert iban != null: "ungültige IBAN.";
        assert startguthaben >= 0: "Startguthaben kann nicht negativ sein.";
        assert standardgebühr >= 0: "Gebühr kann nicht negativ sein.";
        this.standardgebühr = standardgebühr;
        
    }
    
    //überschreibt withdraw Methode um Gebühr zu berücksichtigen
    
    public long withdrawWithFees (long abhebebetrag) {
        //TODO DONE assert => gebühr ist auf dem Konto
        //TODO DONE super.withdraw (abhebe + standart)
        assert getAccountBalance() >= 0: "Kontostand ist ungültig.";
        assert abhebebetrag >= 0: "Abhebebetrag kann nicht negativ sein.";
        
        long gesamtabhebebetrag = abhebebetrag + standardgebühr;
        //checken, ob überhaupt genug Geld auf dem Konto
        assert gesamtabhebebetrag <= getAccountBalance(): "Nicht genug Geld auf dem Konto.";
        
        
//        kontostand = getAccountBalance() - gesamtabhebebetrag;
//        return kontostand;
        super.withdraw(gesamtabhebebetrag);
        return getAccountBalance();
    }
    
    //gibt Gebühr aus
    public int getFee () {
        return standardgebühr;
    }
    
    @Override
    public String toString() {
        return String.format("<%s>: %s, Standardgebühr:%d",CurrentAccount.class.getSimpleName(),super.toString(), standardgebühr);
    }
    
}
