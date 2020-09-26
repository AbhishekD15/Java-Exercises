//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 01
// Practical Exam Number: 05
//===================================

//class Queue
class Queue {
	Node back;


	//accessors and mutators
	public void setBack(Node back){
		this.back=back;
	}


	public Node getBack(){
		return back;
	}


	//basic constructor
	Queue(){
		this.back = null;
	}


	//method enqueue
	public void enqueue(Student tmpStudent){
		Node node = new Node(tmpStudent);
		if(this.back != null ){     //check if the queue is not empty
			node.next = this.back;
			this.back = node;

		} else{
			this.back = node;
		}
	}

	//method dequeue
	public void dequeue(){
		if(this.back != null){		//check if the queue is not empty
			if(this.back.next != null){
				Node tmp = this.back;
				Node prev = null;
				while(tmp.next != null){
					prev = tmp;
					tmp = tmp.next;
				}
				prev.next = null;

			} else{
				this.back = null;
			}

		}
	}


	//method display to print student info
	public void displayQueue(){
		int counter=1;
		String s;
		if(this.back != null){
			Node tmp = this.back;
			do{
				System.out.println("#"+counter+" "+tmp.info.getName()+","+tmp.info.getAge()+" years old,"+tmp.info.getPeriod()+"st year in Hogwarts ;");
				tmp = tmp.next;
				counter++;
			}while(tmp != null);
		}
		System.out.println();
	}

	
}