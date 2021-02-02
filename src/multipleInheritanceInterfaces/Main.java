package multipleInheritanceInterfaces;

public class Main {
	
	public static void main (String args[]) {
		Child child = new Child();
		
		child.breath(); //Father's action
		child.give(); //Mother's action
		child.play(); //Child's action
	}
	
	/*
	 * Output
	 * Father is breathing...
	 * Mother is giving something...
	 * Child is playing...
	 */
}
