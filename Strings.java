import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


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
		
		//endsWith
		System.out.println(s.startsWith("Strings"));
		System.out.println(s.startsWith("are", 8));
		
		//equals
		System.out.println(s.equals("Strings are immutable"));
		System.out.println(s.equals("Strings are Immutable"));
		
		//equals
		System.out.println(s.equalsIgnoreCase("Strings are immutable"));
		System.out.println(s.equalsIgnoreCase("Strings are Immutable"));
		
	   String str1 = "String method tutorial";
       String str2 = "compareTo method example";
       String str3 = "String method tutorial";

       int var1 = str1.compareTo( str2 );
       System.out.println("str1 & str2 comparison: "+var1);

       int var2 = str1.compareTo( str3 );
       System.out.println("str1 & str3 comparison: "+var2);

       int var3 = str2.compareTo("compareTo method example");
       System.out.println("str2 & string argument comparison: "+var3);
       
       System.out.println(new StringBuilder(str1).reverse());
       
       int [] arr1 = {1,2,3,4,5};
       int [] arr2 = {1,2,3,4,5};

       List<Integer> lst = Arrays.stream(arr1).boxed().collect(Collectors.toList());
       Collections.reverse(lst);
       Integer [] arr3 = new Integer[arr1.length];
       arr3 = lst.toArray(arr3);
       System.out.println(Arrays.equals(arr1, arr2));
       
       System.out.println(IntStream.of(Arrays.copyOfRange(arr1,0,1)).sum());
       System.out.println(IntStream.of(arr1).min().getAsInt());
       System.out.println(IntStream.of(arr1).max().getAsInt());
       System.out.println(IntStream.of(arr1).count());
       System.out.println((int)IntStream.of(arr1).average().getAsDouble());
       Arrays.sort(arr2);
       System.out.println(Arrays.equals(arr1, arr2));
       System.out.println(Arrays.toString(arr2).substring(1,Arrays.toString(arr2).length()-1).replaceAll("0, ", "").replaceAll("0", ""));
       
       String abc = "ababababa";
       System.out.println(abc.length()-abc.replace("a","").length());
       BigInteger bgi = new BigInteger("10");
       BigInteger bgi1 = bgi.flipBit(0);
       System.out.println(Integer.toBinaryString(4));
       System.out.println(Integer.bitCount(7));
       System.out.println(Integer.toString(4,2));
       System.out.println(Integer.parseInt("101",2));
       System.out.println(bgi1);
       
       Double d = new Double(3.35);
       System.out.println(Math.ceil(d));
       System.out.println(Math.floor(d));
       System.out.println(Math.round(d));
       
       LinkedHashSet<Integer> lhst = new LinkedHashSet<Integer>();
       lhst.add(97);
       lhst.add(20);
       System.out.println(Collections.max(lhst));
	}
}
