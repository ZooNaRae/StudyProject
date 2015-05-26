package Doubly_Linked_List;

class LinkNode {
	
	private int iData;
	private LinkNode nodeNext;
	private LinkNode nodePrevious;
	
	public LinkNode(int iDataInput) {
		iData = iDataInput;
	}
	
	public void displayNode() {
		System.out.print(iData);
	}
	
	public int getData() {
		return iData;
	}
	
	public void setData(int inputData) {
		iData = inputData;
	}
	
	public LinkNode getNodeNext() {
		return nodeNext;
	}
	
	public void setNodeNext(LinkNode inputNode) {
		nodeNext = inputNode;
	}
	
	public LinkNode getNodePrevious() {
		return nodePrevious;
	}
	
	public void setNodePrevious(LinkNode inputNode) {
		nodePrevious = inputNode;
	}
}