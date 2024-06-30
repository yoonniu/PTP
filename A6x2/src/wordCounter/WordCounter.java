package wordCounter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
	
	private Map<Word,Counter> wordMap = new HashMap<Word, Counter>();
    
    public void printStatistic(String text) {
    	
    final WordGrabber wg = new WordGrabber(text);
    
    while (wg.hasNext()) {
    	String newWord = wg.next();
    	Word word = new Word(newWord);
    	
    	if (!wordMap.containsKey(word)) {
    		//new counter
    		Counter counter = new Counter();
    		wordMap.put(word, counter);
    	}else {
    		//increase counter 
    		Counter counter = wordMap.get(word);
    		counter.inc();
    	}
    }	
    	if (!wg.hasNext()) {
    		
    		List<Word> keys = new ArrayList<Word>(wordMap.keySet());

            // Sort the keys lexicographically
            Collections.sort(keys);

            // Print the sorted keys and their values
            for (Word key : keys) {
            	
            	//System.out.println(key + ":" +  wordMap.get(key));
            	System.out.printf("[ %s ] : %s\n", key,wordMap.get(key) );
            }
    	}
    	
    }

}
