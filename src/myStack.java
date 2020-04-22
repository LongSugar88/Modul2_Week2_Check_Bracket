public class myStack<T> {
    private int capacity;
    private Object[] myArray;
    private int currentSize;

    myStack(int size){
        myArray = new Object[size];
        this.capacity = size;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }
    public boolean isFull(){
        return currentSize == capacity;
    }
    public void ensureCapacity(){
        if(isFull()){
            Object[] newArray = new Object[capacity*2];
            for (int i=0; i<currentSize; i++){
                newArray[i] = myArray[i];
            }
            myArray = newArray;
        }
    }
    public void push(T element){
        ensureCapacity();
        myArray[currentSize] = element;
        currentSize++;
    }
    public T pop(){
        currentSize--;
        return (T) myArray[currentSize];
    }
    public T peek(int index){
        return (T) myArray[currentSize-1];
    }
    public int size(){
        return currentSize;
    }
}
