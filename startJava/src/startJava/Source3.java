package startJava;

import java.util.Random;
import java.util.Scanner;

public class Source3 extends Source2 {

	public static void temps() {
		int [] temps = new int[24];
		Random rand = new Random();
		int min=100;
		int max=0;
		int average = 0;

		for(int i=0;i< temps.length ; i++) {
			temps[i]=(rand.nextInt(9) + 21);
			average+=temps[i];
			if(i%6==0 && i!=0) System.out.print("\n");
			System.out.print(temps[i]+" ");
			if(min>temps[i]) min=temps[i];
			else if(max<temps[i]) max=temps[i];
		}

		System.out.println("\nla media è: " + ((double) average/temps.length));
		System.out.println("la temp minima è: "+min);
		System.out.println("la temp massima è: "+max);

	}
	public static void even() {
		int [] vett = {55, 12, 66, -8, 77};
		for(int i:vett) 
			System.out.print(i%2==0 ? i+"\n" : "" );
	}

	public static void div() {

		Scanner scan = new Scanner(System.in);
		int index;

		do{
			System.out.println("inserisci il numero >= 1");
			index = scan.nextInt();
		}while (index <= 0);

		int [] vett = {2, 4, 6, 10};
		boolean isEven=false;
		for(int i:vett) 
			if(!(i%index==0)) {
				System.out.println("i numeri non sono divisibili");
				break;
			}
			else isEven=true;


		if(isEven) System.out.println("i numeri sono tutti divisibili per il numero inserito");
		scan.close();

	}

	public static void vettStr() {

		String [] vett = {"ala", "oho", "forse", "buono"};
		for(String el:vett) {
			System.out.println(el.charAt(0)==el.charAt(el.length()-1)? el: "");
		}	
	}
	public static void vett100() {

		int [] vett = new int[100];
		for (int i = 0; i < vett.length; i++) {
			vett[i]= (i+1)*5;
			System.out.println(vett[i]);
		}	
	}
	public static void vettPal() {
		Scanner scan = new Scanner(System.in);
		int index;
		boolean isPal=true;

		do{
			System.out.println("inserisci il numero di elementi >=1");
			index = scan.nextInt();
		}while (index <= 0);

		int [] vett = new int[index];

		for (int i = 0; i < vett.length; i++) {
			System.out.println("inserisci il " +(i+1)+"° elemento");
			vett[i]=scan.nextInt();
		}

		for (int i = 0,j=vett.length-1; i < vett.length; i++,j--) {
			if(vett[i]!=vett[j]) {
				isPal=false;
				break;
			}
			if(i==j)break;
		}
		System.out.println(isPal);
		scan.close();

	}
	public static void vettCresc() {
		boolean isCresc=true;

		int [] vett = {1,2,4,5};

		for (int i=0;i<vett.length-1; i++) {
			if(vett[i]>vett[i+1]) {
				isCresc=false;
			}
		}
		System.out.println(isCresc);


	}
	public static void vettDupl() {
		boolean isCresc=true;

		int [] vett = {1,2,5,1,4,6,78,9,22,12,21,4};

		for (int i=0,j=vett.length-1;i<vett.length-1; j--) 
			if(vett[i]==vett[j]) {
				isCresc=false;
				break;
			}else if(j==0) {
				j=vett.length-1;
				i++;
			}
		System.out.println(isCresc==false ? "contiene duplicati" : "Non contiene duplicati");
	}
	public static void matrix() {

		int [][] vett = new int[3][3];
		Random rand = new Random();	
		for (int i=0,j=vett.length-1;i < vett.length; j--) { 
			if(j==0) {
				vett[i][j]=(rand.nextInt(11)+1);
				i++;
				j=vett.length;
			}else {
				vett[i][j]=(rand.nextInt(11)+1);
			}
		}
		for (int i = 0,j = vett.length-1; i < vett.length; j--) {
			System.out.println(vett[i][j]);
			if(j==0) {
				i++;
				j=vett.length;
			}
		}

	}
	public static void cinema() {
		Random rand = new Random();

		boolean [][] vett = new boolean[3][3];
		for (int i = 0; i < vett.length; i++) {
			for (int j = 0; j < vett.length; j++) {
				vett[i][j] = rand.nextBoolean();
				System.out.print(vett[i][j]);
			}
			System.out.println("\n");
		}
		Scanner scan = new Scanner(System.in);
		int x,y;

		do{
			System.out.println("inserisci la coordinata x (maggiore uguale a 0)");
			x = scan.nextInt();
			System.out.println("inserisci la coordinata y (maggiore uguale a 0)");
			y = scan.nextInt();
		}while (x < 0 && y < 0);

		if(vett[x][y]==false) {
			vett[x][y]= true;
			System.out.println("ti sei seduto");
		}
		else System.out.println("posto occupato");
		scan.close();
	}


}
