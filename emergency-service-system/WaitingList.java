//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 01
// Practical Number: 06
//===================================


//class WaitingList
public class WaitingList {
    protected Node head;
    protected int numNodes;

    //constructor WaitingList
    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     * @return the patient popped from the waiting list
     */
    public Patient popPatient() {
    	Node tmp;
        if(this.head == null){
            return null;
        }
        else{
            tmp = head;
            head = head.getNext();
            numNodes--;
            return tmp.getPatient();
        }
    }
    
    /**
     * This method will pop the patient based on their id
     */
    
    public Patient popPatientById(int id){
        Node tmp;
        Patient removePatient;
        // if we are removing the node in between
        Node previousPatient = null;
        if(head == null){
            return null;
        }
        else{
            tmp = this.head;
            removePatient = tmp.getPatient();
            while(tmp.getNext()!= null && tmp.getPatient().getId() != id){
            		previousPatient = tmp; 
                tmp = tmp.getNext();
                removePatient = tmp.getPatient();
            }
            if(tmp.getPatient().getId() == id && previousPatient == null){
                head = tmp.getNext();
                numNodes--;
            }
            if(tmp.getPatient().getId() == id && previousPatient !=null){
            		previousPatient.setNext(tmp.getNext());
                numNodes--;
            }
            return removePatient;     
        }
    }


    /**
     * This method will add patient into the waiting list according to the triage level
     * @param patient patient's data
     */
    public void addToList(Patient patient) {
    		Node newPatient = new Node(patient);
    		Node tmp;
        if(this.head == null){
            this.head = newPatient;
            numNodes++;
        }
        else{
            tmp = this.head.getNext();
            Node previousPatient = null;
            while(tmp != null && tmp.getPatient().getTriageLevel() >= patient.getTriageLevel()){
            		previousPatient = tmp;
            		tmp= tmp.getNext();   
            }	
            
            if(previousPatient != null){
            		previousPatient.setNext(newPatient);
                newPatient.setNext(tmp);
                
            }
             
        }
    }

    /**
     * print out the information for each patient in waiting list
     */
    public void printList() {
    		Node tmp = this.head;
        if(this.head == null){
            System.out.println("List  empty");
        }
        else{
            tmp.printNode();
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
                tmp.printNode();
            }
        }
    }

    /**
     * Check whether the patient is in this list or not
     * @return
     */
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while(temp != null) {
            if(temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
}
