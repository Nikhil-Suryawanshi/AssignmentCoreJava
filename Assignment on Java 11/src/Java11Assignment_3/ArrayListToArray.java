package Java11Assignment_3;

import java.util.ArrayList;

public class ArrayListToArray {
public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("quick");
		al.add("brown");
		al.add("fox");
		al.add("jumps");
		al.add("over");
		al.add("the");
		al.add("lazy");
		al.add("dog");
		
		String arr[]=al.toArray(new String[al.size()]);
		for (String j:arr) {
			System.out.println(j);
		}

	}
}
