package Questions;

import java.util.LinkedList;

public class LinkedListReverse {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(2);list.add(5);list.add(4);list.add(6);list.add(3);
		System.out.println("Before Reverse: "+list);
		
		int size= list.size();
		int temp=0;
		for(int i=0;i<size/2;i++) {
			 temp = list.get(i);
	            list.set(i, list.get(size - 1 - i));
	            list.set(size - 1 - i, temp);
			}
		System.out.println("After Reverse: "+list);
	}

}
