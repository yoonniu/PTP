package multiPurposeList;

public class MultiPurposeList<T> implements MultiPurposeList_I<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MultiPurposeList(){
        this.head = null;
        this.tail = null;
        size = 0;
    }

    //20_22 page 59 am Anfang einfügen
    public void insert (T info) {
        assert null != info : "unsupported argument";
        Node<T> newNode = new Node<T> (info);
        newNode.next = head;
        if (null == head) {
            tail = newNode;
        }else {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    //20_22 page 76 am Ende einfügen
    public void append (T info) {
        assert null != info : "unsupported argument";
        Node<T> newNode = new Node<T> (info);

        if ( null == head ) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
    }
    @Override
    public boolean contains(T info) {
        return (iSearchNode(info)!= null);
    }

    @Override
    public T getNo(int requestedPosition) {

        Node<T> newNode = iGetNodeNo(requestedPosition);
        return newNode != null ? newNode.info : null; //check if Node exists
    }

    @Override
    public T extractNo(int requestedPosition) {

        Node<T> newNode = iGetNodeNo(requestedPosition);
        if (newNode == null) {
            return null;
        }
        T infoCopy = newNode.info;
        iRemoveNode(newNode);
        return infoCopy;

    }

    @Override
    public T setNo(int requestedPosition, T newinfo) {

        assert (requestedPosition>= 0 && requestedPosition <= size): "invalid requirements";

        final T infoCopy = iGetNodeNo(requestedPosition).info;
        iGetNodeNo(requestedPosition).info = newinfo;
        return infoCopy;

    }


    @Override
    public void putNo(int requestedPosition, T info) {
        //21_22 page 49
        assert null!= info: "invalid parameter - given information element is null";
        assert 0<= requestedPosition && requestedPosition <= size : "invalid parameter - given position is out of range";

        final Node<T> theNewNode = new Node<T>(info);

        if (size == 0) { //if list is empty
            head = theNewNode;
            tail = theNewNode;
        }else if(requestedPosition == 0) { //if added to the start
            head.prev = theNewNode;
            theNewNode.next = head;
            head = theNewNode;
        }else if(requestedPosition == size) { //if added to the end
            tail.next = theNewNode;
            theNewNode.prev = tail;
            tail = theNewNode;
        }else {
            Node<T> work;
            if (requestedPosition <= size >> 1) { //if position is in first half of the list
                work = head;
                for (int i= requestedPosition-1; --i>=0; ) {
                    work = work.next;
                }
            }else { //if position is in second half; going backwards
                work = tail;
                for (int i= size - requestedPosition; --i>=0; ) {
                    work = work.prev;
                }
            }
            final Node<T> predecessor = work;
            final Node<T> succesor = work.next;

            theNewNode.prev = predecessor;
            theNewNode.next = succesor;
            predecessor.next = theNewNode;
            succesor.prev = theNewNode;

        }
        size++;
    }
    @Override
    public boolean remove(T info) {

        final Node<T> toDeleteNode = iSearchNode(info);
        if (toDeleteNode != null) {
            iRemoveNode(toDeleteNode);
            return true;
        }
        return false; 
    }
    @Override
    public void removeNo(int requestedPosition) {
        
        assert (iGetNodeNo(requestedPosition) != null): "Node is null";
        iRemoveNode(iGetNodeNo(requestedPosition));
    }

    private Node<T> iSearchNode (T info) {
        assert null != info : "unsupported argument";
        //int position = 0;
        Node<T> current = head;
        while (null!= current && !current.info.equals(info)) {
            current = current.next;
            //position++;
        }
        return current;
    }
    //search for node that references information object at given index
    private Node<T> iGetNodeNo(int index) {

        assert (index > 0 || index <= size): "index out of bounds";

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    //remove node and confirm
    private boolean iRemoveNode(Node<T> node) {

        if (node == null) {
            return false;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }

        node.prev = null;
        node.next = null;
        size--;

        return true;
    }
    
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;

    }

}