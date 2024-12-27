package JavaProgramTest;

public class TestCar {

	public static void main(String[] args) {

		bmw b= new bmw();
		b.start();
		b.stop();
		b.refuel();
		b.thesafety();
		b.engine();
		
		
		System.out.println("********"); 
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("(((((((((((((");
		
		Car c1=new bmw();
		c1.start();
		c1.stop();
		c1.refuel();
		
		
		
	}

}
