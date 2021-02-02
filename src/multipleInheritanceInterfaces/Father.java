package multipleInheritanceInterfaces;

public interface Father {
	default void breath() {
		System.out.println("Father is breathing...");
	}

}
