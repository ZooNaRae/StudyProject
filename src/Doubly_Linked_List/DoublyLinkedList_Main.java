package Doubly_Linked_List;

class DoublyLinkedList_Main {
	
	private LinkSentinelNode HeaderNode;
	
	public DoublyLinkedList_Main() {
		HeaderNode = new LinkSentinelNode();
	}
	
	public void insetNode(int iKey){
		LinkNode nodeNew = new LinkNode(iKey);
		LinkNode current = HeaderNode.getNodeFirst();
		LinkNode previous = null;
		
		while(current != null && iKey > current.getData()) {
			previous = current;
			current = current.getNodeNext();
		}
		if(HeaderNode.isEmpty() == true) {
			HeaderNode.setNodeFirst(nodeNew);
			nodeNew.setNodeNext(null);
			nodeNew.setNodePrevious(null);
		} else if(HeaderNode.getNodeFirst() == current) {
			nodeNew.setNodeNext(HeaderNode.getNodeFirst());
			HeaderNode.setNodeFirst(nodeNew);
			nodeNew.setNodePrevious(null);
		} else if(current == null) {
			previous.setNodeNext(nodeNew);
			nodeNew.setNodePrevious(previous);
			nodeNew.setNodeNext(null);
		} else {
			nodeNew.setNodeNext(previous.getNodeNext());
			previous.setNodeNext(nodeNew);
			nodeNew.setNodePrevious(previous);
			nodeNew.getNodeNext().setNodePrevious(nodeNew);
		}
	}
	
	public LinkNode deletNode(int iKey) {
		LinkNode current = HeaderNode.getNodeFirst();
		LinkNode previous = null;
		
		while(current != null && iKey != current.getData()) {
			previous = current;
			current = current.getNodeNext();
		}
		
		if(HeaderNode.getNodeFirst() == current) {
			HeaderNode.setNodeFirst(current.getNodeNext());
		} else if(current.getNodeNext() == null) {
			previous.setNodeNext(null);
		} else {
			previous.setNodeNext(current.getNodeNext());
			current.getNodeNext().setNodePrevious(previous);
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