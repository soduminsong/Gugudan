import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 2��
//		System.out.println("2��");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
		
		// 3��
//		System.out.println("3��");
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
		
		// 4��
//		System.out.println("4��");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
		//5��
//		System.out.println("������ �� ����� ���� ? ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
//		int i = 1;
//		while (i < 10) {
//			System.out.println(6 * i);
//			i++;
//		}
//		for(int j = 1; j < 10; j++) {
//			System.out.println(7 * j);
//		}
		
//		System.out.println("������ �Է� : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("number : " + number);
//		
//		if (number < 2) {
//			System.out.println("2�̻��� ���� �Է� �Ͻÿ�");
//		}else if (number > 9) {
//			System.out.println("9������ ���� �Է� �Ͻÿ� ");
//		}else {
//			for(int i =0;i<10;i++) {
//				System.out.println(i * number);
//			}
//		}
		int[] result = new int[9];
		for(int i =0;i<result.length; i++) {
			result[i] = 2 * (i + 1);
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		int[] times3 = new int[9];
		for(int i =0;i<times3.length; i++) {
			times3[i] = 3 * (i + 1);
		}
		
		for(int i=0;i<times3.length;i++) {
			System.out.println(times3[i]);
		}
	}
}
