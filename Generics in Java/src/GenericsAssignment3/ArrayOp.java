package GenericsAssignment3;

public class ArrayOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,2,3,4,5,6};
		System.out.println("Before changing position");
		for(int i=0;i<6;i++) {
			System.out.println("Arr["+i+"]= "+arr[i]);
		}
		changePos(arr,2,5);
		System.out.println("After changing position");
		for(int i=0;i<6;i++) {
			System.out.println("Arr["+i+"]= "+arr[i]);
		}
	}
	
	public static <T> void changePos(T[] arr,int pos1,int pos2) {
		T temp=arr[pos2];
		arr[pos2]=arr[pos1];
		arr[pos1]=temp;
	}

}
