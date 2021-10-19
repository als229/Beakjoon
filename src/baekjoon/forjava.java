package baekjoon;

import java.util.Scanner;


//1번 정답
//import java.util.Scanner;

//public class forjava {
	//
	//	public static void main(String[] args) {
	//		Scanner scanner = new Scanner(System.in);
	//		
	//		int a = scanner.nextInt();
	//		
	//		for(int i = 1; i <10;i++) {
	//			System.out.println(a +" * "+ i+" = " +a*i);
	//		}
	//	}
	//
//}




//2번 정답
//import java.util.Scanner;
//public class forjava {
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//
//		int a = scanner.nextInt();
//		for (int i = 0; i < a;i++) {
//			int b = scanner.nextInt();
//			int c = scanner.nextInt();
//
//			System.out.println(b+c);
//
//		}
//
//	}
//}


//3번 정답
//import java.util.Scanner;
//
//public class forjava {
//	
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		int sum = 0;
//		
//		int a = scanner.nextInt();
//		
//		for (int i = 1; i <=a;i++) {
//			
//			sum += i;
//
//		}
//		System.out.println(sum);
//
//	}
//}

//5번 답
//public class forjava {
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for(int i = 1; i <= num; i++) {
//			System.out.println(i);
//		}
//			
//	}
//}


//6번 답 
//public class forjava {
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for(int i = num; i >0; i--) {
//			System.out.println(i);
//		}
//			
//	}
//}

//7번답
//public class forjava {
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		
//		for(int i = 1; i <= a; i++) {
//			int b = sc.nextInt();
//			int c = sc.nextInt();
//
//			System.out.println("Case #"+i+": "+(b+c));
//		}
//		
//	}
//}

//8번 답
//public class forjava {
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		
//		for(int i = 1; i <= a; i++) {
//			int b = sc.nextInt();
//			int c = sc.nextInt();
//
//			System.out.printf("Case #%d: %d + %d = %d%n",i ,b , c, (b+c));
//		}
//		
//	}
//}

//9번 답
//public class forjava {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		
//		for(int i = 1; i <= a; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}

//10번 답
public class forjava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for(int i = 1; i <= a; i++) {

			for(int j = 0; j < a-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}









