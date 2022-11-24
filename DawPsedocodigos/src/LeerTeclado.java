// Clase para la gestion de entrada por teclado
// Modificado 09/2004
/*
 *  This code is from the book:
 *
 *    Winder, R and Roberts, G (2000) Developing Java
 *    Software, second edition, John Wiley & Sons.
 *
 *  It is copyright (c) 2000 Russel Winder and Graham Roberts.
 */

import java.io.* ;
/**
 *  Clase que permite leer valores simples de la linea de comandos.
 *  Si ocurre un error durante la lectura las excepciones lanazadas 
 *  son capturadas y  se terinará el programa mostrando un mensaje de error.
 *
 *  @version 1.0
 *  @author Alvaro Garcia
 */
public class LeerTeclado {
  
  private static final BufferedReader in =new BufferedReader(new InputStreamReader (System.in)) ;
  private static String input;
  private static String s;
 
  /**
   *  Lee un <CODE>int</CODE> introducido por el teclado.  
   */
  public static final synchronized int readInteger() {
	
    input = "";
    int value = Integer.MIN_VALUE;
    try {
      input = in.readLine() ;
    }
    catch (IOException e) { error("standard input"); } 
    try {
      value = Integer.parseInt(input) ;
    }
    catch (NumberFormatException e) { error("Invalid int format"); }
    return value ;
  }

   /**
   *  Lee un <CODE>short</CODE> introducido por el teclado.  
   */
  public static final synchronized short readShort(){
    input = "";
    short value = Short.MIN_VALUE;
    try {
      input = in.readLine() ;
    }
    catch (IOException e) { error("standard input"); } 
    try {
      value = Short.parseShort(input) ;
    }
    catch (NumberFormatException e) { error("Invalid int format"); }
    return value ;
    
  }
  
   
  
  /**
   *  Lee un <CODE>long</CODE> introducido por el teclado.  
   */
  public static final synchronized long readLong() {
    input = "" ;
    long value = Long.MIN_VALUE;
    try {
      input = in.readLine() ;
    }
    catch (IOException e) { error("standard input"); }
    try {
      value = Long.parseLong(input) ;
    }
    catch (NumberFormatException e) {error("Invalid long format"); }
    return value ;
  }
  /** 
   *  Lee un  <CODE>double</CODE> introducido por el teclado.  
   */
  public static final synchronized double readDouble() {
    input = "" ;
    double value = Double.NaN ;
    try {
      input = in.readLine() ;
    }
    catch (IOException e) { error("standard input"); }
    try {
      value = Double.parseDouble(input) ;
    }
    catch (NumberFormatException e) { error("Invalid double format"); }
    return value ;
  }
  /**
   *  Lee un <CODE>float</CODE> introducido por el teclado.  
   */
  public static final synchronized float readFloat() {
    input = "" ;
    float value = Float.NaN ;
    try {
      input = in.readLine() ;
    }
    catch (IOException e) { error("standard input"); }
    try {
      value = Float.parseFloat(input) ;
    }
    catch (NumberFormatException e) { error("Invalid float format"); }
    return value ;
  }
  /**
   *  Lee un <CODE>char</CODE> introducido por el teclado.  
   */
  public static final synchronized char readCharacter() {
    char c = ' ' ;
    try {
      c = (char)in.read() ;
    }
    catch (IOException e) { error("standard input"); }
    return c ;
  }
  /**
   *  Lee un <CODE>String</CODE> introducido por el teclado.  
   */
  public static final synchronized String readString() {
    s = "";
    try {
      s = in.readLine() ;
    }
    catch (IOException e) { error("standard input"); }
    if (s == null) {
      s = "" ;
    }
    return s ;
  }
  
  /**
   * Lanzado cuando ocurre un error.Muestra un mensaje y termina
   */
  private static void error(String msg) {
    System.err.println("Error de formato: " + msg) ;
    System.err.println("Imposible continuar la ejecucion del programa") ;
    System.exit(0) ;
  }
}
