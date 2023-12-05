package i1_singleton;

//EagerSingleton class with eager initialization (already thread-safe)
class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
		// private constructor to prevent instantiation
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}