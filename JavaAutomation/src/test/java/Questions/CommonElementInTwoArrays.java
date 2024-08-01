package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementInTwoArrays {

	public static void main(String[] args) {
	
		int a[]= {1,5,7,6,2,0};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
