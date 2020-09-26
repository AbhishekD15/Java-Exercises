
import java.util.Scanner;

public class Test {
	

	public static void main(String[] args) throws Throwable {
		Scanner input = new Scanner(System.in);
		Bicycle object = new Bicycle();
		ElectricBike object1 = new ElectricBike();
		MountainBike object2 = new MountainBike();
		RoadBike object3 = new RoadBike();
		Hybrid object4 = new Hybrid();
		
		System.out.println("Is the bike previously serviced \n 1.True for yes \n 2.False for no");
		try {
		object.is_serviced=input.nextBoolean();
		if(!object.is_serviced) {
			System.out.println("No Record Found");
			System.exit(1);
		}	
			
		}
		
		catch(Exception e) {
			System.out.println("Invaild input.Try Again");
			System.exit(1);
		}
		
		
		
		System.out.println("When was the bike brought for servicing (dd/mm/yy)");
		object.inDate=input.next();
		
		System.out.println("When was the bike delievered after servicing(dd/mm/yy");
		object.outDate=input.next();
		
		System.out.println("Who was responsible for the service");
		object.serviceResponsible=input.next();
		
		System.out.println("What was the color of the bike");
		object.color=input.next();
		
		System.out.println("How old was the bike(in years)");
		object.year=input.nextInt();
		
		System.out.println("What was the efficiency of the gear box");
		double gearEfficiency =input.nextDouble();
		
		
		System.out.println("What was the brake effort in the bike");
		double effort=input.nextDouble();
		
		
		System.out.println("Choose the type of bike: \n 1.Electric Bike \n 2.Mountain Bike \n 3.Road Bike \n 4.Hybrid Bike");
		int choice = input.nextInt();
		
		
		
		
		
		switch(choice) {
		
		case 1: System.out.println("Did the battery require charging: \n 1.True for yes \n 2.False for no");
				try {
					Boolean battery=input.nextBoolean();
					object1.setBattery(battery);
				}
				catch(Exception e) {
					System.out.println("Invalid option");
				}
				
				break;
				
		case 2: System.out.println("Enter the type of suspension: \n 1.Front \n 2.Rear");
				String suspension =input.next();
				object2.setSuspension(suspension);
				System.out.println("Enter the type of fork: \n 1.Suspension \n 2.Road \n 3.BMX");
				String forks=input.next();
				object2.setForks(forks);
				break;
				
		case 3: System.out.println("Enter the type of tyres used: \n 1.Clincher \n 2.Tubular \n 3.Tubeless");	
				String tyres=input.next();
				object3.setTyres(tyres);
				break;
				
		case 4:	System.out.println("Enter the type of suspension used: \n 1.Front \n 2.Rear \n 3.Seatpost \n 4.Saddle \n 5.Stem");	
				String suspension1=input.next();
				object4.setSuspension(suspension1);
				break;
				
		default: System.out.println("Invalid choice.Please enter the correct choice");
				 break;
				 
		
				}
		
		if(object.is_serviced) {
		Thread.sleep(1000);	
		System.out.println("Fetching Data....");
		Thread.sleep(3000);
		System.out.println();
			
			
		
		System.out.println("Color:"+object.color);
		System.out.println("Run-down:"+object.year+" years");
		object.chagneGear(gearEfficiency);
		object.checkBrake(effort);
		if(choice==1) {
			System.out.println("Electric Bike");
			if(object1.getBattery()) {		
				object1.chargeBike();
			}
			else {
				System.out.println("No need of charging");
			}	
		}		
		else if(choice==2) {
			System.out.println("Mountain Bike");
			System.out.println("Type of suspension used:"+object2.getSuspension());
			System.out.println("Type of fork used:"+object2.getForks());
		}
		else if(choice==3) {
			System.out.println("Road Bike");
			System.out.println("Type of tyres used:"+object3.getTyres());
		}
		else if(choice==4) {
			System.out.println("Hybrid Bike");
			System.out.println("Type of suspension used:"+object4.getSuspension());
		}
		System.out.println();
		System.out.println("Check-out Details:");
		object.checkoutService();
			
		}
		else {
			System.out.println("No record available");
		}
		
		
		

	}

}
