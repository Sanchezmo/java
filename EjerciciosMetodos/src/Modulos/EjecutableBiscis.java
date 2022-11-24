package Modulos;

public class EjecutableBiscis {
	
	public static void main(String[] args) {
		Bici montanesa = new Bici("montana",120,"dani","carabanchel");
		Bici carretera = new Bici("carretera",33,"dani","carabanchel");
		montanesa.getModelo();
		Bici bici1 = new Bici("dani","carabanchel");
		montanesa.setModelo("carretera");
		
		System.out.println(bici1);
		
		System.out.println(montanesa.getModelo());
		System.out.println(montanesa.getNumserie());
		String sql = "Insert into Bicis("+montanesa.getModelo()+")";
		System.out.println(sql);
		System.out.println(Operaciones.multiplicar(montanesa.getNumserie(), carretera.getNumserie()));
		
		
		//dejamos aqui que vamos a jugar con las clases wehivulo y bicicleta
	}

}
