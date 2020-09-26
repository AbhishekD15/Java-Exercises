import java.util.Scanner;

public class Bicycle extends VehicleAbstract {
	Boolean is_serviced;
	String inDate;
	String outDate;
	String serviceResponsible;
	
	Scanner input = new Scanner(System.in);
	
	
	
	

	public void checkoutService() {
		System.out.println("Arrival Date:"+inDate);
		System.out.println("Delivery Date:"+outDate);
		System.out.println("Serviced by:"+serviceResponsible);
		
	}

	@Override
	public double chagneGear(double efficieny) {
		if(efficieny > 90) {
			System.out.println("Gear changed");
		}
			System.out.println("Need to change gear");
			numberGears++;
		
		return numberGears;
	}

	@Override
	public void checkBrake(double brakeEffort) {
		
		if(brakeEffort >90) {
			System.out.println("Brakes changed");
		}
		else {
			System.out.println("Need to change brakes");
		}	
		
		
	}
	

}
