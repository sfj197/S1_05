package n1ejercicio2;

import java.io.File;
import java.sql.Date;
import java.util.Arrays;

public class LeerArbol {

	public boolean existe(File directorio) {

		if (directorio.exists() && directorio.isDirectory()) {

			return true;
		} else {

			return false;
		}

	}

	public static Date ultimaFecha(File directorio) {

		Date ultima = new Date(directorio.lastModified());

		return ultima;

	}

	public static void leer(File directorio) {

		File[] nombresArbol = directorio.listFiles();

		Arrays.sort(nombresArbol);

		for (File nombre : nombresArbol) {

			String esDirectorio = (nombre.isDirectory()) ? "D" : "F";

			System.out.println(nombre.getName()+ " " + esDirectorio + " " + ultimaFecha(directorio));

			if (nombre.isDirectory())
				leer(nombre); 
		}

	}

}
