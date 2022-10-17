package cr;

class Animal2 { public String noise() { return "peep"; } }

class Dog extends Animal2 {
	public String noise() { return "bark"; }
}

class Cat extends Animal2 {
	public String noise() { return "meow"; }
}

public class Peep {
	public static void main(String[] args) {
		Animal2 animal = new Dog();
		Cat cat = (Cat)animal;
		System.out.println(cat.noise());
	}
}