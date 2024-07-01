package multiPurposeList;

public class Node<T> {
	
	T info;
    Node<T> prev;
    Node<T> next;
    int position;
    
    //Constructor
    public Node(T info){
    	this.info = info;
    	this.next = null;
    	this.prev = null;
    	this.position = position;
    	}
	
//	T info;
//	Node next;
//	int position;
//	
//	//constructor
//	public Node (T info) {
//		this.info = info;
//		this.next = null;
//		this.position = position;
//	}

}
