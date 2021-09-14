package startJava;

import java.util.Random;
import java.util.Scanner;

public class Source2 extends Sources {

	public static void printNumberRange(int divider, int start, int end) {

		for (int i = start; i <= end; i++)
			if (i % divider == 0)
				System.out.println(i);

	}

	public static void vowels() {
		System.out.println("inserisci due stringhe");
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		if (word1.length() > word2.length()) {
			System.out.println(word1);
		} else if (word1.length() == word2.length())
			System.out.println(word1 + "\n" + word2);
		else {
			System.out.println(word2);
		}
		scan.close();
	}

	public static void stringLong() {
		System.out.println("inserisci una stringhe");
		Scanner scan = new Scanner(System.in);
		String string1 = scan.next();
		for (int i = 0; i < string1.length(); i++) {
			char c = string1.charAt(i);
			switch (c) {
			case 'a':
				System.out.println(c);
				break;
			case 'e':
				System.out.println(c);
				break;
			case 'i':
				System.out.println(c);
				break;
			case 'o':
				System.out.println(c);
				break;
			case 'u':
				System.out.println(c);
				break;
			}
			// if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c=='u')
			// System.out.println(string1.charAt(i));
		}
		scan.close();
	}

	public static void stringReverse() {
		System.out.println("inserisci una stringhe");
		Scanner scan = new Scanner(System.in);
		String string1 = scan.next();
		for (int i = string1.length() - 1; i >= 0; i--) {
			System.out.println(string1.charAt(i));
		}
		scan.close();
	}

	public static void summation(int num) {
		// int result = 0;
		// for (int i = 1; i <= 100; i++) {
		// result += i ;
		// }
		System.out.println((num * (num + 1)) / 2);
	}

	public static void fatt() {
		System.out.println("inserisci un numero");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		long result = 1;
		for (int j = 2; j <= num; j++) {
			result *= (long) j;
		}
		System.out.println(result);
		scan.close();
	}

	public static void string4chars() {

		int count = 0;
		System.out.println("inserisci una stringa");
		Scanner scan = new Scanner(System.in);
		String string1 = scan.nextLine();
		while (string1.length() < 4) {
			System.out.println("inserisci una stringa con più di 4 caratteri");
			string1 = scan.nextLine();

		}
		for (int i = 0; i < string1.length(); i++)
			if (string1.charAt(i) == 'a')
				count++;

		System.out.println(count);
		scan.close();

	}

	public static void aTo() {

		System.out.println("inserisci una stringa");
		Scanner scan = new Scanner(System.in);
		String string1 = scan.nextLine();
		String result = "";
		for (int i = 0; i < string1.length(); i++)
			if (string1.charAt(i) == 'a')
				result += '@';
			else
				result += string1.charAt(i);

		System.out.println(result);
		scan.close();

	}

	public static void averageFor3() {
		Scanner scan = new Scanner(System.in);
		int numbers;
		System.out.println("inserisci il numero >= 1");
		int index = scan.nextInt();
		int carry = 0;
		int cont = 0;
		while (index < 1) {
			System.out.println("inserisci il numero >= 1");
			index = scan.nextInt();
		}
		System.out.println("inserisci i numeri");
		for (int i = 0; i < index; i++) {
			numbers = scan.nextInt();
			if (numbers % 3 == 0) {
				cont++;
				carry += numbers;
			} else
				continue;
		}
		System.out.println((double) carry / cont);
		scan.close();
	}

	public static void parrot() {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci il numero >= 1");
		int index = scan.nextInt();

		while (index <= 0) {
			System.out.println("inserisci il numero >= 1");
			index = scan.nextInt();
		}

		System.out.println("inserisci una stringa");
		String string1 = scan.next();
		for (int i = 0; i < index; i++)
			System.out.println(string1);
		scan.close();

	}

	public static void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci il numero >= 1");
		int index = scan.nextInt();

		while (index <= 0) {
			System.out.println("inserisci il numero >= 1");
			index = scan.nextInt();
		}
		String result = "";
		System.out.println("inserisci una stringa");
		String string1 = scan.next();
		if (index < string1.length())
			for (int i = index; i < string1.length(); i++) 
				result += string1.charAt(i);
			
		System.out.print(result);
		scan.close();
	}
	

	public static void random(int num) {
		Random rand = new Random();
		System.out.println("Ciao, perderai anche questa volta!");
		
		int dado1=(rand.nextInt(6) + 1);
		System.out.println(dado1);
		int dado2=(rand.nextInt(6) + 1);
		System.out.println(dado2);
		int sum = dado1 + dado2;
	
		System.out.println(sum == 7 ? sum + " winner, questa volta ti è andata bene" : sum + " lose");
	
	}
	public static void random2() throws InterruptedException {
		Random rand = new Random();
		int even = 0;
		int dado = 0;
		for (int i = 0; i < 10; i++) {
			dado=(rand.nextInt(9) + 12);
			System.out.println(dado);
			if(dado%2==0) even++;
		}
		Thread.sleep(1000);
		System.out.println("pari: "+even);
		Thread.sleep(1000);
		System.out.println("dispari: "+ (10-even));
	
	}

	public static void asterisks() {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci il numero >= 1");
		int index = scan.nextInt();

		while (index <= 0) {
			System.out.println("inserisci il numero >= 1");
			index = scan.nextInt();
		}
		String chars = "*";
		for (int i = 0; i < index; i++) {
			System.out.println(chars);
			chars+="*";
		}		
		scan.close();

	}
	public static void equalsString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci una stringhe");
		String string1 = scan.next();
		System.out.println("inserisci una stringhe");
		String string2 = scan.next();
		boolean areEquals = false;
		if(string1.length() == string2.length())
		for (int i = string1.length() - 1; i >= 0; i--) 
			if(string1.charAt(i) != string2.charAt(i)) { 
				areEquals = false;
				break;
			}
		System.out.println(areEquals ? "uguali" : "diverse");
		
		scan.close();
	}
	
			}
