package Questions;

public class GenerateOTP {

	public static void main(String[] args) {

		String otp = "";
		for (int i = 0; i < 5; i++) {
			otp = otp + (int) Math.floor(Math.random() * 10);
		}
		System.out.println(otp);
	}
}
