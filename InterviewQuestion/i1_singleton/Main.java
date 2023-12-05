package i1_singleton;

public class Main {
	// Main class to demonstrate the Singleton pattern with thread safety

	public static void main(String[] args) {
		// Thread-safe Lazy Initialization
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();

		System.out.println("Thread-safe Lazy Singleton: " + (lazySingleton1 == lazySingleton2)); // Should print true

		// Eager Initialization (already thread-safe)
		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
		EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

		System.out.println("Eager Singleton: " + (eagerSingleton1 == eagerSingleton2)); // Should print true
	}
}
