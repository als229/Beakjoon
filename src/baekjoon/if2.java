package baekjoon;

//import java.util.Scanner; * ����

//public class if2{
//	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
//		
//		int a = scanner.nextInt();
//		
//		if ((a %4==0 && a%100!=0) || a%400 ==0) {
//			System.out.println("1");
//		}else {
//			System.out.println("0");
//		}
//	}
//}

//����
//import java.util.Scanner; 
//
//public class if2 {
//	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
//		
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		
//		if (a >0 && b>0) {
//			System.out.println("1");
//		}else if (a>0 && b<0 ) {
//			System.out.println("4");
//		}else if (a <0 && b>0) {
//			System.out.println("2");
//		} else System.out.println("3");
//	}
//}
import java.util.Scanner; 

public class if2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = 45;
		b = b-c;
		if(b <0) {
			b = b+60;
			a = a-1;
		}
		if(a <0) {
			a= a+24;
		}


		System.out.println(a +" "+ b);
	}
}





















