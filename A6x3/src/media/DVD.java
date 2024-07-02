package media;

public class DVD extends Disc {
    
    String region = new String();
    
    public DVD (String name, Content datatype, Format region) {
        
        this.name = name;
        this.content = datatype;
        this.format = region;
        
    }

}
