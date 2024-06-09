package bankAccount;

public class TransferManager extends CurrentAccount{
    
    //geerbte Eigenschaften werden mit minimalen Werten initialisiert
    public TransferManager () {
        super("", 0);
    }

    public void transfer (CurrentAccount quelle, CurrentAccount ziel, long betrag) {
        //TODO DONE assert für die Parameter und weniger anweisungen
        //Abheben vom Quellkonto inkl. Gebühr
        
        if (betrag<=0) assert false: "Transfer fehlgeschlagen.";
        if (quelle.getAccountBalance() < betrag) assert false: "Transfer fehlgeschlagen.";
        
        long abgehoben = quelle.withdraw(betrag);
        ziel.deposit(betrag);
        
        }
        
    }
  

