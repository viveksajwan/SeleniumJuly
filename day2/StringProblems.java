package week1.day2;

public class StringProblems {

	public static void main(String[] args) {
		String comp = "Amazon India";
		char input = 'n';
		// n = 2
		// way 1
		int c = 0;
		int length = comp.length();
		for (int i = 0; i < length; i++) {
			if (comp.charAt(i) == input)  {
				c++;
			}
		}
		System.out.println(c);
		// way 2
		/*int before = comp.length();
		String replace = comp.replace("n", "");
		int after = replace.length();
		System.out.println(before- after);*/
		
		
		// way 3
		
		/*int count = 0;
		char[] charArray = comp.toCharArray();
		for (char c : charArray) {
			if (c == input) {
				count++;
			}
		}
		System.out.println(count);*/
		
		
		
		
		
		
		
		
		

	}

}
