public class TestPolymor {
	public static void main(String[] args) {
		
		// Animal animal = new Animal();
		// Dog dog = new Dog();
		// Bird bird = new Bird();
		// move(animal);
		// move(dog);
		// move(bird);

		// Cup cup = new Cup();
		// move(cup);  //can't



		 Animal animal = new Animal();
		 animal.move();

		Animal dog = new Dog();
		dog.move();
		
		Animal bird = new Bird();
		bird.move();
		
		// TestPolymor t = new TestPolymor();
		// t.move(dog);  //if method non-static

	}

	public static void move(Animal a){
		a.move();
	}
}