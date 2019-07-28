package week1.day2;

import week1.day1.Car;

public class LearnStatic {
	static int num = 10;
	public static void display() {
		System.out.println("display method");
	}

	public static void main(String[] args) {
		/*Car myCar = new Car();
		myCar.getColor();*/
		System.out.println(Car.getColor());
		
		
		display();
		System.out.println(num);

	}

}
