package n1ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;


public class Main {

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
			leerArbol(directorio);

		} catch (Exception e) {
			System.out.println("Error al leer");
		}

	}
	

	public static Date ultimaFecha(File dir) {

		Date ultimaMod = new Date(dir.lastModified());

		return ultimaMod;

	}

	public static boolean existe(File dir) {

		if (dir.exists() && dir.isDirectory()) {

			return true;
		} else {

			return false;
		}
	}

	public static void leerTxt(File txt) throws IOException {

		try {
			FileReader lector = new FileReader(txt);
			BufferedReader br = new BufferedReader(lector);

			String linea = "";

			while (linea != null) {

				linea = br.readLine();

				if (linea != null) {

					System.out.println(linea);
				}

			}
			br.close();

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}

	public static void leerArbol(File directorio) throws IOException {
		
		File [] nombres = directorio.listFiles();
		
		Arrays.sort(nombres);
		
		for(int i = 0; i < nombres.length; i++) {
			
			String esDirectorio = (nombres[i].isDirectory()) ? " (D) " : " (F) ";
			
			System.out.println(nombres[i].getName() + esDirectorio + ultimaFecha(nombres[i]));
			
			if(nombres[i].isDirectory()) {
				
				leerArbol(nombres[i]);
			}else {
				
				leerTxt(nombres[i]);
			}
				
		}
		
		
	}

}
