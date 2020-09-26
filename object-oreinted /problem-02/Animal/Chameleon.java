
public class Chameleon extends Animal {
	
	/**
	 * non parameterised constructor
	 */
	public Chameleon() {
		System.out.println("Inside chameleon class");
	}
	/**
	 * @param name
	 * @param weight
	 * @param favouriteFood
	 * @param age
	 */
	public Chameleon(String name, double weight, String favouriteFood) {
		this.name = name;
		this.weight = weight;
		this.favouriteFood = favouriteFood;
		System.out.println("Name: "+name+"\nWeight: "+weight+"lb"+"\nFavourite Food: "+favouriteFood);
	}
	
	public void makeSound() {
		System.out.println("HISS...");
	}


}


