package InterviewQuestions;

public class FindSumOfArrayToTarget {

	public static void main(String[] args) {
		String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            try {
                int num = Integer.parseInt(array[i]);
                sum += num;
            } catch (NumberFormatException e) {
                // Ignore non-numeric strings
            }
        }

        System.out.println("The sum of numbers is: " + sum);
	}

}
