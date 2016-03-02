/**
 * This program simulates the card game Memory, in which the players turn up a pair
 * of cards to see if they match, and leave them up if they do.
 * @author Nathan
 * @version 1.0
 */
import java.util.*;

public class Memory {
	
	
	static int[] Array1 = new int[20];{
		Array1[0] = 1;
		Array1[1] = 1;
		Array1[2] = 1;
		Array1[3] = 1;
		Array1[4] = 1;
		Array1[5] = 1;
		Array1[6] = 1;
		Array1[7] = 1;
		Array1[8] = 1;
		Array1[9] = 1;
		Array1[10] = 1;
		Array1[11] = 1;
		Array1[12] = 1;
		Array1[13] = 1;
		Array1[14] = 1;
		Array1[15] = 1;
		Array1[16] = 1;
	}
	
	static String[] Array2 = new String[20];{
		Array2[0] = "*";
		Array2[1] = "*";
		Array2[2] = "*";
		Array2[3] = "*";
		Array2[4] = "*";
		Array2[5] = "*";
		Array2[6] = "*";
		Array2[7] = "*";
		Array2[8] = "*";
		Array2[9] = "*";
		Array2[10] = "*";
		Array2[11] = "*";
		Array2[12] = "*";
		Array2[13] = "*";
		Array2[14] = "*";
		Array2[15] = "*";
		Array2[16] = "*";
	}
	
	static Random randGen = new Random();
	
	public static int randomInt(int maxNum){
		int randNum = randGen.nextInt(maxNum + 1);
		return randNum;
	}
	
	public void Shuffle(){
		for (int i = 1; i <= 30; i++){
			int card1 = randomInt(16);
			int card2 = randomInt(16);
			int intermediate1;
			int intermediate2;
			intermediate1 = Array1[card1];
			intermediate2 = Array1[card2];
			
			Array1[card1] = intermediate2;
			Array1[card2] = intermediate1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
