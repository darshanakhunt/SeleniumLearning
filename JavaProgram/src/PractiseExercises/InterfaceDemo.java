package PractiseExercises;

interface Animal {
	public static final int a = 20;
	int b = 20;

	void dog();

	void cow();

	default void horse() {

		System.out.println("horse called");
	}

	static void cat() {
		System.out.println("cat called");

	}

}

class bird implements Animal {

	@Override
	public void dog() {

		System.out.println("dog called");
	}

	@Override
	public void cow() {
		System.out.println("cow called");
	}

	public void goat() {
		System.out.println("goat called");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {

		Animal obj = new bird();
		obj.cow();
		obj.dog();
		obj.horse();
		Animal.cat();

		System.out.println(Animal.a);

		bird b = new bird();
		b.dog();
		b.cow();

		b.goat();
		System.out.println(bird.a);
		System.out.println(bird.b);
	}

}
