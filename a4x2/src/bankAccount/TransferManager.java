package bankAccount;

public class TransferManager extends CurrentAccount{
    
    //geerbte Eigenschaften werden mit minimalen Werten initialisiert
    public TransferManager () {
        super("", 0);
    }

    public void transfer (CurrentAccount quelle, CurrentAccount ziel, long betrag) {
        //TODO assert für die Parameter und weniger anweisungen
        //Abheben vom Quellkonto inkl. Gebühr
        long abgehoben = quelle.withdraw(betrag);
        //if-Anweisung zum Sicherstellen, dass das Abheben erfolgreich war
        if (abgehoben >= 0) {
            //wenn Abheben erfolgreich (kein Fehlercode), dann Betrag auf Zielkonto einzahlen
            ziel.deposit(betrag);
        } else {
            assert false: "Transfer fehlgeschlagen.";
        }
        
    }
  
}
