/**
 * 
 */
package problemas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author David
 *
 */
public class RegistrationSystem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> nombreMap = new HashMap<String, Integer>();

		Scanner entrada = new Scanner(System.in);
		int solicitudes = entrada.nextInt();
		
		for(int i=0; i<solicitudes; i++){
			String a = entrada.next();
			if(nombreMap.get(a) == null){
				nombreMap.put(a, 1);
				System.out.println("OK");
			}else{
				System.out.println(a+""+(nombreMap.get(a)));
				nombreMap.put(a, (nombreMap.get(a)+1));
			}
		}
	}

}
