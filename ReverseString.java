package week2.day2;

public class ReverseString {

	public static void main(String[] args) {

		String test = "feeling good";
		// Method 1
		/*
		 * for (int i = test.length() - 1; i >= 0; i--) {
		 * System.out.print(test.charAt(i)); }
		 */
		// Method 2
		char[] testArr = test.toCharArray();
		for (int i = testArr.length-1; i >=0; i--) {
			System.out.print(testArr[i]);
		}
	}

}
