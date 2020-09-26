//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 01
// Practical Exam Number: 05
//===================================

//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 01
// Practical Exam Number: 05
//===================================

//class Node
public class Node{
	Node next;
	Student info; //attribute info of Student type


	//accessors and mutators

	public void setNext(Node next){
		this.next=next;
	}

	public Node getNext(){
		return next;
	}

	public void setInfo(Student info){
		this.info=info;
	}

	public Student getInfo(){
		return info;
	}


	//Basic Constructor 
	public Node(){
		this.next = null;
		this.info = null;
	}

	//constructor with paramenters to initialise student info
	public Node(Student tmpStudent){
		this.next=null;
		this.info=tmpStudent;
	}


}

