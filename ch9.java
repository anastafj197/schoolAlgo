
public class ch9 {

	public static void main(String [] args) {
		test();
	}

	public static void test() {
		System.out.println("BadSFold HEAR HER = " + BadSFold("HEAR HER"));
		System.out.println("BadSFold HEAR HER AT = " + BadSFold("HEAR HER AT"));
		System.out.println("SFold HEAR HER = " + Sfold("HEAR HER"));
		System.out.println("SFold HEAR HER AT = " + Sfold("HEAR HER AT"));
		System.out.println("SFold2 HEAR HER = " + SFold2("HEAR HER"));
		System.out.println("SFold2 HEAR HER AT = " + SFold2("HEAR HER AT"));
	}

	public static int BadSFold (String key) {

 		char [] ch = key.toCharArray();
 		int sum = 0;
 		for (int i = 0; i < ch.length; i++)
 			sum +=ch[i];
 		return sum;
	}
	
	public static long Sfold (String s) {

 		int intLength = s.length() / 4;
 		long sum = 0;
 		// process each 4 bytes (chars) as a long integer value
 		for (int i = 0; i < intLength; i++) {
 			char c[] = s.substring(i*4, i*4 + 4).toCharArray();
 			long mult = 1;
 			for (int j = 0; j < c.length; j++) {
 				sum += c[j] * mult;
 				mult *= 256;
 			}
 		}
 		// map to the the table size
 		return Math.abs(sum);
	}

	public static long SFold2 (String s) {

		int intLength = s.length() / 4;
 		long sum = 0;

 		char c[] = s.substring(intLength * 4).toCharArray();
 		long mult = 1;
 		for (int i =0; i < c.length; i++) {
 			sum += c[i] * mult;
 			mult *= 256;
 		}
		 // map to the the table size
		 return Math.abs(sum);
	}
}
	