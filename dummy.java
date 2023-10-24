	// Rotate an array to the right by k elements.

// class solution{
// 	public static void rotate(arr[] num , int k) {
// 		int n = num.length;
// 		k = k % n;
// 		int temp [] = new int[k];
// 		for (int i = n-k, j= 0; i< n ; i++, j++){
// 			temp[j] = nums[i];
// 		}
// 		for(i = n-k-1; i>=0 ; i--){
// 			nums[i+k] = nums[i];
// 		}
// 		for(int i = 0; i<k ; i++){
// 			nums[i] = temp[i];
// 		}
// 	}
// }




// class Binary{
// 	public static boolean isSorted(int arr[]){
// 		for(int i = 0; i<arr.length-1; i++){
// 			if(arr[i]>arr[i+1]){
// 				return false;
// 			}
// 		}
// 		return true;
// 	}
// 	public static int search(int arr[],int x ){
// 		int n = arr.length;
// 		int f = 0;
// 		int l = n-1;
// 		while(f<l){
// 			int mid = f + (l-f)/2;
// 			if(arr[mid] == x){
// 				return mid;
// 			}
// 			else if(arr[mid]>x){
// 				l = mid -1;
// 			}
// 			else{
// 				f = mid +1;
// 			}
// 		}
// 		return -1;
// 	}

// 	public static void main(String[] args) {
// 		int arr[] = {2, 4, 8, 19, 20, 765, 962};
// 		int x = 7;
// 		if(isSorted(arr)){
// 			System.out.println("element found at " + search(arr, x));
// 		}
// 		else{
// 			System.out.println("aray not sorted");
// 		}
		
// 	}
// }





// class Linear{
// 	public static int search(int arr[], int x){
// 		int n = arr.length;
// 		for(int i = 0; i<n ; i++){
// 			if(arr[i]==x){
// 				return i;
// 			}
// 		}
// 		return -1;
// 	}
// 	public static void main(String[] args) {	
// 		int arr[] = {2, 4, 8, 19, 20, 765, 962};
// 		int x = 19;
// 		System.out.println(search(arr, x));
// 	}
// }



// class BubbleSort{

// 	public static void sorting(int arr[]){
// 		int n = arr.length;
// 		for(int i = 0; i< n ; i++){
// 			for(int j = 0; j <n-i-1 ; j++){
// 				if(arr[j]>arr[j+1]){
// 					int temp = arr[j];
// 					arr[j] = arr[j+1];
// 					arr[j+1] = temp;
// 				}
// 			}
// 		}
// 	}

// 	public static void main(String[] args) {
// 		int arr[] = {1, 23, 43, 2, 5, 88, 9, 906, 752};
// 			sorting(arr);
// 	}
// }



// class Selection{
// 	public static int[] sort(int arr[]){
// 		int n = arr.length;
// 		for(int i = 0; i< n-1 ; i++){
// 			int smallest = i;
// 			for(int j = i+1; j<n ; j++){
// 				if(arr[j]<arr[smallest]){
// 					smallest = j;
// 				}
// 			}
// 			int temp = arr[i];
// 			arr[i] = arr[smallest];
// 			arr[smallest] = temp;
// 		}
// 		return arr;
// 	}
// 	public static void main(String[] args) {
// 		int arr[] = {1, 23, 43, 2, 5, 88, 9, 906, 752};
// 		int sortedArr[] = sort[arr];
// 		System.out.println(Arrays.toString(sortedArr));
// 	}
// }



// class Insertion{
// 	public static int[] sort(int arr[]){
// 		int n = arr.length;
// 		for(int i = 1; i< n ; i++){
// 			int current = i;
// 			int j = i-1;
// 			while(j<= 0 && arr[current]<arr[j]){
// 				arr[j+1] = arr[j];
// 				j--;
// 			}
// 			arr[j+1] = arr[current];
// 		}
// 		return arr;
// 	}
// 	public static void main(String[] args) {
// 		int arr[] = {1, 23, 43, 2, 5, 88, 9, 906, 75};
// 		sort(arr);
// 	}
// }



// class Solution{
// 	public static int[] sym(int arr[], int brr[]){
// 	int count = 0; 
// 	int m = arr.length;
// 	int n = brr.length;
// 	boolean[] checked = new boolean[arr2.length];

// 	for(int i = 0; i<m ; i++){
// 		boolean flag = false;
// 		for(int  j = 0 ; j< n ; j++){
// 			if(arr[i] == brr[j] && !checked[j]){
// 				checked[j] = true;
// 				flag = true;
// 				count++;
// 				break;
// 			}
// 		}
// 	}

// 	int set[] = new int[count];
// 	int i = 0;
// 	for(int j = 0 ; j<arr2.length ; j++){
// 		if(checked[j]){
// 			set[i++] = arr2[j];
// 		}
// 	} 
// 	return set;
// }

// public static void main(String[] args) {
// 	int arr = {1, 2, 3};
// 	int brr = {5, 2, 1, 4};
// 	sym(arr, brr);
// }
// }


// ============================== 26-sep ===================================

// class pallindrome {
//     public static void main(String[] args) {
//         String str = "Trinay";
//         isPallindrome(str);
//     }

//     public static void isPallindrome(String str){

//         int n = str.length();
//         int i = 0;
//         int j = n-1;

//         while(i<=j){
//             if(str.charAt(i) != str.charAt(j) ){
//                 return;
//             }
//             else{
//                 i++;
//                 j--;
//             }
//         }
//         if(i>j){
//             System.out.println("Pallindrome");
//         }
//         else{
//             System.out.println("Not Pallindrome");
//        }
//     }
// }




// class SumOfArray{
// 	public static void main(String[] args) {
		
// 		// int arr = new int[];
// 		int arr[] = {1,2,3,4,5,6,7,8,9};

// 		int sum = 0 ;

// 		for(int i = 0; i< arr.length ; i++){
// 			sum += arr[i];
// 		}
// 		System.out.println(sum);
// 	}
// }



//Problem 1: Given an integer array nums, return the third distinct maximum number in this array. If the third maximum
// does not exist, return the maximum number.
//Input: nums = [3,2,1]
//Output: 1
//Input: nums = [1,2]
//Output: 2

// class thirdLargest{
// 	public static void main(String[] args) {
		
// 		int arr[] = {2, 4, 7, 1, 9, 33};

// 		int max = Integer.MIN_VALUE;
// 		int max2 = Integer.MIN_VALUE;
// 		int max3 = Integer.MIN_VALUE;

// 		for(int i = 0 ; i< arr.length ; i++){
// 			if(arr[i] > max){
// 				max = arr[i]; // 33
// 			}
// 		}
// 		for(int i = 0 ; i< arr.length ; i++){
// 			if( arr[i] > max2 && arr[i] < max){
// 				max2 = arr[i]; // 9
// 			}
// 		}
// 		for(int i = 0 ; i< arr.length ; i++){
// 			if(arr[i] > max3 && arr[i] < max2){
// 				max3 = arr[i]; // 7
// 			}
// 		}
// 		if(arr.length < 3){
// 			System.out.println(max);
// 		}else{
// 			System.out.println(max3);
// 		}

// 	}
// }


// ============================== 27-sep ===================================



// class thirdMaximumOptimized {
// 	public static void main(String[] args) {
		
// 		int arr[] = {2, 4, 7, 1, 9, 9, 33};
// 		int n = arr.length;

// 		int max = arr[0];
// 		int max2 = Integer.MIN_VALUE;
// 		int max3 = Integer.MIN_VALUE;

// 		for(int i = 1 ; i < n ; i++){

// 			if(arr[i] > max){
// 				max3 = max2;
// 				max2 = max;
// 				max = arr[i];
// 			}
// 			else if(arr[i] > max2){
// 				max3 = max2;
// 				max2 = arr[i];
// 			}
// 			else if(arr[i] > max3){
// 				max3 = arr[i];
// 			}
// 		}
// 		System.out.println("max : " + max);
// 		System.out.println("max2 : " + max2);
// 		System.out.println("max3 : " + max3);

// 	}
// }


//Problem 2: Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result
// must appear as many times as it shows in both arrays and you may return the result in any order.
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9] or [9,4]

// class intersectionArray{
// 	public static void main(String[] args) {
// 		int arr[] = {1,2,2,1};
// 		int brr[] = {2,2};

// 		int n = (arr.length > brr.length) ? brr.length : arr.length; 
// 		int newArr[] = new int[n];

// 		for(int i = 0 ; i < arr.length ; i++){
// 			for(int j = 0 ; j< brr.length ; j++){
// 				if(arr[i] == brr[i]){
// 					newArr[i] = arr[i]; 
// 				}
// 			}
// 		}
// 		for(int i = 0 ; i< newArr.length ; i++){
// 			System.out.println(newArr[i]);
// 	}
// 	}
// }

// ============================== 6-oct ===================================


// 2 sum
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
        
//         int sum[] = new int[2];
//         int n = nums.length;
//         for(int i = 0 ; i< n ; i++){
//             for(int j = i+1 ; j< n ; j++){
//                 if(nums[i] + nums[j] == target){
//                     sum[0] = i;
//                     sum[1] = j; 
//                 }
//             }   
//         }
//         return sum;
//     }
// }


// class Solution{
// 	public static void main(String[] args) {
// 		int arr[] = {1,2,3,5,2,7,8,9,112};
// 		System.out.println(maxMin(arr));
// 	}
// 	public static int maxMin(int[] arr){
// 		int n = arr.length;
// 		int max = Integer.MIN_VALUE;
// 		int min = Integer.MAX_VALUE;

// 		for(int i = 0 ; i< n ; i++){
// 			if(arr[i] % 2 == 0){
// 				if(arr[i]> max){
// 					max = arr[i];
// 				}
// 			}
// 		}
// 		return max;

// 	}
// }

// ============================== 9 -oct ===================================

//using HashMap

// class twoSum{
// 	public static void main(String[] args) {
// 		int nums[] = {2,7,11,15};
// 		int target = 9;
// 		twoSum(nums, target);
// 	}
// 	public static void twoSum(int[] nums, int target) {
// 		int n = nums.length;
// 		int arr[] = new int[2];
// 		int index1 = -1;
// 		int index2 = -1;

// 		Hashmap<Integer, Integer> myMap = new HashMap<>();

// 		for(int i = 0 ; i< n ; i++){
// 			myMap.put(nums[i] , i);
// 		}

// 		for(int i = 0 ; i< n ; i++){
// 			int diff = target - nums[i];
// 			if(myMap.containsKey(diff) && i != myMap.get(diff)){
// 				index1 = i;
// 				index2 = myMap.get(diff);
// 			}
// 		}
// 		arr[0] = index1;
// 		arr[1] = index2;
// 		return arr;
// 	}
// }


// remove duplicate

// class Solution{
// 	public static void main(String[] args) {
// 		int arr[] = {0,0,1,1,1,2,2,3,3,4};
// 		removeDuplicate(arr);
// 	}
// 	public static void removeDuplicate(int arr[]) {

// 		int n = arr.length;
// 		int j = 1;
// 		int brr[] = new int[n]; 

// 		for(int i = 0; i< n-1 ; i++){
// 			if(arr[i] != arr[i+1]){
// 				brr[j] = arr[i+1];
// 				j++;
// 			}
// 		}
// 		System.out.println(j);
// 		for(int i = 0 ; i< brr.length ; i++){
// 		System.out.print(brr[i]);

// 		}
// 	}
// }


// remove

// class Solution{
// 	public static void main(String[] args) {
// 		int arr[] = {3,2,2,3};
// 		removeElement(arr, 3);
// 	}
// 	public static void removeElement(int arr[], int val) {

// 		int n = arr.length;
// 		int j = 1;
// 		int brr[] = new int[n]; 

// 		for(int i = 0 ; i< n ; i++){
// 			if(arr[i] != val){
// 				brr[j] = arr[i];
// 				j++;
// 			}
// 		}
// 		for(int i = 0 ; i< brr.length ; i++){
// 			System.out.print(brr[i]);
// 		}
// 	}
// }

// ============================== 12 -oct ===================================


// search insert


// class Solution{
// 	public static void main(String[] args) {
// 		int arr[] = {1,3,5,6};
// 		insertPosition(arr, 7);
// 	}
// 	public static void insertPosition(int arr[], int val) {

// 		int n = arr.length;
// 		int ans = -1;
// 		for(int i = 0 ; i< n ; i++){
// 			if(arr[i] == val){
// 				ans = i;
// 			}else if(arr[i] < val){

// 			}
// 		}
// 		System.out.print(ans);
// 	}
// }

// class Solution{
// 	public static void main(String[] args) {
// 		int arr[] = {1,3,5,6};
// 		insertPosition(arr, 1);
// 	}
// 	public static void insertPosition(int arr[], int val) {

// 		int n = arr.length;
		
// 		int f = 0;
// 		int l = n-1;

// 		int ans = -1;
		
// 		for(int i = 0 ; i< n ; i++){
// 			int mid = f = (l-f)/2;

// 			if(arr[mid] == val){
// 				ans = mid;
// 			}else if(arr[mid] < val){
// 				f = mid+1;
// 			}else if(arr[mid] > val){
// 				l = mid-1;
// 			}
// 		}
// 		System.out.print(ans);
// 	}
// }


// class Solution{
// 	public static void main(String[] args) {
// 		int arr[] = {1,3,5,6};
// 		int result = insertPosition(arr, 5);
// 		System.out.println(result);
// 	}
// 	public static int insertPosition(int arr[], int val) {

// 		int n = arr.length;
		
// 		int f = 0;
// 		int l = n-1;

// 		int ans = -1;
		
// 		while(f<=l){
// 			int mid = f = (l-f)/2;

// 			if(arr[mid] == val){
// 			return mid;
// 			}else if(arr[mid] < val){
// 				f = mid+1;
// 			}else if(arr[mid] > val){
// 				l = mid-1;
// 			}
// 		}
// 		return f;
// 	}
// }


// class Solution{
// 	public static void main(String[] args) {
// 		int arr[] = {1,2,3,0,0,0};
// 		int brr[] = {2,5,6};
// 		mergeSortedArray(arr, brr, arr.length, brr.length);
// 	}
// 	public static void mergeSortedArray(int arr[], int brr[], int m, int n) {

// 		int i = 0;
// 		int j = 0;

// 		while(i < m && j < n){
// 			if(arr[i] > brr[j]){
// 				arr[i] = brr[j];
// 				i++; j++;
// 			}
// 		}
// 		for(int k = 0 ; k< m ; k++){
// 			System.out.print(arr[k]);
// 		}

// 	}
// }

// ============================== 20 - oct ===================================

class Solution{
	public static void main(String[] args) {
		int arr[] = {1,2,3,0,0,0};
		int brr[] = {2,5,6};
		mergeArray(arr, brr);
	}	
	public static void mergeArray(int arr[], int brr[]) {
		
		int m = arr.length;
		int n = brr.length;

		int i = 0;
		int j = 0;
		int k = 0;

		int ans[] = new int[m+n];

		while(i<m && j<n){
			if( arr[i] < brr[j] || arr[i] == brr[j] ){
				ans[k] = arr[i]; k++; i++;
				ans[k] = brr[j]; k++ ; j++;
			}else{
				ans[k] = brr[j] ; k++; j++;
				ans[k] = arr[i] ; i++; k++;
			}
		}
		for(int t = 0; t< m+n ; t++){
			System.out.println(ans[t]);
		}
	}
}

//====================================================================

class Solution{
	public static void main(String[] args) {
		int arr[] = {2,2,1};
		majorityElement(arr);
	}

	public static void majorityElement(int arr[]){
		int n = arr.length;

		HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();

		for(int i = 0; i< n ; i++){
			myMap.put(arr[i], i);
		};

		for(int j = 0; j<n ;j++){
			int count = 0;
			if(myMap.containsKey(arr[j])){
				count++;
			}
			System.out.print(count);
		}


		
	}
}