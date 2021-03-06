package chapter05;

/* Binary representation of decimal
 * 
 * Solutions       Preference
 * --------------------------------
 * 1) *2 method    Favorite
 * 2) /2 method    Worth mentioning
 * 
 * Don't forget to use StringBuilder !
 */
public class FivePoint2 {
	/* Solution 1 - Uses the "multiply by 2" method I learned in CS 357: A well-known algo to turn decimal fractions into binary fractions */
	public static String printBinary(double num){
		if (num >= 1 || num <= 0)
			return "ERROR";
		
		StringBuilder binary = new StringBuilder();
		binary.append(".");
		
		while (num > 0){            // important to know this stopping condition
			if (binary.length() > 32)
				return "ERROR";
			num *= 2;
			if (num >= 1){
				binary.append(1);	// automatically converts the int to a String
				num = num - 1;
			}
			else
				binary.append(0);
		}
		
		return binary.toString();
	}
	
	/* Solution 2 - Uses the method I usually use to do it in my head 
	 * - Very similar to above solution
	 */
	public static String printBinary2(double num){
		if (num >= 1 || num <= 0)
			return "ERROR";
		
		StringBuilder binary = new StringBuilder();
		binary.append(".");
		double frac = 0.5;
		while (num > 0){
			if (binary.length() > 32)
				return "ERROR";
			if (num > frac){
				binary.append(1);
				num = num - frac;
			}
			else
				binary.append(0);
			frac /= 2;
		}
		return binary.toString();
	}
}
