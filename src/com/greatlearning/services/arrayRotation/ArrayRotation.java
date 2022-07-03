package com.greatlearning.services.arrayRotation;

public class ArrayRotation {

	public void leftRotate(int[] array, int mid, int size) {
		// TODO Auto-generated method stub
		for(int i =0;i< mid;i++) {
			leftRotateByOne(array,size);
		}
	}

	private void leftRotateByOne(int[] array, int size) {
		// TODO Auto-generated method stub
		int i ,temp;
		temp = array[0];
		for(i=0;i<size-1;i++) {
			array[i]= array[i+1];
		}
		array[size-1]=temp;
	}

}
