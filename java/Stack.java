public class Stack {
	int size;
	int arr[];
	int top;
 
	Stack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
 
	public void push(int x) {
		if (!isFull()) {
			top++;
			arr[top] = x;
			System.out.println("Pushed element:" + x);
		} else {
			System.out.println("Stack is full !");
		}
	}
 
	public int pop() {
		if (!isEmpty()) {
			int y = top;
			top--;
			System.out.println("Popped element :" + arr[y]);
			return arr[y];
 
		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}
 
	public int peek() {
		if(!this.isEmpty())
                        return arr[top];
                else
                {
                        System.out.println("Stack is Empty");
                        return -1;
                }
	}
 
	public boolean isEmpty() {
		return (top == -1);
	}
 
	public boolean isFull() {
		return (size - 1 == top);
	}
 
	public static void main(String[] args) {
		Stack S = new Stack(10);
		S.pop();
		S.push(10);
		S.push(30);
		S.push(50);
		S.push(40);
		S.pop();
		S.pop();
		S.pop();
		System.out.println("=================");
	}
}