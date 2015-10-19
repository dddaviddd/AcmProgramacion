/**
 * 
 */
package problemas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author David
 *
 */
public class AnyaAndSmartphone {

	/**
	 * @param argss
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cont = 0;
		//numero de aplicaciones,
		int aplicaciones = in.nextInt();
		//numero de aplicaciones utilizadas,
		int apliutilizadas = in.nextInt();
		//numero de iconos en la misma pantalla
		int icopantalla = in.nextInt();

		ArrayList<Integer> nombreArrayList = new ArrayList<Integer>();
		//numero del icono en la posicion n
		for(int i=0; i<aplicaciones; i++){
			int elemento = in.nextInt();
			nombreArrayList.add(i, elemento);
		}
		for(int i=0; i<apliutilizadas; i++){
			int utilizada = in.nextInt();
			int indiceapliuti = nombreArrayList.indexOf(utilizada);
			if(indiceapliuti>=icopantalla){
				cont += indiceapliuti/icopantalla;
				if(indiceapliuti/icopantalla != 0){
					cont++;
				}
			}else{
				cont++;
			}
			if(indiceapliuti != 0){
				int possube = indiceapliuti;
				int baja = nombreArrayList.get(possube-1);
				nombreArrayList.set((possube-1), utilizada);
				nombreArrayList.set(possube, baja);
			}
		}
		System.out.println(cont);
		}
	}