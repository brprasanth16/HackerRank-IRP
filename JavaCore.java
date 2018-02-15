
public class JavaCore {

	public static void main(String[] args) {
		String s = "abcDefGhiJKlmnOP";
		int cntC = 0, cntS = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
				cntC++;
			} else {
				cntS++;
			}
		}
		System.out.println(s.length() + " " + cntC + " " + cntS);
	}

}
