package n1ejercicio5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializar {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Alumno[] alumnos = new Alumno[3];

		alumnos[0] = new Alumno("Jorge", 48);
		alumnos[1] = new Alumno("Andres", 34);
		alumnos[2] = new Alumno("Sandra", 40);

		try {

			ObjectOutputStream nuevoFichero = new ObjectOutputStream(new FileOutputStream("archivo.ser"));
			nuevoFichero.writeObject(alumnos);
			nuevoFichero.close();

			// Deserializamos el objeto y mostramos por consola.
			ObjectInputStream recuperarFichero = new ObjectInputStream(new FileInputStream("archivo.ser"));

			// Casting para recuperar el tipo.
			Alumno[] deserizacion = (Alumno[]) recuperarFichero.readObject();

			recuperarFichero.close();

			for (Alumno a : deserizacion) {

				System.out.println(a);
			}

		} catch (Exception e) {

			System.out.println("Error al recuperar fichero.");
		}

	}
}
