
public class Car {
	private int speed;
	private String gear;
	
	public Car() {
		this.speed=0;
		this.gear="park";
	}
	
	public Car(int speed) {
		this.speed=speed;
		if (speed==0) {
			this.gear="park";
		}else if (speed<0) {
			this.gear="reverse";
		}else {
			this.gear="drive";
		}
	}
	
		public int getSpeed() {
		return speed;
	}

	public String getGear() {
		return gear;
	}
	
	public void speedUp(int increase) {
		this.speed+=increase;
		gear=checkGear();
	}
	
	private String checkGear() {
		if (this.speed>0) {
			return "drive";
		}else if (this.speed<0) {
			return "reverse";
		}else {
			return "park";
		}
	}
	
	
	
}
