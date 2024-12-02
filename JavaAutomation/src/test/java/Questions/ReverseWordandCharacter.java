package Questions;

public class ReverseWordandCharacter {

	public static void main(String[] args) {
		String str="Sandesh Bhutada";
		String[] word= str.split("\\s");
		String op="";
		for(int i=word.length-1;i>=0;i--) {
			
			for(int j=word[i].length()-1;j>=0;j--) {
				op=op+word[i].charAt(j);
			}
			op=op+" ";
			
		}
		System.out.println(op);
		
		
		

	}

}
