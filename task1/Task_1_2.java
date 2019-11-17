package by.epam.petropavlovskaya.task1;

import java.util.Scanner;

public class Task_1_2 {
	static int din_mass;

	public static void main(String[] args) {
		scanMass();
		printMass();
	}

	static void scanMass(){
		System.out.println("Please, enter the mass of the dinosaur in KG:");

		/* ������� �������, ��� ���������� ������ �����. � ������ ������� ������������� ���������
		 * ����� "�� �����", �� �� ������������� ��������� �������� �������������� �����.
		 */
		Scanner in = new Scanner(System.in);

		/* ��������� �����, ��������� � ������� � ��������� ��� �������� � ����������,
		 * ������ � ������� ����������.
		 */
		try {
			din_mass = in.nextInt();
		}catch (RuntimeException e) { System.out.println("You didn't enter a number!");
		}finally {in.close();
		}

	}

	static void printMass(){
		System.out.println("the mass of the dinosaur is: \n" + din_mass*1000000 + " mg" + '\n' +
				din_mass*1000 + " gr" + '\n' +
				(double)din_mass*0.001 + " tons" );
	}



}
