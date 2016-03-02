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
		
		System.out.println(List1);
		
		for (int i=0; i<100; i++)
			if (List1[i] <= 20)
				Array1[0] += 1;
			else if (List1[i] > 20 && List1[i] <= 40)
				Array1[1] += 1;
			else if (List1[i] > 40 && List1[i] <= 60)
				Array1[2] += 1;
			else if (List1[i] > 60 && List1[i] <= 80)
				Array1[3] += 1;
			else if (List1[i] > 80 && List1[i] <= 100)
				Array1[4] += 1;
		
		System.out.println("");

		System.out.print("1 - 20:");
		for (int i = 1; i <= Array1[0]; i++)
			System.out.print("*");
		System.out.println("");
		
		System.out.print("21 - 40:");
		for (int i = 1; i <= Array1[1]; i++)
			System.out.print("*");
		System.out.println("");
		
		System.out.print("41 - 60:");
		for (int i = 1; i <= Array1[2]; i++)
			System.out.print("*");
		System.out.println("");
		
		System.out.print("51 - 80:");
		for (int i = 1; i <= Array1[3]; i++)
			System.out.print("*");
		System.out.println("");
		
		System.out.print("81 - 100:");
		for (int i = 1; i <= Array1[4]; i++)
			System.out.print("*");
		System.out.println("");
		
		
		
	}

}
