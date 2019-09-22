package playgroundUsers;

/*implement a stack using arrays*/

public class Stack {
	
	private int capacity;
	private int array[];
	private int top;
	
	public Stack(int capacity){
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
		
	}
	
	public void push(int item) {
		
		if(isFull())
		{
			throw new RuntimeException("Stack is full");
		}
		else array[++top] = item;
		
	}
	
	private boolean isFull() {
		// TODO Auto-generated method stub
		return top == capacity -1;
	}

	public int pop() {
		
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		else return array[top--];
		
	}
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	public int peek() {
		
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		else return array[top];
		
	}
	
	public static void main(String[] args) {
		
		Stack stack1 = new Stack(5);
		
		//Stack is empty so an runtime exception should be thrown
		System.out.println(stack1.pop());
		
		stack1.push(0);
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		
		//System.out.println("Exception thrown");
		//stack1.push(5);
		System.out.println(stack1.pop());
		
		System.out.println(stack1.peek());
		
	}
	
	
}
