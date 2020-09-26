
public class Person {
	
	public String givenName;
	public String lastname;
	private int age;
	private String gender;
	private String citizenship;
	
	//Default constructor
	public Person() {
		givenName = " ";
		lastname = " ";
		age = 0;
		gender = " ";
		citizenship = " ";
		System.out.println("This will print if variables are not initialised");
	}

	/**
	 * @param givenName
	 * @param lastname
	 * @param age
	 * @param gender
	 * @param citizenship
	 */
	public Person(String givenName, String lastname ) {
		this.givenName = givenName;
		this.lastname = lastname;
		System.out.println("Name of the person is: "+givenName+" "+lastname);
		
	}
	

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the citizenship
	 */
	public String getCitizenship() {
		return citizenship;
	}

	/**
	 * @param citizenship the citizenship to set
	 */
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person object2 = new Person("Abhishek","Das");
		object2.setAge(24);
		object2.setGender("male");
		object2.setCitizenship("Indian");
		System.out.println("Age of the person is: "+object2.getAge() );
		System.out.println("Gender of the person is: "+object2.getGender());
		System.out.println("He is: "+object2.getCitizenship());
	}

}
