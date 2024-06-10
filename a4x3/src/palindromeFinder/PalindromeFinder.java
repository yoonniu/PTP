package palindromeFinder;

public class PalindromeFinder {

    private String inputText;

    // parameterloser Konstruktor
    public PalindromeFinder() {
    }

    // Konstruktor mit String-Parameter
    public PalindromeFinder(String inputText) {
        // alles konvertieren in Kleinbuchstaben
        setText(inputText);
    }

    public String getLongestPalindrome() {

        // Variable zur Speicherung des längsten Palindroms
        String längstesPalindrom = "";

        // Schleife durch die mögliche Länge des Substrings
        for (int textLength = inputText.length(); textLength > 0; textLength--) {
            for (int i = 0; i <= inputText.length() - textLength; i++) {
                int indexVorne = i;
                int indexHinten = i + textLength - 1;
                boolean isPalindrome = true;

                // Überprüfen, ob der aktuelle Substring ein Palindrom ist
                while (isPalindrome && indexVorne <= indexHinten) {
                    //boolean hier ggf automatisch return false
                    isPalindrome = inputText.charAt(indexVorne) == inputText.charAt(indexHinten); 
                    indexVorne++;
                    indexHinten--;
                }

                // Wenn ein Palindrom gefunden wurde, speichern und zurückgeben
                if (isPalindrome) {
                    längstesPalindrom = inputText.substring(i, i + textLength);
                    return längstesPalindrom;
                }
            }
        }
        return längstesPalindrom;
    }
    // Text zu Kleinbuchstaben
    public void setText(String text) {
        this.inputText = text.toLowerCase();
    }
    // gibt den aktuell untersuchten Text wieder
    public String getText() {
        return this.inputText;
    }

}

