package media;

import java.util.Objects;

public class Disc {
    private String titel;
    private Content content;


    public Disc(String titel, Content content) {
        this.titel = titel;
        this.content = content;
    }
    
    public String getTitel() {
        return titel;
    }

    public Content getContent() {
        return content;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(content, titel);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
        	return true;
        }
        if (obj == null) {
        	return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        Disc other = (Disc) obj;
        return Objects.equals(content, other.content) && Objects.equals(titel, other.titel);
    }

    //TODO toString in BASDISKLASSE UND spezalisierten Klassen deklar. und mit super.toString nutzen
    @Override
    public String toString( ) {
    	return String.format("Disc [titel=\" + titel + \"]");
    }


}
