package a5_method_function;



	class Animal {
	    void makeSound() {
	        System.out.println("Some generic animal sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    void makeSound() {
	        System.out.println("Woof! Woof!");
	    }
	}

	class Cat extends Animal {
	    @Override
	    void makeSound() {
	        System.out.println("Meow!");
	    }
	}

	public class M3_overriding{
	    public static void main(String[] args) {
	        Animal animal1 = new Dog();
	        Animal animal2 = new Cat();

	        animal1.makeSound(); // Output: Woof! Woof!
	        animal2.makeSound(); // Output: Meow!
	    }
	}

