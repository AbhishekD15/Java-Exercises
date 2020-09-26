//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 01
// Practical Number: 06
//===================================
public class Node {
	private Node next;
	private String data;
	private char character;
	
	
	public Node(char current) {
		this.character=current;
		this.next=null;
		
	}
	
	public Node(String data) {
		this.data=data;
		this.next=null;
		
	}
	
	Node(String data, Node next){
		this.data=data;
		this.next=next;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public void printNode() {
		System.out.print(this.data+" ");
	}
	

}



