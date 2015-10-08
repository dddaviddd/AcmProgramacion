/**
 * 
 */
package problemas;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Watermelon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int peso = in.nextInt();
		if(peso%2 != 0){
			System.out.println("no");
		}else if(peso == 2){
			System.out.println("no");
		}else{
			System.out.println("yes");
		}

	}

}
