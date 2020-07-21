package objectsandconstructors;

public class objects {

	String color;
	int Numberofdoors;
	int TotalHP;
	String Type;
	
	public static void main(String[] args) {
		
	objects car1 = new objects();
	
	car1.color = "Red";
	car1.Numberofdoors = 4;
	car1.TotalHP = 150;
	car1.Type = "Sedan";
	
	objects car2 = new objects();
	
	car2.color = "Black";
	car2.Numberofdoors = 2;
	car2.TotalHP = 120;
	car2.Type = "Truck";
	
	System.out.println(car2.color);
System.out.println(car1.Type);
 
}
  
  
}
