//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 01
// Practical Number: 06
//===================================


//class ServiceCenter
public class ServiceCenter {
    private WaitingList awl;
    
    //constructor ServiceCenter
    public ServiceCenter() {
        this.awl = new WaitingList();
    }

    /**
     * Record patient's data and add the patient into waiting list
     * @param name
     * @param phoneNumber
     * @param triageLevel
     * @param location
     */
    public void addPatientIntoList(String name, String phoneNumber, int triageLevel, String location) {
        Patient patient = new Patient(name, phoneNumber, triageLevel, location);
        if(this.awl.isInList(patient)){
            System.out.println(patient.getName() + " is in waiting list. ");
        }else{
            this.awl.addToList(patient);
            System.out.println("Add " + patient.getName() + " into waiting list. ");
        }
    }

    /**
     * Pop out the first patient in the waiting list and assign an Ambulance for him/her
     * @return the patient object
     */
    public Patient assignAmbulanceForPatient() {
        // TODO: The tester report that the system will crash when waiting list is empty
        Patient patient = this.awl.popPatient();
        if(patient != null )
        		System.out.println("Assigned an ambulance for patient: " + patient.getName());
        else
        		System.out.println("No Ambulance assigned");
        return patient;
    }
    
    /*
     * this method assigns ambulance for the patient based on their id
     */
    
    public Patient assignAmbulanceForPatientById(String id){
        
        if(awl.head == null){
            System.out.println("Waiting list is empty");
            return null;
        }
        else if(awl.head.getPatient().getId() == (Integer.parseInt(id))){
            System.out.println("Success! an ambulance is assigned for patient"+id);
            Node tmp = awl.head;
            awl.head = awl.head.getNext();
            return tmp.getPatient();
        }
        else{
            Node tmp = awl.head;
            while(tmp.getNext() != null && tmp.getNext().getPatient().getId() == (Integer.parseInt(id))){
                tmp = tmp.getNext();
            }
            if(tmp.getNext() == null){
                System.out.println("The doesn't exist");
            }
            if(tmp.getNext().getPatient().getId() == (Integer.parseInt(id))){
                System.out.println("Success! an ambulance is assigned for patient" +id);
                tmp.setNext(tmp.getNext());
            }
            return tmp.getNext().getPatient();
        }
    }
    /*
     * checkPositionById take patient's id and count and return the number of 
     * patient before them
     */
    public void checkPositionById(String id){
        if(awl.head == null){
            System.out.println("Waiting list is empty");
        }
        else if(awl.head.getPatient().getId() == (Integer.parseInt(id))){
            System.out.println("There is 0 patient before this id"+id);
        }
        else{
            Node tmp = awl.head;
            int counter = 1;
            while(tmp.getNext() != null && tmp.getNext().getPatient().getId() != (Integer.parseInt(id))){
                counter++;
                tmp = tmp.getNext();
            }
            if(tmp.getNext() == null){
                System.out.println("This Id doesn't exists");
                counter--;
            }
            if(counter == 1){
                System.out.println("There is "+counter+" patient before patient"+id);
            }
            else if(counter > 1){
                System.out.println("There is "+counter+" patient before patient"+id);
            }
        }
    }

    /**
     * Print out the waiting list
     */
    public void printWaitingList(){
        if(this.awl.head != null){
            this.awl.printList();
        }
        else{
            System.out.println("Error! the waiting list is empty");
        }
    }
}
