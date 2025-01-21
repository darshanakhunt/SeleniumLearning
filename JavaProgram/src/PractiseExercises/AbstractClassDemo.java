package PractiseExercises;

abstract class shape {
	int x;
	int y;

	shape(int a, int b) {
		this.x = a;
		this.y = b;
		System.out.println("parent const");
	}

	public abstract void rectangle();

	public void square() {
		System.out.println("shape class square method");
	}

}


class picture extends shape
{
	int c;

	picture(int a, int b, int c) {
		super(a, b);
		this.c = c;
		System.out.println("child const");
	}

	@Override
	public void rectangle() {

		System.out.println("rectangle called");
	}
	
	public void triangle()
	{
		System.out.println("triangle called");
	}

}
public class AbstractClassDemo {

	public static void main(String[] args) {

		shape obj = new picture(10,20,30);
		System.out.println(obj.x);
		obj.rectangle();
		obj.square();
		
		picture obj2 = new picture(50,60,70);
		obj2.triangle();
	}

}
