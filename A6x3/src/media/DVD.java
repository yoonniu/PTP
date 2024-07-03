package media;

import java.util.Objects;

public class DVD extends Disc {
    Format format;
    Content content; 
    String titel;
    public DVD(String titel, Content content, Format format) {
        super(titel, content);
        this.format = format;
        this.content = content;
        this.titel = titel;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(content, format, titel);
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
        DVD other = (DVD) obj;
        return content == other.content && format == other.format && Objects.equals(titel, other.titel);
    }




}