package week2.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] textArr = text.split(" ");
		System.out.println(Arrays.toString(textArr));

		for (int i = 0; i <= textArr.length - 1; i++) {
			for (int j = i + 1; j <= textArr.length - 1; j++) {
				if (textArr[i].equals(textArr[j])) {
					textArr[j] = "zzz";
				}

			}
			if (!(textArr[i].equals("zzz"))) {
				System.out.print(textArr[i] + " ");
			}

		}

	}

}
