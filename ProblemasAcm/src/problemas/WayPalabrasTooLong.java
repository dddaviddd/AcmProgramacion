/**
 * 
 */
package problemas;

import java.util.Scanner;

/**
 * @author David
 *
 */
public class WayPalabrasTooLong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();		
		String vec[] = new String[a];
		for(int i=0; i<a; i++){
			String palabra = in.next();
			if(palabra.length()>10){
				int largo = palabra.length()-2;
				vec[i] = ((palabra.charAt(0))+""+largo+""+(palabra.charAt(palabra.length()-1)));
			}else{
				vec[i] = palabra;
			}
				}
		for(int i=0; i<a; i++){
			System.out.println(vec[i]);
		}
			}

	}


