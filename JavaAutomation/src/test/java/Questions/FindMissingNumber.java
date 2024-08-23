package Questions;

public class FindMissingNumber {

	public static void main(String[] args) {
		int num[]= {3,1,0,2,5};
		int sum=0;
		int size= num.length;
		System.out.println(size);
		
		int n=size*(size+1)/2;
		System.out.println(n);
		for(int i=0;i<size;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
		
		System.out.println("Missing Number is : "+(n-sum));

	}

}
