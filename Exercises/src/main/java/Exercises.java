/**
 * 	//Creare uan funzione che prenda in vettore di interi
	//e restituisce vero se il vettore e' fatto tutto da elementi diversi.

	// [7 8  8 1 ] ----> false

	// [7 6 1 0 ] ---> true.
 */

/*Create a function that takes a string, checks if it has the same number of x's and o's and returns either true or false.
Rules

    Return a boolean value (true or false).
    Return true if the amount of x's and o's are the same.
    Return false if they aren't the same amount.
    The string can contain any character.
    When "x" and "o" are not in the string, return true.
getXO("ooxx") ➞ true

getXO("xooxx") ➞ false

getXO("ooxXm") ➞ true
// Case insensitive.

getXO("zpzpzpp") ➞ true
// Returns true if no x and o.

getXO("zzoo") ➞ false*/
public class Exercises {
	/*
	public int minMax(int[] array) {
	 List<Integer> b = Arrays.asList(ArrayUtils.toObject(array));


	 System.out.println(Collections.min(b));
	 System.out.println(Collections.max(b));
	}*/	
/*
	public double sumRes(int[] arr){
		  double res = 0;
		  for (int i = 0; i < arr.length; i++) {
			  System.out.print((double)1/arr[i]);
		    res = res+ 1 / arr[i];
		  }
		  return (double)1  / res;
	}*/
/*	
	public boolean sameXandO(String word) {
	int count1=0;
	int count2=0;
			for (int i = 0; i < word.length(); i++) {
				if(word.charAt(i) == 'x') count1++;
				if(word.charAt(i) == 'o') count2++;
				
			}
		if (count1 == count2 || (count1==0 && count2==0))
			return true; 
		return false;
	}*/
/*
	public boolean finalString(String word1,String word2) {
		int count=0;
		if(word1.length() > word2.length())
			for (int i = 0, j = word1.length()-word2.length(); i < word2.length();j++, i++) {
				if(word1.charAt(j) == word2.charAt(i)) count++;
				else return false;
			}
		if (count == word2.length())
			return true; 
		return false;
	}*/
	//	public boolean areNotEquals(int []numbers) {
	//		for (int i = 0; i < numbers.length; i++) 
	//			for (int j = i+1; j < numbers.length; j++) 
	//				if(numbers[i]==numbers[j]) return false;
	//		return true;
	//		
	//	}
	//	
	//
	//
	//	public void triangle() {
	//		 int k = 1;
	//
	//	      for(int i = 0; i <= 10; i++) {
	//	         for(int j=0;j < i; j++){
	//	            System.out.print(" "+k++);
	//	         }
	//	         System.out.println();
	//	      }
	//	}

}
