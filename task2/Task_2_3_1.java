package by.epam.petropavlovskaya.task2;

import java.util.Scanner;

public class Task_2_3_1 {

	public static void main(String[] args) {
		// ��������� ���������� ��� ���������� �����, ��� ����� � ������������ 
		String s;
				
		System.out.println("������� ������:");
			
		/* ������� �������, ��� ���������� ���������� ������� � ��������� ��� � ����������.  
		 * � ������ ������� �������������� ���������� ���� ��� ����� ���������. 
		 */
		Scanner in = new Scanner(System.in);
		s = in.next();
		in.close();
		
		char c = s.charAt(0);
		
		switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case '\u0041':
				System.out.println(c + " - �������");
				break;
			default: 
				System.out.println(c + " - �� �������");
		}

	}

}
