package by.epam.petropavlovskaya.task2;

import java.util.Scanner;

public class Task_2_3_2 {

	public static void main(String[] args) {
		// ��������� ���������� ��� ���������� �����, ��� ����� � ������������ 
		String s;
		int mas[] = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117};
				
		System.out.println("������� ������:");
			
		/* ������� �������, ��� ���������� ���������� ������� � ��������� ��� � ����������.  
		 * � ������ ������� �������������� ���������� ���� ��� ����� ���������. 
		 */
		Scanner in = new Scanner(System.in);
		s = in.next();
		in.close();
		
		char c = s.charAt(0);
		
		
		/*for(int i:mas) {
			if(i==(int)c) {
				System.out.println(c + " - �������");
				break;
			}
			else {
				System.out.println(c + " - �� �������");
				//break;
			}
		}*/
		
		
	for(int i:mas) {
		if(i !=(int)c) {
			System.out.println(c + " - �� �������");
			break;
		}
		else {
			System.out.println(c + " - �� �������");
			//break;
		}
	}

	}

}
