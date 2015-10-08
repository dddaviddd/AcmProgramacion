/**
 * 
 */
package problemas;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class TheatreSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		

		long x = a/c;
		long y = b/c;
		
		if(a%c>0){
			x++;
		}
		
		if(b%c>0){
			y++;
		}
		long res = y*x;
		
		System.out.println(res);
		

	}

}
