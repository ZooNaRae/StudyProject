package Stack_And_Queue;

class Queue {
	
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	
	public Queue(int size) {
		maxSize = size;
		queueArray = new long[maxSize];
		front = 0;
		rear = -1;
	}
	
	public boolean insert(long item) {
		if(isFull()) {
			System.out.println("queue is full");
			return false;
		} else {
			queueArray[++rear] = item;
			return true;
		}
	}
	
	public boolean remove(long item[]) {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return false;
		} else {
			item[0] = queueArray[front++];
			return true;
		}
	}
	
	public boolean peek(long item[]) {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return false;
		} else {
			item[0] = queueArray[front];
			return true;
		}
	}
	
	public boolean isFull() {
		return(rear == maxSize - 1);
	}
	
	public boolean isEmpty() {
		return (front == rear + 1);
	}
}