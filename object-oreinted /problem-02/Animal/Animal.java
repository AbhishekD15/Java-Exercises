
public class Animal {
	public String name;
	public double weight;
	public String favouriteFood;
	public int age;
	
	/**
	 * non parameterised constructor
	 */
	public Animal() {
		name="";
		weight=0;
		favouriteFood="";
		age=0;
	}
	/**
	 * @param name
	 * @param weight
	 * @param favouriteFood
	 * @param age
	 */
	public Animal(String name, double weight, String favouriteFood) {
		this.name = name;
		this.weight = weight;
		this.favouriteFood = favouriteFood;
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

}
