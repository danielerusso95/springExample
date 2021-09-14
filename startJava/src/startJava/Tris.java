package startJava;

import java.util.Random;

public class Tris {
	
	private String[][] vett;
	
	public void trisGame() {
		vett = new String[3][3];
		fillBoard();
	}
	
	private void fillBoard() {
		Random rand = new Random();
		for (int i = 0; i < vett.length; i++) {
			for (int j = 0; j < vett.length; j++) {
				vett[i][j] = rand.nextBoolean()==true ? "o":"x"; 
			}
		}
	}
	
	public void printBoard() {
		for (int i = 0; i < vett.length; i++) {
			for (int j = 0; j < vett.length; j++) {
				System.out.print(vett[i][j]);
			}
			System.out.println("\t");
		}
	}
	
	public void checkWinnerRow() {
		for (int i = 0; i < vett.length; i++) {
			for (int j = 0; j < vett.length;) {
				if(vett[i][j]==vett[i][j+1] && vett[i][j]== vett[i][j+2]) {
					System.out.println("winner is: "+ vett[i][j]);
					break;
				}
			}
		}
	}
	public void checkWinnerCol() {
		for (int i = 0; i < vett.length;) {
			for (int j = 0; j < vett.length;) {
				if(vett[i][j]==vett[i+1][j]&& vett[i][j]== vett[i+2][j]) {
					System.out.println("winner is: "+ vett[i][j]);
					break;
				}
			}
			break;
		}
	}
	public void checkWinnerD() {
		for (int i = 0; i < vett.length;) {
			for (int j = 0; j < vett.length;) {
				if(vett[j][i]==vett[j+1][i+1]&& vett[j][i]== vett[j+2][i+2]) {
					System.out.println("winner is: "+ vett[j][i]);
					break;
				}
				if(vett[j][i+2]==vett[j+1][i+1]&& vett[j][i+2]==vett[j+2][i]) {
					System.out.println("winner is: "+ vett[j][i+2]);
					break;
				}			
			}
			break;
		}
	}
}
	


