package by.epam.petropavlovskaya.task1;

import java.util.Scanner;

public class Task_1_7 {
	static int a, b;	// ��������� ���������� ��� ��������� �����

	public static void main(String[] args) {
		scanNumber();
		replaceNumber();
		printRez();
	}

	static void scanNumber(){
		// ������� �������, ��� ���������� ������ �����. � ������ ������� �� ������������� �������� �������� ������
		Scanner in = new Scanner(System.in);

		// ��������� �����, ��������� � ������� � ��������� �� �������� � ����������.
		System.out.println("Please, enter the number 1:");
		a = in.nextInt();
		System.out.println("Please, enter the number 2:");
		b = in.nextInt();
		in.close();
	}

	static void replaceNumber(){
		// ������ ����� �������
		a=a+b;
		b=a-b;
		a=a-b;
	}

	static void printRez(){
		System.out.println("New number 1 is: " + a);
		System.out.println("New number 2 is: " + b);
	}

}
