/** This program is used to generate and sort pseudorandom numbers.
 * 
 * @author Nathan
 * @version 1.0
 *
 */

import java.util.*;
public class ArrayStas {
	static Random randGen = new Random();
	static int[] List1 = new int[310];
	static int num;
	static int[] Array1 = new int[10];
	
	public static int randomInt(int maxNum){
		int randNum = randGen.nextInt(maxNum + 1);
		return randNum;
	}
	
	
	public ArrayStas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i < 300; i++){
			num = randomInt(100);
			System.out.println(num);
			List1[i]=num;
		}
		
		java.util.Arrays.sort(List1);
		
		
	}

}
