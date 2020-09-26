
public class Test {

	public static void main(String[] args) {
		Person object = new Person();
		Student object1 = new Student();
		Student object2 = new Student("Abhishek","Das");
		object2.setMarks(new double[] {90,99,93});
		
		double average=object2.averageMarks(new double[] {90,99,93});
		System.out.println("Average marks of the student:"+average);
		object2.displayDisciplines(new String[] {"COMP SCIENCE","MATHS","ARTS"});
		
		Lecturer object3 = new Lecturer();
		Lecturer object7 = new Lecturer("Rafa","felix");
		
		object3.setSalary(1000);
		double grossSalary=object3.annualSalary(1000);
		System.out.println("Annual salary of the lecturer is:"+grossSalary);
		object3.setDisciplines(new String[] {"LITERATURE","ENGINEERING","ACCOUNTING"});
		object3.displayDisciplines(new String[] {"LITERATURE","ENGINEERING","ACCOUNTING"});
		
		Doctor object6 = new Doctor();
		Doctor object4 = new Doctor("Rahul","Patel");
		object4.setSpeciality("Surgeon");
		String major=object4.getSpeciality();
		System.out.println("He is a "+major);
		
		Patient object8 = new Patient();
		Patient object5 = new Patient("Sam","Wilson");
		object5.setInTime("11:00");
		object5.setPrevTime("22:00");
		String checkIn = object5.getInTime();
		String checkOut = object5.getPrevTime();
		System.out.println("Check-in time: "+checkIn+"\nCheck-out time: "+checkOut);
		object5.setDiagnostic("Heart Attack");
		String report=object5.getDiagnostic();
		System.out.println("The patient is suffering from "+report);
		

	}

}
