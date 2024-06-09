package bankAccount;
//Sparkonto mit Zinsausschüttung
public class SavingsAccount extends BankAccount {
    
    private int zinssatz;
    
    //Parameter werden gegeben und initialisiert
    public SavingsAccount (String iban, long startguthaben, int zinssatz) {
        super(iban, startguthaben);
        //TODO DONE assert für zinssatz
        this.zinssatz = zinssatz;
        assert zinssatz >= 0: "Zinssatz ist nicht möglich.";
                
    }
    
    //Zinsen werden berechnet und zum Kontostand hinzugefügt
    public void giveInterest () {
        long zinsen = (long) (getAccountBalance() * zinssatz/1000);
        //TODO DONE hier deposit nutzen
        super.deposit (zinsen);
    }
    
    //gibt Zinssatz aus
    public int getInterestRate () {
        return zinssatz;
    }
    
    @Override
    public String toString() {
        //TODO hier spezielle Attribute und toString von BankAccount ausgeben / nutzen
        //TODO auch im CrrentAccount
        return String.format("<%s>: Konto:%s, Kontostand:%d, Zinssatz:%d", SavingsAccount.class.getSimpleName(), getAccountId(), getAccountBalance(), zinssatz);
    }

}
