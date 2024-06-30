package wordCounter;

public class Counter {
	
	private int count;
	
	public Counter() {this.count = 1;}

    public int getCount() {return count;}

    public void inc() {this.count++;}
    
    @Override
	public String toString() {
		return String.valueOf(count);
    }
}


