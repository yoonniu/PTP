package media;

import java.util.Objects;

public class CD extends Disc {
    String interpret;
    Content content;
    String titel;
    public CD(String titel, Content content, String interpret) {
        super(titel, content);
        this.titel = titel;
        this.content = content;
        this.interpret = interpret;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(content, interpret, titel);
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        CD other = (CD) obj;
        return content == other.content && Objects.equals(interpret, other.interpret) && Objects.equals(titel, other.titel);
    }








}