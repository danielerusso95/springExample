package recap;


import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isP = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci un numero");
		int num = scanner.nextInt();
		if(num<0) num = -num;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				isP=false;
				break;
			}
		}
		System.out.println(isP ? "il numero è primo" : "il numero non è primo");
		scanner.close();
		
	}

}
