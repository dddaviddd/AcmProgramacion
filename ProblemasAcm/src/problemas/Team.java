/**
 * 
 */
package problemas;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class Team {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cont = 0;
		int a = in.nextInt();
		
		for(int i=0; i<a; i++){
			int alum1 = in.nextInt();
			int alum2 = in.nextInt();
			int alum3 = in.nextInt();
			if(alum1+alum2+alum3>=2){
				cont++;
			}
		}
		System.out.println(cont);
	}

}

