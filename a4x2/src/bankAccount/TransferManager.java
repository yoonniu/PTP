package bankAccount;

public class TransferManager extends CurrentAccount{
    
    //geerbte Eigenschaften werden mit minimalen Werten initialisiert
    public TransferManager () {
        super("", 0);
    }

    public void transfer (CurrentAccount quelle, CurrentAccount ziel, long betrag) {
        //TODO DONE assert für die Parameter und weniger anweisungen
        //Abheben vom Quellkonto inkl. Gebühr
        
        assert betrag>=0: "Transfer fehlgeschlagen.";
        assert quelle.getAccountBalance() >= betrag: "Transfer fehlgeschlagen.";
        
        quelle.withdraw(betrag);
        ziel.deposit(betrag);
        
        }
        
    }
  

