package ClasesObjetos;

import java.util.Scanner;

public class Ejecutable {
	
	public static int opcion,opcion1;
	public static Scanner entrada = new Scanner(System.in);
	public static double a,b;
	public static int c,d;
	public static String str1,str2;
	
	public static void main(String[] args) {
		do {
			
			System.out.println("\n"+"+*OPCIONES****************************************************************************+");
			System.out.println("+ ////////   (1)TRIANGULOS; (2)ARTICULOS; (3)POSICIONES; (4)BIBLIOTECA; (5)RECTANGULO;+");
			System.out.println("+(6)TENIS; (7)SALIR;                                                                  +");
			System.out.println("+                                                                                     +");
			System.out.println("+*INTRODUZCA-OPCION*******************************************************************+");
			opcion=entrada.nextInt();
			
			//EJERCICIO 1
			if(opcion==1) {
				System.out.println("TRIANGULOS");
				System.out.println("Introduzca Lado triangulo 1");
				a=entrada.nextDouble();
				System.out.println("Introduzca Lado triangulo 2");
				b=entrada.nextDouble();
				TrianguloEquilatero t1= new TrianguloEquilatero(a);
				TrianguloEquilatero t2= new TrianguloEquilatero(b);
				System.out.println("TRIANGULO 1 Area"+t1.getArea()+" Altura "+t1.getAltura()+" Perimetro "+t1.getPerimetro()+"\n"+t1);
				System.out.println("TRIANGULO 2 Area"+t2.getArea()+" Altura "+t2.getAltura()+" Perimetro "+t2.getPerimetro()+"\n"+t2);
				
				System.out.println("Modifique Lado triangulo 2");
				b=entrada.nextDouble();
				t2.setLado(b);
				System.out.println("TRIANGULO 2 Area"+t2.getArea()+" Altura "+t2.getAltura()+" Perimetro "+t2.getPerimetro()+"\n"+t2);
				
			//EJERCICIO 2	
			}else if(opcion==2) {
				System.out.println("ARTICULOS");
				System.out.println("Datos Articulo 1 (Default)");
				
				Articulo a1=new Articulo();
				
				System.out.println("Datos Articulo 2");
				System.out.println("Introduzca Nombre");
				str1=entrada.next();
				
				System.out.println("Introduzca Color");
				str2=entrada.next();
				
				Articulo a2=new Articulo(str1,str2);
				
				System.out.println("Datos Articulo 3");
				System.out.println("Introduzca Nombre");
				str1=entrada.next();
				System.out.println("Introduzca Color");
				str2=entrada.next();
				System.out.println("Introduzca Precio");
				a=entrada.nextDouble();
				
				Articulo a3= new Articulo(str1,str2,a);
				
				System.out.println(a1+" "+a2+" "+a3);
				//aplicar descuentos
					do {
				System.out.println("\n Elija producto 1,2,3 para aplicar descuento, 4 continuar sin aplicar ");
						opcion1=entrada.nextInt();
						if(opcion1==1) {
							a1.rebajarPrecio();
							System.out.println("Articulo 1 rebajado");
						}else if(opcion1==2) {
							a2.rebajarPrecio();
							System.out.println("Articulo 2 rebajado");
						}else if(opcion1==3) {
							a3.rebajarPrecio();
							System.out.println("Articulo 3 rebajado");
						}else if(opcion1==4){
							System.out.println("No se aplican más descuentos");
						}else {
							System.out.println("Opcion no valida");
						}
					}while(opcion1!=4);
					
					System.out.println("\n"+a1+""+a2+""+a3);
					//incremento precios
						do {
						System.out.println("\n Elija producto 1,2,3 para incrementar Precio, 4 continuar sin incrementar ");
							opcion1=entrada.nextInt();
							if(opcion1==1) {
									System.out.println("Introduzca Incremento Precio Articulo 1");
									b=entrada.nextDouble();
									a1.incrementarPrecio(b);
							}else if(opcion1==2) {
									System.out.println("Introduzca Incremento Precio Articulo 2");
									b=entrada.nextDouble();
									a2.incrementarPrecio(b);
							}else if(opcion1==3) {
									System.out.println("Introduzca Incremento Precio Articulo 3");
									b=entrada.nextDouble();
									a3.incrementarPrecio(b);
							}else if(opcion1==4){
									System.out.println("No se aplican más incrementos");
							}else {
								System.out.println("Opcion no valida");
							}
						}while(opcion1!=4);
						System.out.println("\n"+a1+""+a2+""+a3);
					//modificar articulos
						do {
							System.out.println("\n Elija producto 1,2,3 para modificar atributos, 4 continuar sin modificar ");
								opcion1=entrada.nextInt();
								if(opcion1==1) {
										System.out.println("Introduzca Datos Articulo 1");
										System.out.println("Introduzca Nombre");
										str1=entrada.next();
										a1.setNombre(str1);
										System.out.println("Introduzca Color");
										str2=entrada.next();
										a1.setColor(str2);
										System.out.println("Introduzca Precio");
										a=entrada.nextDouble();
										a1.setPrecio(a);
								}else if(opcion1==2) {
										System.out.println("Introduzca Datos Articulo 2");
										System.out.println("Introduzca Nombre");
										str1=entrada.next();
										a2.setNombre(str1);
										System.out.println("Introduzca Color");
										str2=entrada.next();
										a2.setColor(str2);
										System.out.println("Introduzca Precio");
										a=entrada.nextDouble();
										a2.setPrecio(a);
								}else if(opcion1==3) {
										System.out.println("Introduzca Datos Articulo 3");
										System.out.println("Introduzca Nombre");
										str1=entrada.next();
										a3.setNombre(str1);
										System.out.println("Introduzca Color");
										str2=entrada.next();
										a3.setColor(str2);
										System.out.println("Introduzca Precio");
										a=entrada.nextDouble();
										a3.setPrecio(a);
								}else if(opcion1==4){
										System.out.println("No se modifican más Articulos");
								}else {
									System.out.println("Opcion no valida");
								}
							}while(opcion1!=4);
						System.out.println("\n"+a1+""+a2+""+a3);
			//EJERCICIO 3			
			}else if(opcion==3) {
				System.out.println("DADAS 2 POSICIONES A y B");
				System.out.println("Introduzca Posicion A");
				System.out.println("Introduzca X de A");
				c=entrada.nextInt();
				System.out.println("Introduzca Y de A");
				d=entrada.nextInt();
				Posicion p1=new Posicion(c,d);
				System.out.println("Introduzca Posicion B");
				System.out.println("Introduzca X de B");
				c=entrada.nextInt();
				System.out.println("Introduzca Y de B");
				d=entrada.nextInt();
				Posicion p2=new Posicion(c,d);
				//visualizacion
				System.out.println(p1.getXY());
				System.out.println(p2.getXY());
				//opuestos
				System.out.println("OPUESTOS DE A y B");
				
				System.out.println(Posicion.opuestoXY(p1).getXY());
				System.out.println(Posicion.opuestoXY(p2).getXY());
				Posicion op1=new Posicion(Posicion.opuestoXY(p1).getX(),Posicion.opuestoXY(p1).getY());
				Posicion op2=new Posicion(Posicion.opuestoXY(p2).getX(),Posicion.opuestoXY(p2).getY());
				//incremento de los opuestos
				System.out.println("Introduzca incremento X para opuesto A");
				c=entrada.nextInt();
				System.out.println("Introduzca incremento Y para opuesto A");
				d=entrada.nextInt();
				op1.incXY(c, d);
				System.out.println("Introduzca incremento X para opuesto B");
				c=entrada.nextInt();
				System.out.println("Introduzca incremento Y para opuesto B");
				d=entrada.nextInt();
				op2.incXY(c, d);
				System.out.println(op1.getXY());
				System.out.println(op2.getXY());
				//calculo de recta
				System.out.println("Calculo de la recta de los opuestos");
				
				System.out.println(Posicion.recta(op1,op2));
				
				//EJERCICIO 4
			}else if(opcion==4) {
				//Crea dos autores
				System.out.println("Crea Autor 1");
				System.out.println("Nombre Autor 1");
				str1=entrada.next();
				System.out.println("Nacionalidad Autor 1");
				str2=entrada.next();
				System.out.println("fecha nacimiento Autor 1");
				c=entrada.nextInt();
				Autor au1=new Autor(str1,str2,c);
				System.out.println("Crea Autor 2");
				System.out.println("Nombre Autor 2");
				str1=entrada.next();
				System.out.println("Nacionalidad Autor 2");
				str2=entrada.next();
				System.out.println("fecha nacimiento Autor 2");
				c=entrada.nextInt();
				Autor au2=new Autor(str1,str2,c);
				System.out.println(au1);
				System.out.println(au2);
				//crea dos libros
				System.out.println("Crea Libro 1");
				System.out.println("ISBN Libro 1");
				str1=entrada.next();
				System.out.println("Titulo Libro 1");
				str2=entrada.next();
				Libros l1 =new Libros(str1,str2,au1);
				System.out.println("Crea Libro 2");
				System.out.println("ISBN Libro 2");
				str1=entrada.next();
				System.out.println("Titulo Libro 2");
				str2=entrada.next();
				Libros l2 =new Libros(str1,str2,au2);
				//muestra los libros
				System.out.println(l1);
				System.out.println(l2);
				//prestar libro 1
				System.out.println("Prestamos libro 1 ");
				str1=Libros.prestarLibro(l1);
				System.out.println(str1);
				System.out.println("VISUALIZAMOS LIBRO 1"+l1);
				System.out.println("volvemos a prestar libro 1");
				str2=Libros.prestarLibro(l1);
				System.out.println(str2);
				//devolucion libro 1
				System.out.println("Devolucion Libro 1");
				str1=Libros.devolverLibro(l1);
				System.out.println(str1);
				System.out.println("VISUALIZAMOS Libro 1"+l1);
				System.out.println("Volvemos a repetir devolucion");
				str2=Libros.devolverLibro(l1);
				System.out.println(str2);
				//EJERCICIO 5
			}else if(opcion==5) {
				System.out.println("CREE 3 PUNTOS");
				//PUNTO 1
				System.out.println("Coordenada X Punto 1");
				a=entrada.nextDouble();
				System.out.println("Coordenada Y Punto 1");
				b=entrada.nextDouble();
				Punto p1=new Punto(a,b);
				//PUNTO 2
				System.out.println("Coordenada X Punto 2");
				a=entrada.nextDouble();
				System.out.println("Coordenada Y Punto 2");
				b=entrada.nextDouble();
				Punto p2=new Punto(a,b);
				//PUNTO 3
				System.out.println("Coordenada X Punto 3");
				a=entrada.nextDouble();
				System.out.println("Coordenada Y Punto 3");
				b=entrada.nextDouble();
				Punto p3=new Punto(a,b);
				//DISTANCIA ENTRE PUNTOS 1 y 2
				System.out.println("DISNTANCIA P1 a P2");
				double distanciaP1P2=p1.distancia(p2);
				System.out.println(distanciaP1P2);
				//DISTANCIA 1 y 3
				System.out.println("DISNTANCIA P1 a P3");
				double distanciaP1P3=p1.distancia(p3);
				System.out.println(distanciaP1P3);
				//DISTANCIA 2 y 3
				System.out.println("DISNTANCIA P2 a P3");
				double distanciaP2P3=p2.distancia(p3);
				System.out.println(distanciaP2P3);
				//creamos con dos puntos rectangulo
				System.out.println("Vamos a crear un rectangulo");
				System.out.println("Coordenada X Punto 1");
				a=entrada.nextDouble();
				System.out.println("Coordenada Y Punto 1");
				b=entrada.nextDouble();
				Punto px1=new Punto(a,b);
				System.out.println("Coordenada X Punto 2");
				a=entrada.nextDouble();
				System.out.println("Coordenada Y Punto 2");
				b=entrada.nextDouble();
				Punto px2=new Punto(a,b);
				//Rectangulo
				Rectangulo rct=new Rectangulo(px1,px2);
				System.out.println("Rectangulo Creado con los puntos 1 y 2");
				//Visualizar Rectangulo
				str1=Rectangulo.visualizarRect(rct);
				System.out.println(str1);
				System.out.println("BASE RECTANGULO");
				System.out.println(Rectangulo.baseRect(px1, px2));
				System.out.println("ALTURA RECTANGULO");
				System.out.println(Rectangulo.alturaRect(px1, px2));
				System.out.println("PERIMETRO RECTANGULO");
				System.out.println(Rectangulo.perimetroRect(px1, px2));
				System.out.println("AREA RECTANGULO");
				System.out.println(Rectangulo.areaRect(px1, px2));
			//EJERCICIO 6 TENIS	
			}else if(opcion==6) {
				System.out.println("INSERTE 4 JUGADORES");
				System.out.println("Jugador 1");
				System.out.println("Nombre J1");
				str1=entrada.next();
				System.out.println("Ranking ATP J1");
				a=entrada.nextDouble();
				Jugador j1=new Jugador(str1,a);
				System.out.println("Jugador 2");
				System.out.println("Nombre J2");
				str1=entrada.next();
				System.out.println("Ranking ATP J2");
				a=entrada.nextDouble();
				Jugador j2=new Jugador(str1,a);
				System.out.println("Jugador 3");
				System.out.println("Nombre J3");
				str1=entrada.next();
				System.out.println("Ranking ATP J3");
				a=entrada.nextDouble();
				Jugador j3=new Jugador(str1,a);
				System.out.println("Jugador 4");
				System.out.println("Nombre J4");
				str1=entrada.next();
				System.out.println("Ranking ATP J4");
				a=entrada.nextDouble();
				Jugador j4=new Jugador(str1,a);
				
				System.out.println("TORNEO TENIS");
				//partido 1
				System.out.println("1er PARTIDO j1 vs j2");
				Partido pt1=new Partido(j1,j2);
				System.out.println("el ganador es: ");
				Jugador ganador1=Partido.ganador(pt1);
				System.out.println(ganador1);
				//partido 2
				System.out.println("1er PARTIDO j3 vs j4");
				Partido pt2=new Partido(j3,j4);
				System.out.println("el ganador es: ");
				Jugador ganador2=Partido.ganador(pt2);
				System.out.println(ganador2);
				//final
				System.out.println("FINAL");
				Partido pt3=new Partido(ganador1,ganador2);
				System.out.println("el ganador es: ");
				Jugador ganador3=Partido.ganador(pt3);
				System.out.println(ganador3);
				str1=Partido.ganar(ganador3);
				System.out.println(str1);
				System.out.println(ganador3);
			}else if(opcion==7) {
				System.out.println("FIN PROGRAMA");
			}else {
				System.out.println("Opcion no valida");
			}
			
		}while(opcion!=7);
	}

}
