package baekjoon;

public class Function {

	public static void main(String[] args) {

	}

	//1�� ��
	class Test {
		long sum(int[] a) {
			long sum = 0; // a �迭 ���� �� ����

			for (int i = 0; i < a.length; i++) {
				sum += a[i];
			}
			return sum;
		}
	}
}