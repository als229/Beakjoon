package baekjoon;

import java.util.Scanner;

public class ArrayPart {

	public static void main(String[] args) {
		//		Scanner scanner = new Scanner(System.in);
		//
		//		int a = scanner.nextInt();
		//
		//		int[] arr = new int[a];
		//
		//		int max = 1;
		//		int min = 1000000;
		//
		//		for(int i = 0; i <= arr.length-1; i++) {
		//			arr[i] = scanner.nextInt();
		//		}
		//		for(int i = 0; i <= arr.length-1; i++) {
		//			if(max <= arr[i]) max = arr[i];
		//			if(min >= arr[i]) min = arr[i];
		//		}
		//		System.out.println(min + " " + max);


		//2¹ø ´ä 
		method1();

	}
	public static void method1() {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[9];

		int max = 1;
		int num = 0;

		for(int i = 0; i < 9; i++) {
			int a = scanner.nextInt();
			arr[i] = a;
			
			if(max <= arr[i]) {max = arr[i];
			num = i;}

		}
		System.out.println(max);
		System.out.println(num);
	}
}


