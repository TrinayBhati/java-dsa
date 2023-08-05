
/*	 
	// Rotate an array to the right by k elements.
class solution{
	public static void rotate(arr[] num , int k) {
		int n = num.length;
		k = k % n;
		int temp [] = new int[k];
		for (int i = n-k, j= 0; i< n ; i++, j++){
			temp[j] = nums[i];
		}
		for(i = n-k-1; i>=0 ; i--){
			nums[i+k] = nums[i];
		}
		for(int i = 0; i<k ; i++){
			nums[i] = temp[i];
		}
	}
}*/

/*class Binary{
	public static boolean isSorted(int arr[]){
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i]>arr[i+1]){
				return false;
			}
		}
		return true;
	}
	public static int search(int arr[],int x ){
		int n = arr.length;
		int f = 0;
		int l = n-1;
		while(f<l){
			int mid = f + (l-f)/2;
			if(arr[mid] == x){
				return mid;
			}
			else if(arr[mid]>x){
				l = mid -1;
			}
			else{
				f = mid +1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {2, 4, 8, 19, 20, 765, 962};
		int x = 7;
		if(isSorted(arr)){
			System.out.println("element found at " + search(arr, x));
		}
		else{
			System.out.println("aray not sorted");
		}
		
	}
}*/

/*class Linear{
	public static int search(int arr[], int x){
		int n = arr.length;
		for(int i = 0; i<n ; i++){
			if(arr[i]==x){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {	
		int arr[] = {2, 4, 8, 19, 20, 765, 962};
		int x = 19;
		System.out.println(search(arr, x));
	}
}*/

/*class BubbleSort{

	public static void sorting(int arr[]){
		int n = arr.length;
		for(int i = 0; i< n ; i++){
			for(int j = 0; j <n-i-1 ; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1, 23, 43, 2, 5, 88, 9, 906, 752};
			sorting(arr);
	}
}*/

/*class Selection{
	public static int[] sort(int arr[]){
		int n = arr.length;
		for(int i = 0; i< n-1 ; i++){
			int smallest = i;
			for(int j = i+1; j<n ; j++){
				if(arr[j]<arr[smallest]){
					smallest = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {1, 23, 43, 2, 5, 88, 9, 906, 752};
		int sortedArr[] = sort[arr];
		System.out.println(Arrays.toString(sortedArr));
	}
}*/

/*class Insertion{
	public static int[] sort(int arr[]){
		int n = arr.length;
		for(int i = 1; i< n ; i++){
			int current = i;
			int j = i-1;
			while(j<= 0 && arr[current]<arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = arr[current];
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {1, 23, 43, 2, 5, 88, 9, 906, 75};
		sort(arr);
	}
}*/

public static int[] sym(int arr[], int brr[]){
	int count = 0; 
	int m = arr.length;
	int n = brr.length;
	boolean[] checked = new boolean[arr2.length];

	for(int i = 0; i<m ; i++){
		boolean flag = false;
		for(int  j = 0 ; j< n ; j++){
			if(arr[i] == brr[j] && !checked[j]){
				checked[j] = true;
				flag = true;
				count++;
				break;
			}
		}
	}

	int set[] = new int[count];
	int i = 0;
	for(int j = 0 ; j<arr2.length ; j++){
		if(checked[j]){
			set[i++] = arr2[j];
		}
	} 
	return set;
}

public static void main(String[] args) {
	sym([1, 2, 3], [5, 2, 1, 4]);
}