public interface QueueInterface<T> {

    public void enqueue(T item);
    public T dequeue();
    public boolean isFull();
    public boolean isEmpty();
    public T peek();
}
