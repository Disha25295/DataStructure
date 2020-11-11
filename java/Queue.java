public class Queue{
    private int capacity;
    int arr[];
    int front;
    int rear;
    int currentSize=0;

public Queue (int sizeOfQueue) { 
    this.capacity = sizeOfQueue;
    rear = -1;
    front = 0;
    arr = new int[this.capacity];
}

public void enqueue(int data) {
    if(isFull()) { 
        System.out.println(" The stack is full, cannot enqueue");
        }
        else{
            rear ++;
            if(rear == capacity -1){
                rear=0;
            }
        arr[rear]= data;
        currentSize ++;
        System.out.println(" data added are " + data);
    }
}
    public void dequeue(){
        if(isEmpty()) {
            System.out.println(" Cannot dequeue since it is empty");
        }else{
            front ++;
            if (front == capacity -1){
            System.out.println(arr[front - 1] + " removed from array");
            front =0;
            } else {
            
                System.out.println(arr[front - 1] + " removed from array");
            }
            currentSize--;
        }
            
        }
    public boolean isFull() {
		if (currentSize == capacity) {
			return true;
		}
		return false;
	}
	public boolean isEmpty() {
 
		if (currentSize == 0) {
			return true;
		}
		return false;
	}
 
	public static void main(String a[]) {
		Queue queue = new Queue(5);
		queue.enqueue(6);
		queue.dequeue();
		queue.enqueue(3);
		queue.enqueue(99);
		queue.enqueue(56);
		queue.dequeue();
		queue.enqueue(43);
		queue.dequeue();
		queue.enqueue(89);
		queue.enqueue(77);
		queue.dequeue();
		queue.enqueue(32);
		queue.enqueue(2);
        }
        }