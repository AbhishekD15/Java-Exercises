//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 01
// Practical Number: 06
//===================================

public class MyStack{
	private Node top;
	
	//default constructor
	public MyStack(){
	
		this.setTop(null);
	}
	
	//Parameterized constructor
	public MyStack(Node top){
		this.setTop(top);
	}

	public Node getTop(){
		return this.top;
	}
	public void setTop(Node top){
		this.top = top;
	}
	
	//method push to push a node into stack
	public void push(Node node){
		node.setNext(top);
		top = node;
	}

	/*
	 * method pop to get and remove the top 
	 * node from this stack.
	 *  @return Null and print "Stack is empty" 
	 *  when the stack is empty
	 */
	public Node pop(){
		if(top == null){
			System.out.println("Stack empty");
			return null;
		}
		Node tmp = top;
        top = top.getNext();
   		return tmp;
	}

	/* 
	 * method peek to get the top node in 
	 * this stack
	 * @return Null and print "Stack is empty" 
	 * when the stack is empty
	 */
	public Node peek(){
		if(top == null){
			System.out.println("Stack empty");
			return null;
		}
		return top;
	}

	/*
	 * method isEmpty
	 * @return TRUE when the stack is empty, otherwise FALSE
	 */
	public boolean isEmpty(){
		if(top == null){
			return true;
		}
		return false;
	}
}