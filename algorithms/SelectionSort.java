package algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {8,4,2,9,7};
		sort(arr);
	}
	
	public static void sort(int[] arr) {
		int length = arr.length;
		int min = 0;
		for(int i=0;i<length-1;i++) {
			min = i;
			for(int j=i+1;j<length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]);
		}
	}

}
