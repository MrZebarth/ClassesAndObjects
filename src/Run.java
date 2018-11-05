
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		Car car2=new Car(-10);
		
		System.out.println("Car 1 is going "+car1.getSpeed()+" and is in "+car1.getGear());
		System.out.println("Car 2 is going "+car2.getSpeed()+" and is in "+car2.getGear());
		car2.speedUp(10);
		System.out.println("Car 2 is going "+car2.getSpeed()+" and is in "+car2.getGear());
		car2.speedUp(5);
		System.out.println("Car 2 is going "+car2.getSpeed()+" and is in "+car2.getGear());
		
	}

}
