
public class Student extends Person {
	
	private double[] marks;
	private String[] disciplines;
	
	/**
	 * @param givenName
	 * @param lastname
	 */
	public Student(String givenName, String lastname ) {
		super(givenName,lastname);
		System.out.println("Name of the student is: "+givenName+" "+lastname);
		
	}
	
	/**
	 * non parameterised constrcutor
	 */
	public Student() {
		
		System.out.println("Inside Student class");
		
	}


	/**
	 * @return the marks
	 */
	public double[] getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(double[] marks) {
		this.marks=marks;
		
	}
	

	/**
	 * @return the disciplines
	 */
	public String[] getDisciplines() {
		return disciplines;
	}

	/**
	 * @param disciplines the disciplines to set
	 */
	public void setDisciplines(String[] disciplines) {
		this.disciplines = disciplines;
	}

	/**
	 * method to calculate average marks
	 */
	public double averageMarks(double[] marks) {
		double sum=0;
		for(int i = 0; i < marks.length; i++) {
			 sum = sum + marks[i];
		}
		return sum/marks.length;
	}
	
	/**
	 * method to display disciplines
	 */
	public void displayDisciplines(String[] disciplines) {
		System.out.println("List of the Disciplines:");
		for(int i = 0;i < disciplines.length; i++) {
			System.out.println(disciplines[i]+" ");
		}
	}	
	
	
	

}
