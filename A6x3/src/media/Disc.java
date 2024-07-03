package media;

import java.util.Objects;

public class Disc {
    String titel;
    Content content;


    public Disc(String titel, Content content) {
        this.titel = titel;
        this.content = content;


    }

    @Override
    public String toString() {
        return "Disc [titel=" + titel + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, titel);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disc other = (Disc) obj;
        return content == other.content && Objects.equals(titel, other.titel);
    }




}