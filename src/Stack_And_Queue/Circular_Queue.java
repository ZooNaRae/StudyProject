package Stack_And_Queue;

class Circular_Queue {
	
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	
	public Circular_Queue(int size) {
		maxSize = size + 1;
		queueArray = new long[maxSize];
		front = 0;
		rear = -1;
	}
	
	public boolean insert(long item) {
		if(isFull()) {
			System.out.println("queue is full");
			return false;
		} else {
			if(rear == maxSize - 1)
				rear = -1;
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
			if(front == maxSize)
				front = 0;
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
		return ((front - 2 == rear) || (front + maxSize - 2 == rear));
	}
	
	public boolean isEmpty() {
		return ((front - 1 == rear) || (front + maxSize - 1 == rear));
	}
	
	public int size() {
		if(isEmpty())
			return(0);
		else if(rear >= front)
			return (rear - front + 1);
		else
			return ((maxSize - front) + (rear + 1));
	}
}