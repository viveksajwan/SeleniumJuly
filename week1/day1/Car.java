package week1.day1;

// Access Modifier -> public, private, 
// protected & default (package)
public class Car {
	// syntax to declare a method
	// Access returnType methodName() { logic }
	public String getColor() {
		return "black";
	}
	public void doRide() {
		System.out.println("I am riding the car");		
	}
	// To run
	public static void main(String[] args) {
		// syntax to call a class
		// ClassName object = new ClassName();
		Car myCar = new Car();
		// syntax to call a method
		// object.methodName();
//		myCar.doRide();
		String color = myCar.getColor();
		System.out.println(color);
	}








}
