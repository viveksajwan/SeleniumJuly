package week1.day2;

public class Problems {

	public static void main(String[] args) {
		String input = "koushik";
		
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j < input.length(); j++) {
				if (input.charAt(i) == input.charAt(j)) {
					System.out.println(input.charAt(i));
					System.out.println(input.charAt(j));
				}
			}
		}
		
		
		
		
		/*String replaceAll = input.replaceAll("[^A-Z]", "");
		System.out.println(replaceAll);*/
		
		
		
		
		/*for (int i = input.length()-1; i >= 0 ; i--) {
			System.out.print(input.charAt(i));
		}*/
	}

}
