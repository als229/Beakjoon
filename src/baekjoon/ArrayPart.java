package baekjoon;

import java.util.Arrays;
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
//public class ArrayPart {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int Count0 = 0;
//		int Count1 = 0;
//		int Count2 = 0;
//		int Count3 = 0;
//		int Count4 = 0;
//		int Count5 = 0;
//		int Count6 = 0;
//		int Count7 = 0;
//		int Count8 = 0;
//		int Count9 = 0;
//		
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		int c = scanner.nextInt();
//
//		int d = a * b * c;
//		String str = d + "";
//		char[] sc = new char[str.length()];
//		for (int i = 0; i < str.length(); i++) {
//			sc[i] = str.charAt(i);
//		}
//		System.out.println(Arrays.toString(sc));
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0 ; j < str.length() ; j++) {
//				if((int)sc[j] == 48+i ) {
//					numCount++;
//				}
//			}
//			System.out.println(numCount);	
//		}
//		
//	}
//}



public class ArrayPart {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int value = (in.nextInt() * in.nextInt() * in.nextInt());
		String str = Integer.toString(value);
		in.close();
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if ((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
}
