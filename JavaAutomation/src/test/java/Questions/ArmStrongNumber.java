package InterviewQuestions;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int sum=0;
		while(n>0){
			int rem=n%10;//3
			n=n/10; //15
			sum=sum+rem*rem*rem; //0+3*3*3
		}
		System.out.println(sum);
		
		if(temp==sum) {
			System.out.println("Number is ArmStrong");
		}
		else{
			System.out.println("Number is Not ArmStrong");
		}

	}

}
