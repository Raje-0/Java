package i1_singleton;

//Thread-safe LazySingleton class with lazy initialization
class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {
		// private constructor to prevent instantiation
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
