package ch07;


abstract class Animal{

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 추상 메서드
}

class Dog extends Animal{
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}


public class AbstractMethod {

	public static void main(String[] args) { 
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());

	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
