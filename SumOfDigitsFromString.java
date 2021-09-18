package week2.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		String text = "Tes12Le79af65";
		String numberText = text.replaceAll("[\\D]", "");
		System.out.println(numberText);
		int sum = 0;
		/*
		 * Method 1 int number=Integer.parseInt(numberText); int rem,sum=0;
		 * while(number!=0) { rem=number%10; number=number/10; sum=sum+rem; }
		 * System.out.println(sum);
		 */
		// Method 2
		char[] charArray = numberText.toCharArray();
		for (int i = 0; i <= charArray.length - 1; i++) {
			int numericValue = Character.getNumericValue(charArray[i]);
			sum = sum + numericValue;
		}
		System.out.println(sum);
	}

}
