public class LinkedQueue<T> implements QueueInterface<T>{

    //a
    private LLNode<T> front;
    private LLNode<T> rear;
    private int numElements = 0;
    //c
    LinkedQueue(){

    }
    //m
	@Override
	public void enqueue(T item) {
	    LLNode<T> node = new LLNode<>(item);
		if (this.isEmpty()) {
		    front = node;
			rear = node;
		}else{
		    rear.setLink(node);
			rear = node;
		}
		numElements++;
	}

	@Override
	public T dequeue() {
        if(this.isEmpty()){
            System.out.println("List is Empty!");
            return null;
        }else{
            LLNode<T> popped = front;
            front = popped.getLink();
            numElements--;
            return popped.getInfo();
        }
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(front == null){
		    return true;
		}
		return false;
	}

	@Override
	public T peek() {
		return front.getInfo();
	}

	public int getNumElements(){
	    return this.numElements;
	}
}
