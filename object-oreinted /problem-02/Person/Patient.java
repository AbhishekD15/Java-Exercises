
public class Patient extends Person {
	private String diagnostic;
	private String inTime;
	private String prevTime;
	/**
	 * @return the diagnostic
	 */
	public String getDiagnostic() {
		return diagnostic;
	}
	/**
	 * @param diagnostic the diagnostic to set
	 */
	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}
	/**
	 * @return the inTime
	 */
	public String getInTime() {
		return inTime;
	}
	/**
	 * @param inTime the inTime to set
	 */
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	/**
	 * @return the prevTime
	 */
	public String getPrevTime() {
		return prevTime;
	}
	/**
	 * @param prevTime the prevTime to set
	 */
	public void setPrevTime(String prevTime) {
		this.prevTime = prevTime;
	}
	/**
	 * @param givenName
	 * @param lastname
	 */
	public Patient(String givenName, String lastname) {
		super(givenName,lastname);
		System.out.println("Name of the patient"+givenName+" "+lastname);
	}
	/**
	 * non parameterised constrcutor
	 */
	public Patient() {
		System.out.println("Inside patient class");
		
	}

	
}
