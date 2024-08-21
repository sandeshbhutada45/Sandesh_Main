package Questions;

public class IntegerToRoman {

	public static void main(String[] args) {

		int num = 5789;
		String roman = "";
		int value[] = { 1000, 900, 500, 400, 100, 90, 50, 10, 9, 5, 4, 1 };
		String symbol[] = { "M", "CM", "D", "CD", "C", "XC", "L", "X", "IX", "V", "IV", "I" };

		for (int i = 0; i < value.length; i++) {
			while (num >= value[i]) {
				roman = roman + symbol[i];
				num = num - value[i];
			}
		}

		System.out.println(roman);
	}

}
