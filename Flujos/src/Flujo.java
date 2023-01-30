
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

public class Flujo {
	

	public static void main(String[] args) {
		try {
			String rutaFichero="C:\\Users\\kokes\\Documents\\flujo.txt";
			FileReader fr = new FileReader(rutaFichero);
			int c;
			char a ='a';
			char e ='e';
			char i ='i';
			char o ='o';
			char u ='a';
			
			while((c=fr.read())!=-1) {
				if((char)c == a||(char)c == e||(char)c == i||(char)c == o||(char)c == u){
				System.out.println((char)c);
				}else{
				System.out.println("*");
				}
			}
			FileReader fr2 = new FileReader(rutaFichero);
			
			int contador=0;
			char[] cadena= new char[30];
			int j=fr2.read();
			while((j=fr2.read()) !=-1) {
				cadena[contador]=((char)j);
				contador++;
				System.out.println(contador);
			}
			for(int z=0;z<cadena.length;z++) {
				System.out.println(cadena[z]);
			}
			String conjunto =String.copyValueOf(cadena);
			System.out.println(conjunto);
			
			fr2.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
	
}
