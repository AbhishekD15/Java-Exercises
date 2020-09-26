
public class Doctor extends Person {
	String speciality;

	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	/**
	 * @param givenName
	 * @param lastname
	 */
	public Doctor(String givenName, String lastname) {
		super(givenName,lastname);
		System.out.println("Name of the docor: "+givenName+" "+lastname);
	}
	
	/**
	 * non parameterised constrcutor
	 */
	public Doctor() {
		System.out.println("Inside Doctor class");
		
	}
	
	

}
