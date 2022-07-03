package com.greatlearning.services.modifiedBinarySearch;

public class ModifiedBinarySearch {

	public int search(int[] array, int n, int key) {
		// TODO Auto-generated method stub
		int high = n-1;
		int pivot = findPivotElement(array, 0,high);
		if(pivot == -1) {
			return binarySearchImpl(array,0,high,key);
		}else if(array[pivot]==key)
			return pivot;
		else if(array[0]<=key) {
			return binarySearchImpl(array,0,pivot-1,key);
		}
		return binarySearchImpl(array,pivot+1,high,key);
	}

	private int binarySearchImpl(int[] array, int low, int high, int key) {
		// TODO Auto-generated method stub
		if(high < low) {
			return -1;
		}
		int mid = (low+high)/2;
		if(key==array[mid]) {
			return mid;
		}else if(key > array[mid]) {
			return binarySearchImpl(array,(mid+1),high,key);
		}
		return binarySearchImpl(array,low,(mid-1),key);
	}

	private int findPivotElement(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		if(high < low) {
			return -1;
		}else if(high == low)
			return low;
		int mid = (low+ high)/2;
		if(mid < high && array[mid]> array[mid+1])
			return mid;
		else if (mid > low && array[mid]< array[mid-1]) {
			return(mid-1);
		}else if (array[low] >= array[mid]) {
			return findPivotElement(array,low,mid-1);
		}
		return findPivotElement(array,mid+1,high);
		
	}

}





//Mid = 2  
//High = 5
//low = 0
//Array{mid} = 5

//Arraymid = 4
//array = 5