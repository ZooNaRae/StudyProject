package Simple_Linked_List;

public class LinkNode {
	
	private int iData;
	private LinkNode nodeNext;
	
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
	
	
}