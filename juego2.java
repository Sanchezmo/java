
public class juego2 {


	Consola consola = new Consola();
	
	public void fina() {
		
		int x=0;
		int y=0;
		int contador_turnoy=0;
		 
		
		String [][] tablamovida= new String[4][4];
		creartabla();
		mostrador(creartabla());
				
					do {
						System.out.println("Turno de las X ");
						y= consola.pedirDatoIntnumero("Escoge la fila ");
						x = consola.pedirDatoIntnumero("Escoge la columna");
					if(control(y,x)==true) {
						System.out.println("Valor introducido incorrecto");
						mostrador(creartabla());
					}
					
					
				}while(control(y,x)==true );
				tablamovida = movimiento(y,x, creartabla());
				
				do {
					
						do {
							System.out.println("Turno de las O ");
							y= consola.pedirDatoIntnumero("Escoge la fila ");
							x = consola.pedirDatoIntnumero("Escoge la columna");
							if(control(y,x)==true  || asignado(y,x,tablamovida)) {
								System.out.println("Valor introducido incorrecto o casilla ocupada");
						
								mostrador(tablamovida);
							}
							
							
						}while(control(y,x)==true || asignado(y,x,tablamovida) );
					
					tablamovida = movimientoO(y,x, tablamovida);
					
						if(ganadorO(y,x,tablamovida) == true) {
							break;
						}
						
						
						contador_turnoy++;
			/////////////////////////////////////////////////////////////////////////////////////////////			
					if(contador_turnoy == 4) {
						System.out.println("RONDAS DE DESEMPATE");
						do {
							do {
								System.out.println("Turno de las X ");
								y= consola.pedirDatoIntnumero("Escoge la fila ");
								x = consola.pedirDatoIntnumero("Escoge la columna");
									if(control(y,x)==true || desempateX(y,x,tablamovida)) {
										System.out.println("Valor introducido incorrecto");
										
										mostrador(tablamovida);
										}
			
							}while(control(y,x)==true || desempateX(y,x,tablamovida));
							
						tablamovida=movimientodesempateX(y, x, tablamovida); 
						
						mostrador(tablamovida);
						
							if(ganadorX(y,x,tablamovida )== true) {
								break;
							}
							
							do {
								System.out.println("Turno de las O ");
								y= consola.pedirDatoIntnumero("Escoge la fila ");
								x = consola.pedirDatoIntnumero("Escoge la columna");
									if(control(y,x)==true || desempateO(y,x,tablamovida)) {
										System.out.println("Valor introducido incorrecto");
									
										mostrador(tablamovida);
									}
									
									
							}while(control(y,x)==true || desempateO(y,x,tablamovida) );
							tablamovida=movimientodesempateO(y, x, tablamovida); 
							mostrador(tablamovida);
								if(ganadorO(y,x,tablamovida) == true) {
								break;
								}
					}while(y!=-1 || x!=-1);
						break;
					}
		///////////////////////////////////////////////////////////////////////////////////////////////////
					
					do {
						System.out.println("Turno de las X");
						y= consola.pedirDatoIntnumero("Escoge la fila ");
						x = consola.pedirDatoIntnumero("Escoge la columna");
					if(control(y,x)==true || asignado(y,x,tablamovida) ) {
						System.out.println("Valor introducido incorrecto o casilla ocupada ");
							
						mostrador(tablamovida);
					}
					
					}while(control(y,x)==true || asignado(y,x,tablamovida));
						tablamovida = movimiento(y,x, tablamovida);
			
						if(ganadorX(y,x,tablamovida )== true) {
							break;
						}
				
				
				
			}while(y!=-1 || x!=-1);
		
		
		
	}
	
	
	
	public String[] []creartabla() {
		String [] id_bajo= {"3"," 1 "," 2 "," 3 "};
		String[]id = {"0","1","2","3"};
		String[][] tabla = new String[4][4];
		String casilla = "[_]";
		for (int i=0; i< tabla.length;i++) {
			for(int j=0;j<tabla.length;j++) {
				tabla[i][j]=casilla;
				
			}
			
		}

		for (int s=0;s<tabla.length;s++) {
			tabla[s][0]=id[s];
			tabla[3][s]=id_bajo[s];
			
		}

	
	 return tabla;
	}
	
	public String[][] movimiento( int y, int x,String [][]tabla) {
		String [][] tablamovida= tabla;
		String movimiento = "[X]";
		
		 tablamovida[y][x]=movimiento;
		
		mostrador(tablamovida);
		
		return tablamovida;
	}
	
	public String[][] movimientoO( int y, int x,String [][]tabla) {
		String [][] tablamovida= tabla;
		String movimiento = "[O]";
		
		
		
		 tablamovida[y][x]=movimiento;
		
		mostrador(tablamovida);
		
		
		return tablamovida;
	}
	
	public String[][] movimientodesempateX(int fila, int columna, String [][]tablamovida1){
		String[][]desempate = tablamovida1;
		String dato;
		String casilla="[_]";
		int f;
		int c;
			dato=desempate[fila][columna]; 
			System.out.println("Has selecionado FILA: "+fila+ " COLUMNA: "+columna);
			do {
				System.out.println("Turno de las X ");
				f= consola.pedirDatoIntnumero("Escoge la fila para mover ");
				c= consola.pedirDatoIntnumero("Escoge la columna para mover");
				if(control(f,c)==true || asignado(f,c,desempate)) {
					System.out.println("FUERA DE RANGO/CASILLA OCUPADA");
				
					mostrador(desempate);
				}
				
				
				}while(control(f,c)==true || asignado(f,c,desempate));
			
			desempate[f][c]=dato;
			desempate[fila][columna]=casilla;
		return desempate;
	}
	
	public String[][] movimientodesempateO(int fila, int columna, String [][]tablamovida1){
		String[][]desempate = tablamovida1;
		String dato;
		String casilla="[_]";
		int f;
		int c;
			dato=desempate[fila][columna]; 
			System.out.println("Has selecionado FILA: "+fila+ " COLUMNA: "+columna);
			do {
				System.out.println("Turno de las O ");
				f= consola.pedirDatoIntnumero("Escoge la fila para mover ");
				c= consola.pedirDatoIntnumero("Escoge la columna para mover");
				if(control(f,c)==true || asignado(f,c,desempate)  ) {
					System.out.println("FUERA DE RANGO/CASILLA OCUPADA");
				
					mostrador(desempate);
				}
				
				
				
				}while(control(f,c)==true || asignado(f,c,desempate));
			
			desempate[f][c]=dato;
			desempate[fila][columna]=casilla;
		return desempate;
	}
	
	
	public boolean asignado(int y, int x,String [][]tablita) {
		boolean uso=false;
		if(tablita[y][x]=="[X]" || tablita[y][x]=="[O]" ) {
			
			uso=true;
		}
		
		return uso;
	}
	
	
	
	public void mostrador( String muestra[][]) {
		for(String[]muestreo:muestra) {
			System.out.println("");
			for(String muestra1: muestreo) {
				System.out.print(muestra1+ " ");
				
			}
		}
		System.out.println("");
		
		
	}
	public boolean desempateX(int y, int x, String[][]tablas) {
		boolean permite= false;
		if(tablas[y][x]=="[O]" || tablas[y][x]=="[_]") {
			permite = true;
			
			
		}
		
		return permite;
	}
	
	public boolean desempateO(int y, int x, String[][]tablas) {
		boolean permite= false;
		if(tablas[y][x]=="[X]" || tablas[y][x]=="[_]") {
			permite = true;
			
			
		}
		
		return permite;
	}
	
	public boolean control(int y,int x) {
		boolean correcto = false;
		if(y>4 || x>4  || y==0 && x==0  || y== 1 && x ==0 || y==2 && x==0 || y==3 && x==0 ||
			y==3 && x==1 || y==3 && x==2||  y==3 && x==3 || y==4 && x ==4 || y<4 && x>=4 || y>=4 && x<4
			|| y<0 && x<0){
			correcto = true;
			
		}
		
		
		return correcto;
	}

	public boolean ganadorX(int x, int y, String[][]tablamovida) {

		boolean termina= false;
		if(tablamovida[0][1]=="[X]" && tablamovida[0][2]=="[X]"&& tablamovida[0][3]=="[X]" ) {
			System.out.println("X ES GANADOR");
			termina = true;
		}
		
		
		if(tablamovida[0][1]=="[X]" && tablamovida[1][1]=="[X]" && tablamovida[2][1]=="[X]") {
			System.out.println("X ES GANADOR");
			termina = true;
		}
		
		if(tablamovida[0][3]=="[X]" && tablamovida[1][3]=="[X]" && tablamovida[2][3]=="[X]") {
			System.out.println("X ES GANADOR");
			termina = true;
		}
		
		if(tablamovida[0][1]=="[X]" && tablamovida[1][2]=="[X]" && tablamovida[2][3]=="[X]") {
			System.out.println("X ES GANADOR");
			termina = true;
		}
		
		if(tablamovida[0][3]=="[X]" && tablamovida[1][2]=="[X]" && tablamovida[2][1]=="[X]") {
			System.out.println("X ES GANADOR");
			termina = true;
		}
		
		
		if(tablamovida[2][1]=="[X]" && tablamovida[2][2]=="[X]" && tablamovida[2][3]=="[X]") {
			System.out.println("X ES GANADOR");
			termina = true;
		}
		
		if(tablamovida[1][1]=="[X]" && tablamovida[1][2]=="[X]" && tablamovida[1][3]=="[X]") {
			System.out.println("X ES GANADOR");
			termina = true;
		}
		
		if(tablamovida[0][2]=="[X]" && tablamovida[1][2]=="[X]" && tablamovida[2][2]=="[X]") {
			System.out.println("X ES GANADOR");
			termina = true;
		}
		
		return termina;
	}
	
	public boolean ganadorO(int x, int y, String[][]tablamovida) {

		boolean termina= false;
		if(tablamovida[0][1]=="[O]" && tablamovida[0][2]=="[O]"&& tablamovida[0][3]=="[O]" ) {
			System.out.println("O ES GANADOR");
			termina = true;
		}
		
		
		if(tablamovida[0][1]=="[O]" && tablamovida[1][1]=="[O]" && tablamovida[2][1]=="[O]") {
			System.out.println("O ES GANADOR");
			termina = true;
			
		}
		
		if(tablamovida[0][3]=="[O]" && tablamovida[1][3]=="[O]" && tablamovida[2][3]=="[O]") {
			System.out.println("O ES GANADOR");
			termina = true;
		}
		
		if(tablamovida[0][1]=="[O]" && tablamovida[1][2]=="[O]" && tablamovida[2][3]=="[O]") {
			System.out.println("O ES GANADOR");
			termina = true;
		}
		
		if(tablamovida[0][3]=="[O]" && tablamovida[1][2]=="[O]" && tablamovida[2][1]=="[O]") {
			System.out.println("O ES GANADOR");
			termina = true;
		}
		
		
		if(tablamovida[2][1]=="[O]" && tablamovida[2][2]=="[O]" && tablamovida[2][3]=="[O]") {
			System.out.println("O ES GANADOR");
			termina = true;
		}
		
		if(tablamovida[1][1]=="[O]" && tablamovida[1][2]=="[O]" && tablamovida[1][3]=="[O]") {
			System.out.println("O ES GANADOR");
			termina = true;
		}
		
		if(tablamovida[0][2]=="[O]" && tablamovida[1][2]=="[O]" && tablamovida[2][2]=="[O]") {
			System.out.println("O ES GANADOR");
			termina = true;
		}
		
		return termina;
	}
}

