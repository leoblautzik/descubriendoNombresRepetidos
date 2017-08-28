package descubriendoNombresRepetidos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Generador {

	public static void main(String[] args) throws IOException {
		String s="400milNombres.in";
		
		PrintWriter salida = new PrintWriter(new FileWriter(s)); 
		salida.println(400000 +" " + 2);

		for(int j=0;j<1000;j++){

			for(int i=0;i<100;i++)
				salida.println("Ana");

	
			for(int i=0;i<101;i++)
				salida.println("Pepe");
			
			for(int i=0;i<102;i++)
				salida.println("Diana");

	
			for(int i=0;i<97;i++)
				salida.println("Raul");
			
		}
		salida.close();

	}	

		
}
