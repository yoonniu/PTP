package media;

public class Disc {
    
    
    
    String name = new String();
    Content content;
    Format format;
    
    
    @Override
    public boolean equals(Object o) {
        Disc od = (Disc) o;
        return (this.name.equals(od.name));
    }

}
