
public class Lecturer extends Person {
	private double salary;
	private String[] disciplines;
	
	
	
	
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
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
	 * @param givenName
	 * @param lastname
	 */
	public Lecturer(String givenName, String lastname) {
		super(givenName,lastname);
		System.out.println("Name of the lecturer: "+givenName+" "+lastname);
	}
	/**
	 * non parameterised constrcutor
	 */
	public Lecturer() {
		System.out.println("Inside Lecturer class");
	}
	/**
	 * method to calculate annual salary
	 */
	public double annualSalary(double salary) {
		return salary*12;
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
