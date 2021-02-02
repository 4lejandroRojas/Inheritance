package multipleInheritanceInterfaces;
/**
 * This is not real inheritance because Java doesn't allow it.
 * But with interface use, it can be simulate.
 * @author 4lejandroRojas
 *
 */
public class Child implements Father, Mother{
	public void play() {
		System.out.println("Child is playing...");
	}
}
