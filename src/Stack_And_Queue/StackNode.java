package Stack_And_Queue;

class StackNode {
	
	public long stackItem;
	public StackNode link;
	
}

class StackList {
	
	private StackNode top;
	
	public StackList() {
		top = null;
	}
	
	public void push(long item) {
		StackNode newNode = new StackNode();
		newNode.stackItem = item;
		newNode.link = top;
		top = newNode;
	}
	
	public boolean pop(long item[]) {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return false;
		} else {
			item[0] = top.stackItem;
			top = top.link;
			return true;
		}
	}
	
	public boolean peek(long item[]) {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return false;
		} else {
			item[0] = top.stackItem;
			return true;
		}
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
}