package startJava;

import java.util.Scanner;

public class Chess {
private String[][] vett;
	
	public void chessGame() {
		vett = new String[8][8];
		fillBoard();
	}
	
	public void fillBoard() {
		int i = 0;

		for (; i < vett.length; i++) {
			for (int j = 0; j < vett.length; j++) {
				for (int j2 = 0; j2 < 12; j2++) {
					vett[i][j] =  fillPoint(i==vett.length-2,"p",i,j);
				}
				vett[i][j] = i==1 ? "P" : "";
				vett[i][j] =  i==vett.length-2 ? "p" : vett[i][j]; 
				vett[i][j] = ((i==0 && j==0) || (i==0 && j==vett.length-1) ) ? "T" : vett[i][j];
				vett[i][j] = ((i==0 && j==1) || (i==0 && j==(vett.length-2)) ) ? "H" : vett[i][j];
				vett[i][j] = ((i==0 && j==2) || (i==0 && j==(vett.length-3)) ) ? "A" : vett[i][j];
				vett[i][j] = ((i==0 && j==3)) ? "Q" : vett[i][j];
				vett[i][j] = ((i==0 && j==(vett.length-4)) ) ? "K" : vett[i][j];
				vett[i][j] = ((i==vett.length-1 && j==0) || (i==vett.length-1 && j==vett.length-1) ) ? "t" : vett[i][j];
				vett[i][j] = ((i==vett.length-1 && j==1) || (i==vett.length-1 && j==vett.length-2) ) ? "h" : vett[i][j];
				vett[i][j] = ((i==vett.length-1 && j==2) || (i==vett.length-1 && j==vett.length-3) ) ? "a" : vett[i][j];
				vett[i][j] = ((i==vett.length-1 && j==3)) ?"q" : vett[i][j];
				vett[i][j] = ((i==vett.length-1 && j==vett.length-4) ) ?"k" : vett[i][j];
			}
		}
	}
	
	public String fillPoint(boolean bool,String str,int i,int j) {
		return bool ? str : vett[i][j];
		
	}
	
	public void printBoard() {
		System.out.println("_________________________________");
		for (int i = 0; i < vett.length; i++) { 
			for (int j = 0; j < vett.length; j++) {
				
				System.out.print(vett[i][j]!="" ? "|_"+vett[i][j]+"_":"|___");
				
			}
			System.out.print("|");
			System.out.println("");
		}
	}
	public void move() {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci coordinate del pedone che vuoi muovere: ");
		boolean isEmpty=true;
		int x,y;
		do {	
			System.out.println("inserisci la x");
			x = scan.nextInt();
			System.out.println("inserisci la y");
			y = scan.nextInt();
			if(vett[x][y]=="") System.out.println("casella vuota" + vett[x][y]);
			else isEmpty=false;
		}
		while(isEmpty==true);
		System.out.println("quante caselle vuoi avanzare?");
		int steps = scan.nextInt();
		if(x==6) {
			vett[x-steps][y]=vett[x][y];
			vett[x][y]="";
			printBoard();
		}else if(x==1) {
			vett[x+steps][y]=vett[x][y];
			vett[x][y]="";
			printBoard();
		}
		scan.close();
	}
	
}


