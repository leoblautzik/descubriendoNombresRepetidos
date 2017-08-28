package descubriendoNombresRepetidos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.TreeMap;


public class NombresRepetidos {

	public static void main(String[] args) throws IOException {
		int cantAcampantes;
		int cantRepetidos;
		Map<String, Integer> nombres = new TreeMap<String, Integer>();
		TreeMap< Integer,String> repetidos = new TreeMap<Integer,String>();


		String t="400milNombres.in";

		Scanner sc = new Scanner(new File(t));
		cantAcampantes=sc.nextInt();
		cantRepetidos=sc.nextInt();
		for(int i=0;i<cantAcampantes;i++){
			String k = sc.next();
			int cantidad=0;
			if(nombres.containsKey(k)){
				cantidad = nombres.get(k);
				nombres.put(k, cantidad+1);	
			}				
			else
				nombres.put(k, 1);	
			
		}

		sc.close();

		for (Entry<String, Integer> nombre : nombres.entrySet())
			repetidos.put(nombre.getValue(), nombre.getKey());


		PrintWriter s = new PrintWriter(new FileWriter("resultados.out")); 

		for(int k=1; k<=cantRepetidos;k++){
			Entry<Integer,String> salida=repetidos.pollLastEntry();
			s.println(salida.getValue()+" "+salida.getKey());
		}

		s.close();

	}
}
