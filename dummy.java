/*
	 Rotate an array to the right by k elements.
	 
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