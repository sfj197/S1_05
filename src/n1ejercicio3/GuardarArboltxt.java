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

		try {
			File directorio = new File("C:/Users/Jorge/eclipse-workspace/Directorio");
			PrintWriter pw = new PrintWriter(new FileWriter("C:/Users/Jorge/eclipse-workspace/S1_05/Guardado.txt"));
			GuardarArbol.guardarArbol(directorio, pw);

			pw.close();
		} catch (Exception e) {
			System.out.println("Error al guardar");
		}

	}

}
