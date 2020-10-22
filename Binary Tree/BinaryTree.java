public class BinaryTree{

	private static class Node {

		Item reg ;
		Node left , right ;
	}

	private Node root;
	private long comparisons;

	public BinaryTree(){
		this.root = null;
		this.comparisons = 0;
	}

	public Item search (Item reg){
		return this.search(reg , this.root);
	}

	public void insert(Item reg){
		this.root = this.insert(reg , this.root);
	}

	public long getComparisons(){
		return this.comparisons;
	}
	//search for an Item and count how many comparisons were made.
	private Item search(Item reg , Node p){
		this.comparisons++;

		if(p == null)
			return null;

		else if(reg.compare(p.reg) < 0)
			return search(reg , p.left);

		else if(reg.compare(p.reg) > 0)
			return search(reg , p.right);

		else return p.reg;
	}

	private Node insert(Item reg , Node p){
		if(p == null){
			p = new Node();
			p.reg = reg;
			p.left = null;
			p.right = null;
		}

		else if(reg.compare(p.reg) < 0)
			p.left = insert(reg, p.left);
		else if(reg.compare(p.reg) > 0)
			p.right = insert(reg , p.right);
		else System.out.println("Error: This register already exists");

		return p;
	}
}