package simpleInheritance;

public class Main {

	public static void main(String[] args) {		
		//Polymorphism, just methods of parent class.
		Animal dog1 = new Dog(); //Polymorphism. Just methods on Animal.
		dog1.doing();
		dog1.eating();
		System.out.println("-------------------");
		//Instance of dog
		Dog dog2 = new Dog(); //Methods of Animal and Dog.
		dog2.doing();
		dog2.eating();
		dog2.barking();
		System.out.println("-------------------");
		//Instance of cat
		Cat cat = new Cat(); //Methods of Animal and Cat.
		cat.doing();
		cat.eating();
		cat.meow();

	}

}
