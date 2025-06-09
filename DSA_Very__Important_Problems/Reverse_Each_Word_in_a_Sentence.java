package problems.important;

public class Reverse_Each_Word_in_a_Sentence {
	
	public static void main(String[] args) {
		String str = "Hello World";
		String str3 [] = str.split(" ");
		StringBuilder  builder =  new StringBuilder();
		
		for (int i = str3.length-1 ; i>=0; i--) {
			builder.append(str3[i]).append(" ");
		}
		System.out.println(builder);
//		String str2 = "";
//		for (int i = str.length()-1; i >=1; i--) {
//			str2 = str2 + str.charAt(i) ;
//		}
//		System.out.println(str2);
		
	}

}
