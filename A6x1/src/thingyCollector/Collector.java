package thingyCollector;

import java.util.*;
import _untouchable_.thingy.*;

public class Collector implements Collector_I{
	
	HashSet<Item> itemSet = new HashSet<Item>();
	Queue <Item> queue = new PriorityQueue<Item>();
	
	public Collector() { //erzeugt einen Collector
		
		itemSet = new HashSet<>();
        queue = new LinkedList<>();
	}

	@Override
	public Collection<Item> process(Item item) {
		
		assert (item == null) : "Item is not valid";
		
		if (!itemSet.contains(item)) {
			itemSet.add(item);
			queue.add(item);
		}else {
			
			//erstelle neue Queue von gleichen Items
		}
		
		if (itemSet.size()>= 5) {
			
			ArrayList<Item> collectedItems = new ArrayList<>(itemSet);
			return collectedItems;
			
			//TODO Items sollen aus queue rausgenommen werden
			//TODO wenn Queues leer sind > aus Hashmap rausnehmen
		}
		return null;
	}
	@Override
	public void reset () {
		
		itemSet.clear();
		queue.clear();
	}
}


//package thingyCollector;
//
//import java.util.*;
//import _untouchable_.thingy.*;
//
//public class Collector implements Collector_I {
//
//    // Using a HashMap to maintain lists of duplicates for each item
//    private Map<Item, List<Item>> itemMap;
//    private LinkedList<Item> distinctItemsList;
//
//    public Collector() {
//        itemMap = new HashMap<>();
//        distinctItemsList = new LinkedList<>();
//    }
//
//    @Override
//    public Collection<Item> process(Item item) {
//        if (item == null) {
//            throw new IllegalArgumentException("Item cannot be null");
//        }
//
//        // Add item to the map and manage duplicates
//        itemMap.putIfAbsent(item, new ArrayList<>());
//        itemMap.get(item).add(item);
//
//        // Add item to distinct items list if it's the first time it's seen
//        if (itemMap.get(item).size() == 1) {
//            distinctItemsList.add(item);
//        }
//
//        // If we have collected 5 distinct items, return them
//        if (distinctItemsList.size() >= 5) {
//            List<Item> collectedItems = new ArrayList<>(distinctItemsList.subList(0, 5));
//
//            // Remove only one set of distinct items from the distinct items list
//            for (Item collectedItem : collectedItems) {
//                if (itemMap.get(collectedItem).size() == 1) {
//                    itemMap.remove(collectedItem);
//                } else {
//                    itemMap.get(collectedItem).remove(0);
//                }
//                distinctItemsList.remove(collectedItem);
//            }
//            return collectedItems;
//        }
//
//        return null;
//    }
//
//    @Override
//    public void reset() {
//        itemMap.clear();
//        distinctItemsList.clear();
//    }
//}
