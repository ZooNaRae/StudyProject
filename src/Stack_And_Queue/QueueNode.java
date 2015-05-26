package Stack_And_Queue;

class QueueNode {
	
	public long queueItem;
	public QueueNode link;
	
}

class QueueList{
	
	private QueueNode front;
	private QueueNode rear;
	
	public QueueList() {
		front = null;
		rear = null;
	}
	
	public void insert(long item) {
		QueueNode newNode = new QueueNode();
		newNode.queueItem = item;
		newNode.link = null;
		if(isEmpty()) {
			rear = newNode;
			front = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
	}
	
	public boolean remove(long item[]) {
		if(isEmpty()){
		System.out.println("queue is empty");
		return false;
		} else {
			item[0] = front.queueItem;
			front = front.link;
			if(front == null)
				rear = null;
			return true;
		}
	}
	
	public boolean peek(long item[]) {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return false;
		} else {
			item[0] = front.queueItem;
			return true;
		}
	}
	
	public boolean isEmpty() {
		return(front == null);
	}
}