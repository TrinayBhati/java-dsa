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

/////=========================================================


1. 3 Sum
2. Find only unique elements from these 2 arary .
[ 1, 45, 5 ,7, 9 , 5]

[ 2,1,5,6,1,9 ]
Output: [2, 6, 7, 45]
3. Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.

Examples:  

Input: 
arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
Output: 3 4 5 6 7 1 2
4. Write a program to print the kth smallest element in array
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
5. Count Subarrays with LCM equals K
6. Finding Pivot Integer
7. Given a 2D array, print it in spiral form.
8. Write an efficient program for printing K largest elements in an array. Elements in an array can be in any order. Print the elements in decreasing order 
==============

2. arr[]= {9,6,7,3,1,5} sort this array with the help of bubble sort.

================
1)

-> Not Answered

2) Write a program to sort an array
->Not Answered

3) Write a program to find whether the number is prime or not 
-> Answered

4) Mention some difference between linear search and Binary Search  (Answered)

5) Explain about Hashing (Not Clear)

======================
1. 
2. 

======



========================
1- Advantages and Disadvantage of Array. 
2- Linear Search VS Binary Search.
Task 3 :- First and Last Position of an Element in a Sorted Array :- https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
Task 4:- Print Sum of Diagonals of a 2D matrix :- https://leetcode.com/problems/matrix-diagonal-sum/


===============
1) Explain about binary search
-> answered

2) Explain about linked list
-> Answered

3) print the min value in the stack when popping along with the popping element
ex=> 
input
6
8 5 3 1 2 3
output
3:1
2:1
1:1
3:3
5:5
8:8

-> Not Answered

4) Given an array arr[] of non-negative integers and an integer sum, find a subarray that adds to a given sum.
Note: There may be more than one subarray with sum as the given sum, print first such subarray. 
Examples: 
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33

-> Not Answered

5) provide output for below code snippets
*    int[] a=new int[5];
	for(int i=0;i<a.length;i++)
	{
	  System.out.println(a[i]);
	}
-> Answered
* System.out.print(""+1+1)
-> Wrong Answered
* System.out.print("1"+1+1)
-> Wrongly Answered

6) Explain about to implement queue using Stack
-> Not Answered

===========
1. to find the index at which an element should be inserted in a sorted array such that it 
remain sorted
2. Max number in the right side of an array.
3. Find the square root of a number using binary search
4. Find whether a number is prime or not in square root of n complexity