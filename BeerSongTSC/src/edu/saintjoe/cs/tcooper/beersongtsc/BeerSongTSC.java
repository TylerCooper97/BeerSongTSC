package edu.saintjoe.cs.tcooper.beersongtsc;

public class BeerSongTSC {

	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0) {//while there's bottles do this
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;//subtract 1 from beerNum
			
			if (beerNum == 1) {
				word = "bottle"; //singular, as in one bottle
			}
			
			if (beerNum > 0) {//adjust for case of no bottles
				System.out.println(beerNum + " " + word + " of beer on the wall");
			} else {
				System.out.println(" no more bottles of beer on the wall");
			
			}//end else
		}//end while loop
	}//end main method
}//end class
