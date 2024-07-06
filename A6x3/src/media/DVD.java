package media;

import java.util.Objects;

public class DVD extends Disc {
    // TODO basistypen aus Disk sollen genutzt werden, done
    private Format format; 

    public DVD(String titel, Content content, Format format) {
        super(titel, content);
        this.format = format;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(format);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        DVD other = (DVD) obj;
        return format == other.format;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " %s , %s", DVD.class.getSimpleName(), format);
    }
}
