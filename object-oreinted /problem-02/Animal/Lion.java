
public class Lion extends Animal {
	/**
	 * non parameterised constructor
	 */
	public Lion() {
		System.out.println("Inside lion class");
	}
	/**
	 * @param name
	 * @param weight
	 * @param favouriteFood
	 * @param age
	 */
	public Lion(String name, double weight, String favouriteFood) {
		this.name = name;
		this.weight = weight;
		this.favouriteFood = favouriteFood;
		System.out.println("Name: "+name+"\nWeight: "+weight+"lb"+"\nFavourite Food: "+favouriteFood);
	}
	
	public void makeSound() {
		System.out.println("ROAR...");
	}

}
