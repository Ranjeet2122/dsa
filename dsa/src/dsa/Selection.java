package dsa;

public class Selection {

	public static void SelectionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp =arr[i]; 
				arr[i]=arr[min];
				arr[min]=temp;
				
			}
		}
	}
}
