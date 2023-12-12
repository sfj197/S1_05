package n1ejercicio1;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File directorio = new File("C:/Users/Jorge/eclipse-workspace/Directorio/");
		
		LeerDirectorio nuevo = new LeerDirectorio();
		
		nuevo.leerDirectorio(directorio);
	}
	
}