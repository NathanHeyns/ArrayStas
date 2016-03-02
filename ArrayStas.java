/** This program is used to generate and sort pseudorandom numbers.
 * 
 * @author Nathan
 * @version 1.0
 *
 */

import java.util.*;
public class ArrayStas {
	static Random randGen = new Random();
	static List List1 = new ArrayList();
	static int num;
	public static int randomInt(int maxNum){
		int randNum = randGen.nextInt(maxNum + 1);
		return randNum;
	}
	
	
	public ArrayStas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i < 301; i++){
			num = randomInt(100);
			System.out.println(num);
			List1.add(num);
		}
	}

}
