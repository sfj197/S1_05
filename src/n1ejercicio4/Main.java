package n1ejercicio4;

import java.io.File;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File directorio = new File("C:/Users/Jorge/eclipse-workspace/Directorio");

		if (LeerTodo.existe(directorio)) {

			LeerTodo.leerArbol(directorio);

		}

	}

}