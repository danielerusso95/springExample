package startJava;

import java.util.Scanner;

public class Sources {
	public static int getNumber() {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci il numero");
		number = scan.nextInt();
		scan.close();
		return number;
	}

	public static double[] getTwoNumbers() {
		Scanner key = new Scanner(System.in);
		double numbers[] = new double[2];
		System.out.println("Inserisci due numeri");
		numbers[0] = key.nextDouble();
		numbers[1] = key.nextDouble();
		key.close();
		return numbers;
	}

	public static void chars() {
		Scanner key = new Scanner(System.in);
		char chars[] = new char[2];
		System.out.println("Inserisci il primo carattere");
		chars[0] = key.next().charAt(0);
		System.out.println("Inserisci il secondo carattere");
		chars[1] = key.next().charAt(0);
		key.close();
		System.out.println("Le lettere sono: " + chars[0] + " " + chars[1]);
	}

	public static void sum(double[] numbers) {

		System.out.println((double) (numbers[0] + numbers[1]));
	}

	public static void product(double[] numbers) {

		double division = numbers[0] * numbers[1];
		System.out.println("Il prodotto vale: " + division);

	}

	public static void division(double[] numbers) {

		double division = numbers[0] / numbers[1];
		System.out.println("Il rapporto vale: " + division);

	}

	public static void checkNumbers(int number) {

		if (number >= 0) {
			System.out.println("il numero è positivo");
		} else {
			System.out.println("il numero è negativo");
		}
	}

	public static void multipleNumbers(double number1, double number2) {

		if (number2 >= number1) {
			if (number2 % number1 == 0)
				System.out.println("il primo è un multiplo del secondo");
			else
				System.out.println("il primo non è un multiplo del secondo");
		} else
			System.out.println("Attenzione, il primo numero deve essere minore o uguale al secondo");

	}

	public static void multiplicationTable(int number) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(number + "*" + i + "=" + number * i);
		}
	}

	public static void unicode() {
		for (int i = 0; i < 2000; i++) {
			System.out.println((char) i);
		}
	}

	public static void stopAtZero() {

		System.out.println("inserisci una serie di numeri");
		boolean isZero = false;
		int number;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		while (!isZero) {
			number = scan.nextInt();
			result = result + number;
			if (number == 0)
				isZero = true;
		}
		scan.close();
		System.out.println("La somma dei numeri inseriti è: " + result);
	}

	public static void stopAtNegativeOne() {

		System.out.println("inserisci una serie di numeri");
		boolean isZero = false;
		int number;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		do {
			number = scan.nextInt();
			if (number % 5 == 0)
				result = result + number;
			if (number == -1)
				isZero = true;
		} while (!isZero);

		scan.close();
		System.out.println("La somma dei numeri inseriti è: " + result);
	}

	public static void averageBeetweenTenTwenty() {

		System.out.println("inserisci una serie di numeri");
		int number;
		double result = 0;
		int count = 1;
		Scanner scan = new Scanner(System.in);
		for (;;) {
			number = scan.nextInt();
			if (number >= 10 && number <= 20) {
				result += number;
				count++;
			} else {
				result = (double) result / count;
				break;
			}
		}
		scan.close();
		System.out.println("La somma dei numeri inseriti è: " + result);
	}

	public static void higherZero() {

		System.out.println("inserisci un numero");
		int number;
		Scanner scan = new Scanner(System.in);
		for (;;) {
			number = scan.nextInt();
			if (number > 0) {
				System.out.println(number);
				break;
			} else {
				System.out.println("no reinsert");
				continue;
			}
		}
		scan.close();
	}

	public static void evenBeforeOdd() {
		System.out.println("inserisci una serie di numeri");
		int numbers;
		int old = 0;
		int old2 = 0;
		String result = "";
		Scanner scan = new Scanner(System.in);
		for (;;) {
			numbers = scan.nextInt();
			result += numbers + " ";
			if (old % 2 != 0 && old2 % 2 == 0 && numbers == -1) {
				System.out.println(result);
				System.out.println("\nsequenza valida");
				scan.close();
				break;
			} else if (numbers == -1)
				System.out.println("\nsequenza non valida");
			else {
				old2 = old;
				old = numbers;
				continue;
			}
		}
	}

	
}	
	


