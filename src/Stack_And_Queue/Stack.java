package Stack_And_Queue;
//배열을 이용한 스택
public class Stack {

	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		maxSize = size;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	public boolean push(long item) {
		if(isFull()) {
			System.out.println("stack is full");
			return false;
		} else {
			stackArray[++top] = item;
			return true;
		}
	}
	
	public boolean pop(long item[]) {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return false;
		} else {
			item[0] = stackArray[top--];
			return true;
		}
	}
	
	public boolean peek(long item[]) {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return false;
		} else {
			item[0] = stackArray[top];
			return true;
		}
	}
	
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	public boolean isEmpty() {
		return (top == - 1);
	}
}