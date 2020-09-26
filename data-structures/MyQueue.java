//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 01
// Practical Number: 06
//===================================
public class MyQueue{
	private Node front;
	private Node rear;

	//MyQueue default constructor 
	public MyQueue(){
		this.setFront(null);
		this.setRear(null);
	}
	
	//MyQueue parameterized constructor 
	public MyQueue(Node front, Node rear){
		this.setFront(front);
		this.setRear(rear);
	}
	
	//accessors and mutators
	public Node getFront(){
		return this.front;
	}

	public void setFront(Node front){
		this.front = front;
	}

	public Node getRear(){
		return this.rear;
	}

	public void setRear(Node rear){
		this.rear = rear;
	}
	
	//method enqueue
	public void enqueue(Node node){
		Node tmp = front;
		if(tmp == null){
			front = node;
			rear = node;
		} else {
			while(tmp.getNext()!= null){      		
				tmp = tmp.getNext();	
			}
			tmp.setNext(node);
			rear = node;
		}
	}
	
	//method dequeue
	public String dequeue(){
		if( front == null){
			System.out.println("Queue empty");
			return null;
		}
		String temp = front.getData();
        front = front.getNext();
   		return  temp;
	}

	public boolean isEmpty(){
		if( front == null){
			return true;
		}
		return false;
	}
	
	/*
	 * diplayQueue method to print 
	 * the elements in the queue
	 */
	public void displayQueue(){
		if(front == null){
  			System.out.println("Queue empty");
		}
		else{
			Node tmp = front;
			while(tmp != null){
      		tmp.printNode();
			tmp = tmp.getNext();
      			
			}
		}
	}
}