package wordCounter;

public class Word implements Comparable<Word> {
	
	private String word;
	
	public Word(String word) {
        this.word = word.toLowerCase();
    }
	
	@Override
	public int hashCode() {
		return word.hashCode();
    }
	
	@Override
	public String toString() {
		return String.valueOf(word);
    }
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Word word1 = (Word) obj;

        return word.equals(word1.word);
	}
	@Override
	public int compareTo(Word other) {
		
		return this.word.compareTo(other.word);
	}
}



