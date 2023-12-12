package n1ejercicio2;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File directorio = new File("C:/Users/Jorge/eclipse-workspace/Directorio");
			LeerArbol.leer(directorio);

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Lectura erronea");
		}

	}

}
