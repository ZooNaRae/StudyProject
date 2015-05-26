package Simple_Linked_List;

class SimpleLinkedList_Main {
	
	private LinkSentinelNode HeaderNode;
	
	public SimpleLinkedList_Main() {
		HeaderNode = new LinkSentinelNode();
	}
	
	public void insetFirst(int iKey) {
		LinkNode nodeNew = new LinkNode(iKey);
		nodeNew.setNodeNext(HeaderNode.getNodeFirst());
		HeaderNode.setNodeFirst(nodeNew);
	}
	
	public void insetNode(int iKey) {
		LinkNode nodeNew = new LinkNode(iKey);
		LinkNode current = HeaderNode.getNodeFirst();
		LinkNode previous = null;
		while(current != null && iKey > current.getData()) {
			previous = current;
			current = current.getNodeNext();
		}
		if(previous == null) {
			HeaderNode.setNodeFirst(nodeNew);
		} else {
			previous.setNodeNext(nodeNew);
			nodeNew.setNodeNext(current);
		}
	}
	
	public LinkNode deleteFirst() {
		if(HeaderNode.isEmpty() == false) {
			LinkNode tempNode = HeaderNode.getNodeFirst();
			HeaderNode.setNodeFirst(HeaderNode.getNodeFirst().getNodeNext());
			return tempNode;
		} else return null;
	}
	
	public LinkNode deletNode(int iKey) {
		LinkNode current = HeaderNode.getNodeFirst();
		LinkNode previous = null;
		while(current != null && iKey != current.getData()) {
			previous = current;
			current = current.getNodeNext();
		}
		if(previous != null && current != null) {
			previous.setNodeNext(current.getNodeNext());
		} else if(previous == null && current != null) {
			HeaderNode.setNodeFirst(current.getNodeNext());
		}
		return current;
	}
	
	public LinkNode findNode(int iKey) {
		LinkNode current = HeaderNode.getNodeFirst();
		while(current.getData() != iKey) {
			current = current.getNodeNext();
		}
		return current;
	}
	
	public void displayList() {
		LinkNode current = HeaderNode.getNodeFirst();
		while(current != null) {
			current.displayNode();
			System.out.println("");
			current = current.getNodeNext();
		}
	}
}