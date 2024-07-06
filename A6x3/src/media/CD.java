package media;

import java.util.Objects;

public class CD extends Disc {
    
    private String interpret;
    
    public CD(String titel, Content content, String interpret) {
        super(titel, content);
        this.interpret = interpret;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(interpret);
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
        CD other = (CD) obj;
        return interpret.equals(other.interpret);
    }
    
    @Override
    public String toString() {
        return String.format(super.toString() + " %s , %s", CD.class.getSimpleName(), interpret);
    }
}
