package n1ejercicio1;

import java.io.File;
import java.util.Arrays;

public class LeerDirectorio {

	public void leerDirectorio(File directorio) {

		if (existe(directorio)) {

			String[] nombres = directorio.list();

			Arrays.sort(nombres);

			for (String nombre : nombres) {

				System.out.println(nombre);
			}
		}

	}

	public static boolean existe(File directorio) {

		if (directorio.exists() && directorio.isDirectory());

		return true;

	}

}
