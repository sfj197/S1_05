package n1ejercicio3;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Arrays;

public class GuardarArbol {

	public static boolean comprobarDirectorio(File directorio) {

		if (directorio.isDirectory() && directorio.exists()) {

			return true;
			
		} else {

			return false;
		}
	}

	public static void guardarArbol(File directorio, PrintWriter pw) {

		File[] arbol = directorio.listFiles();
		Arrays.sort(arbol);

		for (int i = 0; i < arbol.length; i++) {

			String esDirectorio = "";

			esDirectorio = (arbol[i].isDirectory()) ? "(D)" : "(F)";

			pw.write(arbol[i].getName() + " " + esDirectorio + " " + devolverFecha(arbol[i]) + "\n");

			if (arbol[i].isDirectory()) {

				//Recursividad.
				guardarArbol(arbol[i], pw);

			}
		}
	}

	public static Date devolverFecha(File file) {

		Date ultmodificacion = new Date(file.lastModified());

		return ultmodificacion;

	}
}
