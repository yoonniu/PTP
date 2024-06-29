package thingyCollector;

import java.util.*;
import _untouchable_.thingy.*;

public class Collector implements Collector_I{
	
	HashSet<Item> itemSet;
	Queue <Item> queue;
	ArrayList<Item> collectedItems;
	boolean valid = true;
	
	public Collector() { //erzeugt einen Collector
		
		itemSet = new HashSet<>();
        queue = new LinkedList<>();
	}

	@Override
	public Collection<Item> process(Item item) {
		
		checkValidity(item); 
		if (!valid) {
			valid = true; //set boolean to true for next item
			return null;
		}
		
		if (itemSet.contains(item)) { //add item to queue if its in set
			queue.add(item);
		}
			itemSet.add(item);
		
		if (itemSet.size()>= 5) { 
			
			collectedItems = new ArrayList<>(itemSet);
			itemSet.clear();
			fillUp(); //fill set with duplicates
				
			return collectedItems;
			

		}
		return null;
	}
	@Override
	public void reset () {
		
		itemSet.clear();
		queue.clear();
		collectedItems.clear();
	}
	
	//check if item or one of its features is null
	public void checkValidity(Item item) {
		
		if (item == null) {valid = false;}
		if (item.getColor() == null) {valid = false;}
		if (item.getSize() == null) {valid = false;}
		if (item.getWeight() == null) {valid = false;}
		if (item.getValue() == null) {valid = false;}	
	}
	
	//add items from queue to set
	public void fillUp () {
		
		for (int i = 0; i < queue.size(); i++) {
			
			Item item = queue.poll();
			itemSet.add(item);	
		}
	}
}
