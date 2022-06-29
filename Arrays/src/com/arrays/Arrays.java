package com.arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.arrays.*;

public class Arrays {

	public static void main(String[] args) {
//		int[] testArray1 = {0,1,2,3,4,5,6,7,8,9};
//		int[] testArray2 = new int[10];
		List<String> testArrayList = new ArrayList<>();
		int[] testArray3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//		for(int i : testArray1) {
//			System.out.println(i);
//		}
		ArrayExcercise testArray4 = new ArrayExcercise();
		List<Integer> testArrayList2 = new ArrayList<>();

//		for(int i = 0; i < 10; i++) {
//			testArray2[i] = i;
//			System.out.println(testArray2[i]);
//		}
//		
//		for(int i = 0; i < testArray2.length; i++) {
//			testArray2[i] = i;
//			System.out.println(testArray2[i] * 10);
//		}

//		System.out.println(testArrayList);
//		testArrayList.add("First element");
//		testArrayList.add("Second element");
//		System.out.println(testArrayList);
//		System.out.println(testArrayList.get(0));
//		testArrayList.set(1, "Index 1");
//		System.out.println(testArrayList.get(1));
//		testArrayList.remove(1);
//		System.out.println(testArrayList);
//		System.out.println(testArrayList.size());
//		testArrayList.clear();
//		System.out.println(testArrayList);
//		for (int i = 0; i < testArrayList.size(); i++) {
//			System.out.println(testArrayList.get(i));
//		}
//		for (String i : testArrayList) {
//			System.out.println(i);
//		}
//		testArrayList.add("Third Element");
//		testArrayList.add("Fourth Element");
//		testArrayList.add("Fourth Index");
//		Collections.sort(testArrayList);
//		System.out.println(testArrayList);
//		Collections.swap(testArrayList, 0, 4);
//		System.out.println(testArrayList);
//		Collections.reverse(testArrayList);
//		System.out.println(testArrayList);
//		
//		for (int i : testArray3) {
//			int j = testArray3[i -1] * testArray3[i -1];
//			System.out.println(j);
//		
//		}

//		for (int i : testArray3) {
//			if (ArrayExcercise.evenOdd(i) == true) {
//				System.out.println((i) * (i) * (i));
//			} else {
//				System.out.println((i) * (i));
//			}
//	}

// ----------------------------------------------------	
// added elements to ArrayList 2
		for (int j = 0; j < 20; j++) {
			testArrayList2.add(j + 1);
		}
// ----------------------------------------------------
// Same as testArray 3 but as ArrayList
		for (int k : testArrayList2) {
			if (ArrayExcercise.evenOdd(k) == true) {
				System.out.println((int) Math.pow(k, 3));
			} else {
				System.out.println((int) Math.pow(k, 2));
			}
		}
	}
}
