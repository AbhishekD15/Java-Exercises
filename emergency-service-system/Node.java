//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 01
// Practical Number: 06
//===================================

//Node class
public class Node {
    protected Node next;
    protected Patient patient;
    
    //Node constructor
    public Node(Patient patient) {
        this.patient = patient;
        this.next = null;
    }
    
    //accessors and mutators
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    //method printNode to print patient's data
    public void printNode() {
    		System.out.println("Id: "+this.patient.getId()+"\nName: "+this.patient.getName()+"\nPatient: "+this.patient.getTriageLevel());
    		
    }
}
