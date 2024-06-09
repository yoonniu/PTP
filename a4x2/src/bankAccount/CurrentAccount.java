package bankAccount;
//Girokonto
public class CurrentAccount extends BankAccount { 
    
    private int standardgebühr;
    
    //Parameter werden gegeben und initialisiert ohne Startguthaben
    public CurrentAccount (String iban, int standardgebühr) {
        super(iban);
        this.standardgebühr = standardgebühr;
    }
    
    //Parameter werden gegeben und initialisiert mit Startguthaben
    public CurrentAccount (String iban, long startguthaben, int standardgebühr) {
        super(iban, startguthaben);
        this.standardgebühr = standardgebühr;
    }
    
    //überschreibt withdraw Methode um Gebühr zu berücksichtigen
    @Override
    public long withdraw (long abhebebetrag) {
        //TODO assert => gebühr ist auf dem Kto
        //TODO super.withdraw (abhebe + standart)
        long gesamtabhebebetrag = abhebebetrag + standardgebühr;
        //checken, ob überhaupt genug Geld auf dem Konto
        if (gesamtabhebebetrag > kontostand) {
            assert false: "Nicht genug Geld auf dem Konto.";
        }
        kontostand = kontostand - gesamtabhebebetrag;
        return kontostand;
    }
    
    //gibt Gebühr aus
    public int getFee () {
        return standardgebühr;
    }
    
    @Override
    public String toString() {
        return String.format("<%s>: Konto:%s, Kontostand:%d, Standardgebühr:%d", CurrentAccount.class.getSimpleName(), iban, kontostand, standardgebühr);
    }
    
    

}
