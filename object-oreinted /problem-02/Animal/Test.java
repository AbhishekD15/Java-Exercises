
public class Test {

	public static void main(String[] args) {
		Lion object1 = new Lion();
		Lion object2 =new Lion("Simba",45,"Steak");
		object2.makeSound();
		System.out.println();
		Turtle object3 =new Turtle();
		Turtle object4=new Turtle("Oogway",10,"Grass");
		object4.makeSound();
		System.out.println();
		Chameleon object5=new Chameleon();
		Chameleon object6=new Chameleon("Pascal",2,"Insects");
		object6.makeSound();

	}

}
