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
        for (int substringLength = inputText.length(); substringLength > 0; substringLength--) {
            for (int substringStart = 0; substringStart <= inputText.length() - substringLength; substringStart++) {
                int indexVorne = substringStart;
                int indexHinten = substringStart + substringLength - 1;
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
                    längstesPalindrom = inputText.substring(substringStart, substringStart + substringLength);
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
