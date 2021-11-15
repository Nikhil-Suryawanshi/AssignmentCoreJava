package Assignment_1;

public class MinMaxFinder {
	
	public int[] findMinMax(int arr[]) {
		int minmax[]=new int[2];
		minmax[0]=arr[0];
		minmax[1]=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minmax[0]) {
				minmax[0]=arr[i];
			}
			if(arr[i]>minmax[1]) {
				minmax[1]=arr[i];
			}
		}
		return minmax;
	}
}
