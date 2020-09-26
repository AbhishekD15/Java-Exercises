public class Animal {
	private String name;
	private double weight;
	private String favouriteFood;
	private int age;
	
	public Animal() {
	
		System.out.println("This is normal constructor");
	}
	/**
	 * @param name
	 * @param weight
	 * @param favouriteFood
	 * @param age
	 */
	public Animal(String name, double weight, String favouriteFood, int age) {
		this.name = name;
		this.weight = weight;
		this.favouriteFood = favouriteFood;
		this.age = age;
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the favouriteFood
	 */
	public String getFavouriteFood() {
		return favouriteFood;
	}

	/**
	 * @param favouriteFood the favouriteFood to set
	 */
	public void setFavouriteFood(String favouriteFood) {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal object1 = new Animal();
		Animal object2 = new Animal("Dog",20.0,"Bone",2);
		System.out.println();
		System.out.println("Animal Description: ");
		System.out.println();
		System.out.println("Name of the animal: "+object2.getName());
		System.out.println("Weight of the animal: "+object2.getWeight()+" lb");
		System.out.println("Favourite food of the animal: "+object2.getFavouriteFood());
		System.out.println("Age of the animal: "+object2.getFavouriteFood());
		
		

	}

}
