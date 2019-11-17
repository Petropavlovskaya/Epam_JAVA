package by.epam.petropavlovskaya.task1;

import java.util.Scanner;

public class Task_1_6 {
	// ��������� ���������� ��� ���������� ����� � ��� ����
	static int num;
	static int mas[] = new int[7];

	public static void main(String[] args) {
		scanNumber();
		splitNumber();
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

	static void splitNumber(){
		// ���������� ����� ����� � ������
		for(int i=0; num>0; i++) {
			mas[i] = num%10;
			num/=10;
		}
	}

	static void printRez(){
		// �.�. ����� � ������ ��������� � �����, ������� �������� ������� ����� foreach
		for(int i:mas)
			System.out.print(i);
	}

}
