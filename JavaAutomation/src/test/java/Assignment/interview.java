package Assignment;

import java.util.Arrays;

public class interview {

	public static void main(String[] args) {
		int a[]= {4,2,7,0,10,3};
		int target=7;
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
				System.out.println(target+" is at Index: "+i);
			}
		}
		

	}
}
