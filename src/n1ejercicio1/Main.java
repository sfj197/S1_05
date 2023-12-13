package n1ejercicio1;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "";
		File directorio;
		
		if(args.length > 0) {
			
			path = args[0];
		}else {
			path = ".";
		}
		
		try {
			
			directorio = new File(path);
			
			if(directorio.isDirectory() && directorio.exists()) {
				
				String []nombres = directorio.list();
				
				for(String nombre:nombres) {
					
					System.out.println(nombre);
				}
			}else {
				System.out.println("Directorio no valido");
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
