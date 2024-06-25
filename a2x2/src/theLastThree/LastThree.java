// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package theLastThree;
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: NIEMALS verschiedene Sprachen in einem Programm mixen.
 * Oder konkreter: Entweder Code, Variablen und Kommentar in deutsch oder in englisch.
 * Es gelten die in der Vorlesung besprochenen Regeln.
 * Es lohnt sich immer, die Vorlesungsinhalte zu kennen ;-)
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar "hier" für Erklärungen und Ausführungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 *     Löschen Sie derartigen Kommentar vor der Abgabe.
 * 
 * Im Rahmen der Aufgabenstellung müssen Sie GUTEN Kommentar schreiben.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * The {@link LastThree} - see task
 * 
 * @author  (your name(s)) 
 * @version (a version number or a date)
 */
public class LastThree {
    
    //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
    //
    // U.U. müssen Sie diesen Kommentar durch geeigneten Code ersetzen.
    // Sollte "hier" kein Code nötig sein, löschen diesen Kommentar einfach.
    //
    // Hier wäre die geeignete Stelle für mögliche 
    //      Zustandsvariablen / Exemplarvariablen = Objekt-spezifische Variablen oder
    //      (u.U. darauffolgend) einen Konstruktor,
    // sofern derartiges benötigt wird.
    // Es ist Ihre Entscheidung und sie sollte Sinn machen.
    //
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    int newestNumber = 0; //Deklaration und Initialierung
    int middleNumber = 0; 
    int oldestNumber = 0;
    int upToThreeCounter = 0;
    
    
    
    /**
     * in the beginning there isn't any number known
     */
    public LastThree(){
        // U.U. muss hier Code ergänzt werden.
        // ... ???
        // Konstruktor
        
    }//method()
    
    
    
    /**
     * print the last three numbers/values
     */
    public void printLastThree(){
        // Ersetzen Sie diesen Kommentar durch Ihren Code.
        // Geben Sie die letzen drei Zahlen aus.
        // .
        //wird nur ausgegeben wenn Variable belegt worden ist
        if (upToThreeCounter >=3) {
            System.out.printf("%d, ",oldestNumber);
        }
        if (upToThreeCounter >=2) {
            System.out.printf("%d, ",middleNumber);
        }
        if (upToThreeCounter >=1) {
            System.out.printf("%d ",newestNumber);
        }
            
        //System.out.printf("%d, %d, %d ",oldestNumber,middleNumber,newestNumber);
    }//method()
    
    /**
     * process new value
     * 
     * @param value  current value
     */
    public void processNewValue( int value ){
        // Ersetzen Sie diesen Kommentar durch Ihren Code.
        // Verarbeite den neuen Wert "value". In Value liegt der aktuelle Wert,
        // der nun "gemerkt" werden soll.
        // ...
        if (upToThreeCounter < 3)   upToThreeCounter++;
        //Zahlen rutschen auf wenn neue Zahl gegeben wird
        oldestNumber = middleNumber;
        middleNumber = newestNumber;
        newestNumber = value;
        
    }//method()
    
}
