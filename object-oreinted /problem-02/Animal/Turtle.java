
public class Turtle extends Animal {
	
	/**
	 * non parameterised constructor
	 */
	public Turtle() {
		System.out.println("Inside turtle class");
	}
	/**
	 * @param name
	 * @param weight
	 * @param favouriteFood
	 * @param age
	 */
	public Turtle(String name, double weight, String favouriteFood) {
		this.name = name;
		this.weight = weight;
		this.favouriteFood = favouriteFood;
		System.out.println("Name: "+name+"\nWeight: "+weight+"lb"+"\nFavourite Food: "+favouriteFood);
	}
	
	public void makeSound() {
		System.out.println("GRUNT...");
	}


}
