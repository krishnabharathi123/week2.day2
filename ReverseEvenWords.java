package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software testing engineer in chennai";
		String Reverse = "";
		String arr[] = test.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) % 2 == 0) {
				char[] charArray = arr[i].toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					Reverse = Reverse + charArray[j];
				}
				System.out.print(Reverse);
				Reverse = "";
			} else {
				System.out.print(" " + arr[i] + " ");
			}
		}

	}

}
