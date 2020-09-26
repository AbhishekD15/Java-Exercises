
public class ElectricBike extends Bicycle {

	Boolean battery;
	
	/**
	 * @return the battery
	 */
	public Boolean getBattery() {
		return battery;
	}

	/**
	 * @param battery the battery to set
	 */
	public void setBattery(Boolean battery) {
		this.battery = battery;
	}
	
	
	public void chargeBike() {
		System.out.println("Battery was charged to 100 percent");
	}
		

}
