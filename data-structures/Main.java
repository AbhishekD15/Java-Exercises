//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 01
// Practical Number: 06
//===================================
public class Main {
    public static void main(String[] args){
    	  String input = "(1+2) * {{2+3)*(3+4}}";  
    	  
    	  MyQueue queue = new MyQueue();
    	  queue.enqueue(new Node("2"));
    	  queue.enqueue(new Node("9"));
    	  queue.enqueue(new Node("7"));
    	  queue.enqueue(new Node("4"));
    	  queue.enqueue(new Node("1"));
    	  System.out.println("===================================");
    	  queue.displayQueue();
    	  System.out.println();
    	  Main.reverseQueue(queue);
                             
    	  //pp.displayQueue();
      System.out.println("                                                 ");
      System.out.println("===================================");
    	  System.out.println("Result bracketsMatching: " + bracketsMatching(input));
      System.out.println("===================================");
      System.out.println();

    }
   	public static boolean bracketsMatching(String input){
   		MyStack my = new MyStack();
   		char x;

   		for (int i = 0 ; i<input.length();i++){
   			x = input.charAt(i);
   			String str = Character.toString(x);
   			Node you = new Node(str);
   			if(you.getData().equals("(")||you.getData().equals(")")||you.getData().equals("{")||you.getData().equals("}")){
   				if(my.isEmpty()){
   					my.push(you);
   				}
   				else if(my.peek().getData().equals("(")&&you.getData().equals(")")){
   					my.pop();
   				}
   				else if(my.peek().getData().equals("{")&&you.getData().equals("}")){
   					my.pop();
   				}
   				else{
   					my.push(you);
   				}
   			}
   		}

   		return my.isEmpty();	 
   	}
   		
    public static MyQueue reverseQueue(MyQueue queue1){
      MyQueue queue2 = new MyQueue();
      MyStack st = new MyStack();
      System.out.println("===================================");
      while(queue1.isEmpty() == false) {
        System.out.print("Elements in queue: ");
        String tmp = queue1.dequeue();
        Node ntmp = new Node(tmp);
        System.out.println(tmp);
        st.push(ntmp);
      }

        System.out.println("===================================");    
        while(st.isEmpty() == false){
        System.out.print("Elements in the stack: ");
        Node tmp1 = st.pop();
        tmp1.setNext(null);
        System.out.println(tmp1.getData());
        queue2.enqueue(tmp1);
      }
      System.out.println("==================================="); 
      System.out.println("Reversing the Queue: ");
      queue2.displayQueue();
      return queue2;
      
  } 	
}