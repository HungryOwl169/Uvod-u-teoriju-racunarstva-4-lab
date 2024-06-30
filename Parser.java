//package utr_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {

	static String niz = null;
	static char ulaz;
	static int ind = 0;

	public static void S() {
		System.out.print("S");
		if (ulaz == 'a') {
			ulaz = niz.charAt(ind++);
			A();
			B();
		}
		else if (ulaz == 'b') {
			ulaz = niz.charAt(ind++);
			B();
			A();
		}
		else {
			System.out.println();
			System.out.println("NE");
			System.exit(1);
		}
	}

	public static void A() {
		System.out.print("A");
		if (ulaz == 'b') {
			ulaz = niz.charAt(ind++);
			C();
		}
		else if(ulaz == 'a') {
			ulaz = niz.charAt(ind++);
		}
		else {
			System.out.println();
			System.out.println("NE");
			System.exit(1);
		}
	}

	public static void B() {
		System.out.print("B");
		if (ulaz == 'c') {
			ulaz = niz.charAt(ind++);
			if (ulaz != 'c') {
				System.out.println();
				System.out.println("NE");
				System.exit(1);
			}
			ulaz = niz.charAt(ind++);
			S();
			//ulaz = niz.charAt(ind++);
			if (ulaz != 'b') {
				System.out.println();
				System.out.println("NE");
				System.exit(1);
			}
			ulaz = niz.charAt(ind++);
			if (ulaz != 'c') {
				System.out.println();
				System.out.println("NE");
				System.exit(1);
			}
			ulaz = niz.charAt(ind++);
		}
		//ulaz = niz.charAt(ind++);
	}

	public static void C() {
		System.out.print("C");
		A();
		A();
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("src/utr_lab4/primjer.txt");
		//Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		niz = sc.nextLine();
		niz = niz + "$";
		
		ulaz = niz.charAt(ind++);
		S();
		
		if (ulaz != '$') {
			System.out.println();
			System.out.println("NE");
		}
			
		else {
			System.out.println();
			System.out.println("DA");
		}
			
	}

}
