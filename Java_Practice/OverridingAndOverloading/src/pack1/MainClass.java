package pack1;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ChildClass child = new ChildClass();
		SuperClass superClass = new SuperClass();
		SuperClass child1 = new ChildClass();
		//ChildClass superChild = (ChildClass)new SuperClass(); 
		 
		 /*child.add(3, 4);
		 superClass.add(3, 4);
		 child1.add(3, 4);*/
		 
		 
		child.substract(3, 4);
		superClass.substract(3, 4);
		child1.substract(3, 4);

		
		child.add(1, 2);
		superClass.add(1, 2);
		child1.add(1, 2);
		 
		}

}
