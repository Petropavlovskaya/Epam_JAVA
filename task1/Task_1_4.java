package by.epam.petropavlovskaya.task1;

import java.util.Scanner;

public class Task_1_4 {
	// ��������� ���������� ��� ���������� ����� � ������������ ��� ����
	static int i, n1, n2, n3, n4;

	public static void main(String[] args) {
		scanNumber();
		splitNumber();
		compareNumber();
	}

	static void scanNumber(){
		System.out.println("Please, enter the number:");

		/* ������� �������, ��� ���������� ���������� ����� � ��������� ��� � ����������.
		 * � ������ ������� �������������� ���������� ���� (�������� �������������� �����)
		 */
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		in.close();
	}

	static void splitNumber(){
		// ��������� ����� �� �����. �.�. ���������� ���� �����, ��������� ��� �������
		n1 = i/1000;	//  ������ ����� �����
		n2 = i/100%10;	//  ������ ����� �����
		n3 = i/10%10;	//  ������ ����� �����
		n4 = i%10;		//  ��������� ����� �����
	}

	static void compareNumber(){
		if( n1<n2 & n2<n3 & n3<n4 )
			System.out.println("This sequence is increasing");

		else if( n1>n2 & n2>n3 & n3>n4 )
			System.out.println("This sequence is decreasing");
		else
			System.out.println("This sequence is messy");
	}

}
