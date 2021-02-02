package multipleInheritanceInterfaces;

public interface Mother {
	default void give() {
		System.out.println("Mother is giving something...");
	}
}
