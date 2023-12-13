package n1ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import java.util.Date;

public class GuardarArboltxt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path;
		
		File directorio;
		
		if(args.length > 0) {
			
			path = args[0];
			
		}else {
			
			path = ".";
		}
		
		
		try {
			directorio = new File(path);
			PrintWriter pw = new PrintWriter(new FileWriter("ruta.txt"));
			guardarArbol(directorio, pw);

			pw.close();
		} catch (Exception e) {
			System.out.println("Error al guardar");
		}

	}
	
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

