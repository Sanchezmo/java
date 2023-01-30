import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;


public class Flujos2 {

	public static void main(String[] args) {
	
		try {
			
		//ruta
		String ruta ="C:\\Users\\kokes\\Documents\\flujos";
		
		//crear directorio
		File carpeta = new File(ruta);
		System.out.println(carpeta.mkdir());
		
		//crear archivo
		File archivo = new File(ruta,"flujo.bin");
		archivo.createNewFile();
		
		//Manejar FileOut/InputStream
		FileOutputStream fos = new FileOutputStream(archivo); //ESCRITURA
		FileInputStream fis = new FileInputStream(archivo);	//LECTURA
		
		//Sobre esto trabajamos en archivos binarios .bin
		char a ='a';
		fos.write((byte)a);
		int i=0;
		while(fis.read() != -1) {
			System.out.println((char)i);
		}
		
		
		//BufferedOutINputStream; mejora rendimiento del anterior haciendo un buffer.
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedInputStream bis = new BufferedInputStream(fis);
		bos.write((byte)a);//mete al buffer
		bos.flush();//hace la consistencia en el archivo
		while(bis.read() != -1) {
			System.out.println(String.valueOf((char)i));
		}
		
		
		//DataOutINputStream  permite trabajar directamente con tipo de datos primitivos 
		//sobre un fichero binario
		DataOutputStream dos = new DataOutputStream(fos);
		DataInputStream dis = new DataInputStream(fis);
		dos.writeChars("HOLA");
		while(dis.available()>0) {
			System.out.println(dis.readChar());
		}
		
		
		//PrintStream imprime flujo de bytes
		PrintStream ps = new PrintStream(fos);
		ps.printf(", MUNDO");
		//lectura archivos bin
		RandomAccessFile raf = new RandomAccessFile(archivo,"rw");//"r" solo leer "rw" read and write
		raf.writeChars(ruta);
		raf.seek(0);
		for(i=0;i<raf.length()/2;i++) {
			System.out.println(""+raf.readChar());
		}
		
		
		System.out.println("Fin trabajo con binario");
		//FIN flujos de bytes.
		
		//FileWriter/Reader para ficheros texto.
		File archivo2 =new File(ruta,"Flujo2.txt");
		archivo2.createNewFile();
		FileWriter fw = new FileWriter(archivo2);
		fw.write("HOLA MUNDO TEXTUAL");
		FileReader fr =new FileReader(archivo2);
		while((i=fr.read())!= -1) {
			System.out.println((char)i);
		}
		//Añadiendo buffer intermedio para mejorar rendimiento BufferWriter/REader
		BufferedWriter buw = new BufferedWriter(fw);
		BufferedReader bur = new BufferedReader(fr);
		
		buw.write("hola de nuevo");
		buw.newLine();
		buw.write(".newLine()hace salto de linea");
		while((i=bur.read()) != -1) {
			System.out.println((char)i);			
		}
		
		
		// Array de caracteres CharArrayWriter/Reader
		char[] array = {'H','O','L','A'};
		
		CharArrayWriter caw = new CharArrayWriter();
		caw.write(array);//mete la cadena al caw
		caw.writeTo(fw);//mete el caw al filewriter.
		/*ArrayList<String> lista = new ArrayList<>();
		char carac;
		while((i=bur.read()) != -1) {
			lista.add(String.valueOf((char)i));			
		}*/
		//para saber dimension de caracteres del archivo
		int contenido=0;
		while((i=fr.read()) != -1) {
			contenido++;	
		}
		System.out.println(contenido);
		//creamos el array para contenerlo sabiendo la dimension
		char[] lista = new char[contenido];
		//metemos el contenido el archivo en el array
		int x=0;
		while((i=fr.read())!=-1) {
			lista[x]=((char)i);
			x++;
		}
		//para leer el array que contiene el archivo
		CharArrayReader car = new CharArrayReader(lista);
		while((i=car.read())!=-1) {
			System.out.println((char)i);
			
		}
		raf.close();
		dos.close();
		dis.close();
		ps.close();
		buw.close();
		bur.close();
		bos.close();
		bis.close();
		fis.close();
		fos.close();
		fw.close();
		fr.close();
		System.out.println("Fin trabajo con texto");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
