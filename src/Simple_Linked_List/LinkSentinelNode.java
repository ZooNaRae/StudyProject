package Simple_Linked_List;

class LinkSentinelNode {
	
	private LinkNode nodeFirst;
	
	public LinkSentinelNode() {
		nodeFirst = null;
	}
	
	public LinkNode getNodeFirst() {
		return nodeFirst;
	}
	
	public void setNodeFirst(LinkNode inputNode) {
		nodeFirst = inputNode;
	}
	
	public boolean isEmpty() {
		return (nodeFirst == null);
	}
}