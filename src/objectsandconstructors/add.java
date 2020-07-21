package objectsandconstructors;

public class add {
   
	public static void main(String[] args) {
		
    add add1 = new add();
    add add2 = new add();
   add2.addition();
    add1.addition();
    add1.subtraction();
    }

	public static void addition() {	

	int a = 1;
	int b = 2;
	int c = a+b;
	
		System.out.println(c);
		
		
}

	
	public static void subtraction() {	
		int a = 1;
		int b = 2;
		int c = a-b;
		
			System.out.println(c);



	}

}