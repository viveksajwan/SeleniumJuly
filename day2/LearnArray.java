package week1.day2;

import java.util.Arrays;
import java.util.Collections;

public class LearnArray {

	public static void main(String[] args) {
		String[] empName = {"Durai", "Prem",
				"Ajith", "Vignesh", "Raghul"};
		Arrays.sort(empName);
		Collections.reverse(Arrays.asList(empName));
		for (String each : empName) {
			System.out.println(each);
		}




		/*for(String a : empName) {
			System.out.println(a);
		}
		int[] numbers = {1, 2, 3, 4, 5};
//		fore ctrl space
		for(int a: numbers) {
			System.out.print(a);
		}*/
















		//		System.out.println(empName.length);
		/*for(int i = 0; i < empName.length; i++) {
			System.out.println(empName[i]);
		}*/

	}

}
