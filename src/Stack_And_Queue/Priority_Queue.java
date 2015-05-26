package Stack_And_Queue;

class Priority_Queue{
	
	private int maxSize;
	private long[] queueArray;
	private int nItems;
	
	public Priority_Queue(int size) {
		maxSize = size;
		queueArray = new long[maxSize];
		nItems = 0;
	}
	
	public boolean insert(long item) {
		int j;
		
		if(isFull()) {
			System.out.println("queue is full");
			return false;
		}
		if(isEmpty()) {
			queueArray[nItems++] = item;
		} else {
			for(j = nItems - 1; j >= 0; j--) {
				if(item > queueArray[j])
					queueArray[j + 1] = queueArray[j];
				else 
					break;
			}
			queueArray[j + 1] = item;
			nItems++;
		}
		return true;
	}
	
	public boolean remove(long item[]) {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return false;
		} else {
			item[0] = queueArray[--nItems];
			return true;
		}
	}
	
	public boolean peekMin(long item[]) {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return false;
		} else {
			item[0] = queueArray[nItems - 1];
			return true;
		}
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
}