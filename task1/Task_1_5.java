package by.epam.petropavlovskaya.task1;

import java.util.Scanner;

public class Task_1_5 {
	static int num, sum=0, mul=1;	// ��������� ���������� ��� ���������� �����, ��� ����� � ������������

	public static void main(String[] args) {
		scanNumber();
		calcSumMult();
		printRez();
	}

	static void scanNumber(){
		System.out.println("Please, enter the number:");

		/* ������� �������, ��� ���������� ���������� ����� � ��������� ��� � ����������.
		 * � ������ ������� ��������������, ��� �������� ������������� �����
		 */
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
	}

	static void calcSumMult(){
		// ��������� ����� � ������������ ���� ���������� �����
		for(; num>0; ) {
			sum += num%10;	// ��������� �����
			mul *= num%10;	// ����������� �����
			num/=10;
		}
	}

	static void printRez(){
		// ������� ��������� �� ������
		System.out.printf("������� �������������� ���� ���������� �����: %.2f \n", (float)sum/6);
		System.out.printf("������� �������������� ���� ���������� �����: %.2f", (float)Math.pow(mul, 1.0/6.0));
	}



}
