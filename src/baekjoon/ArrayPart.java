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

//2번 답 

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

// 실패한 답 
//public class ArrayPart {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);

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

// 3번 답
//public class ArrayPart {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		 
//		int value = (in.nextInt() * in.nextInt() * in.nextInt());
//		String str = Integer.toString(value);
//		in.close();
//		
//		for (int i = 0; i < 10; i++) {
//			int count = 0;
//			for (int j = 0; j < str.length(); j++) {
//				if ((str.charAt(j) - '0') == i) {
//					count++;
//				}
//			}
//			System.out.println(count);
//		}
//		
//	}
//}

// 4번 답
//public class ArrayPart {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[10];
//		int[] arr2 = new int[10];
//		int count = 0;
//		
//		for (int i = 0; i < 10; i++) {
//			int a = sc.nextInt();
//			arr[i] = a;
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr2[i] = arr[i] % 42;
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			boolean bl = false;
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr2[i] == arr2[j]) {
//					bl = true;
//					break;
//				}
//			}
//			if(bl == false) {
//				count++;
//			}
//		}
//		System.out.println(count);
//
//	}
//}


// 5번답 
public class ArrayPart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double max = 0;
		double avg = 0;
		double sum = 0;
		
		double[] arr = new double[a];
		double[] arr2 = new double[a];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i =0 ; i < a; i++) {
			arr2[i] = arr[i]/max*100;
		}
		for(int i = 0; i < a ; i++) {
			sum += arr2[i];
		}
		System.out.println(max + "  max");
		System.out.println(Arrays.toString(arr2)+  "   arr2");
		System.out.println(sum + "    sum");
		avg = sum/a;
		System.out.println(avg);
		
	}
}