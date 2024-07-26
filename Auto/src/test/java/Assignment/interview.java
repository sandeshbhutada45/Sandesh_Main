package Assignment;

import java.util.Arrays;
import java.util.List;

public class interview {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		I/p: Sandesh is my name
//
//		O/p: name my is Sandesh
//		Name   Role
//
//		Sam       teacher
//
//		Dave     student
//
//		Sandra  teacher
//
//		Create java function that validates that only users with either teacher or student role are displayed
		
		
		String str= "Sandesh is my name";
		String[] words=str.split("\\s");
		System.out.println(str);
		String rev="";
		
		
		for (int i = words.length - 1; i >= 0; i--) {
			
			rev=rev+words[i];
			rev=rev+" ";
		}
		System.out.println(rev);
		
		
	}

}
