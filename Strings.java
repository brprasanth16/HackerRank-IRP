
public class Strings {

	public static void main(String[] args) {
		String s = "Strings are immutable";
		
		//charAt
		char result = s.charAt(8);
		System.out.println(result);
		
		//compareTo
		int n = s.compareTo("Strings");
		System.out.println(n);
		n = s.compareTo("Strings are immutable");
		System.out.println(n);
		n = s.compareTo("Integer");
		System.out.println(n);
		n = s.compareToIgnoreCase("strings are IMMUTABLE");
		System.out.println(n);
		
		//concat
		String sc = s.concat(", StringBuffer is mutable");
		System.out.println(sc);
		
		//contentEquals
		boolean b = s.contentEquals("Strings are Immutable");
		System.out.println(b);
		b = s.contentEquals(new StringBuffer("Strings are immutable"));
		System.out.println(b);
		
		//copyValueOf
		char[] charArr = {'S','t','r','i','n','g',' ','A','r','r','a','y'};
		sc = String.copyValueOf(charArr);
		System.out.println(sc);
		
		//endsWith
		System.out.println(s.endsWith("immutable"));
		System.out.println(s.endsWith("mutable!"));
		
		//equals
		System.out.println(s.equals("Strings are immutable"));
		System.out.println(s.equals("Strings are Immutable"));
		
		//equals
		System.out.println(s.equalsIgnoreCase("Strings are immutable"));
		System.out.println(s.equalsIgnoreCase("Strings are Immutable"));
	}
}
