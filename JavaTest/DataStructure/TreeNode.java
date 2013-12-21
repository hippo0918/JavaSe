public class TreeNode<T> {
	
	private TreeNode leftTreeNode;
	private TreeNode rightTreeNode;
	private T nodeValue;
	
	public TreeNode getLeftTreeNode() {
		return leftTreeNode;
	}
	
	public void setLeftNode(TreeNode leftTreeNode) {
		this.leftTreeNode = leftTreeNode;
	}
	
	
	public TreeNode getRightLeftNode() {
		return rightTreeNode;
	}
	
	public void setRightTreeNode(TreeNode rightTreeNode) {
		this.rightTreeNode = rightTreeNode;
	}
	
	public void setNodeValue(T nodeValue) {
		this.nodeValue = nodeValue;
	}
	
	public T getNodeValue() {
		return nodeValue;
	}
	
	public String toString() {
		
	}
}