import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double Force, mass, acceleration;
//		PhysicsEquations p=new PhysicsEquations();
		System.out.println("What is the mass in kg?");
		mass=in.nextDouble();
		System.out.println("What is the acceleration in m/s^2?");
		acceleration=in.nextDouble();
		Force=PhysicsEquations.calculateForce(mass,acceleration);
		System.out.println("The Force in Newtons is "+Force);
	}
	
	

}
