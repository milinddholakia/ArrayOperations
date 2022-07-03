package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.services.arrayRotation.ArrayRotation;
import com.greatlearning.services.mergeSort.MergeSort;
import com.greatlearning.services.modifiedBinarySearch.ModifiedBinarySearch;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		System.out.println("Enter the"+ size + " Elements");
		int array[]=new int[size];
		for(int i =0;i<size ;i++) {
			array[i]=sc.nextInt();
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array,0,array.length -1);
		System.out.println("Sorted Array is ");
		for(int i =0;i<size ;i++) {
			System.out.println(array[i]+ " ");			
		}
		ArrayRotation arrayRotation = new ArrayRotation();
		int mid = array.length/2;
		arrayRotation.leftRotate(array,mid,size);
		System.out.println("Rotated Array is ");
		for(int i =0;i<size ;i++) {
			System.out.println(array[i]+ " ");			
		}
		System.out.println();
		System.out.println();
		System.out.println("Enter the key");
		int key = sc.nextInt();
		ModifiedBinarySearch pivotedBinarySearch = new ModifiedBinarySearch();
		int index = pivotedBinarySearch.search(array,array.length,key);
		System.out.println((index>-1)?"Key is present at "+ index : "Element does not exist");
		sc.close();
	}
}