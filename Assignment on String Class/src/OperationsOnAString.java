
public class OperationsOnAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java String pool refers to collection of Strings which are stored in a heap memory";
		
		System.out.println("Operation a : "+str.toLowerCase());
		
		System.out.println("\nOperation b : "+str.toUpperCase());
		
		System.out.println("\nOperation c : "+str.replaceAll("a", "*"));
		
		System.out.println("\nOperation d : "+str.contains("collection"));
		
		System.out.println("\nOperation e : "+str.equals(str.toLowerCase()));
		
		System.out.println("\nOperation f : "+str.equalsIgnoreCase(str.toLowerCase()));
		

	}

}
