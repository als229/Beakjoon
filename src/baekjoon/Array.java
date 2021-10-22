package baekjoon;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		int[] arr = new int[a];

		int max = 0;
		int min = 1000000;
		for(int i = 0; i <= arr.length-1; i++) {
			 arr[i] = scanner.nextInt();
			
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
			
		}
		System.out.println(min + " " + max);
	}

}
