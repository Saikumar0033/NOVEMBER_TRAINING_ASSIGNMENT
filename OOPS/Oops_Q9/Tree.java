package Oops_Q9;

public class Tree {
	
	int treeNo;
	private static int count;
	
	Tree(int treeNo){
		this.treeNo =treeNo;
		count++;
	}
	
	public int getCount() {
		return count;
	}

}
