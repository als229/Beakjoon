package baekjoon;

import java.util.Scanner;

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

//public class ArrayPart {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int[] arr = new int[9];
//
//		int max = 1;
//		int num = 0;
//
//		for(int i = 0; i < 9; i++) {
//			int a = scanner.nextInt();
//			arr[i] = a;
//
//			if(max <= arr[i]) {max = arr[i];
//			num = i+1;}
//
//		}
//		System.out.println(max);
//		System.out.println(num);
//	}
//}
public class ArrayPart {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int d = a*b*c;
		String str = d + "";
		char sc = str.charAt(0);
		String result = "";
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sc = str.charAt(i);
			if( sc == '0') {
				
				result = 
			}
			
		}
		
		
		
		
	}
}

