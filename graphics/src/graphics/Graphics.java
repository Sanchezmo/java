package graphics;

import java.awt.GridLayout;

import javax.swing.*;

public class Graphics {

	public static void main(String[] args) {
		//window
		JFrame jframe = new JFrame();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		jframe.setSize(600,600);
		jframe.setTitle("Pruebas graficas");
		//jframe.setLocation(0, 0);
		jframe.setLocationRelativeTo(null);
		//frame de pestaña(tabbed)
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JTabbedPane panelSolapas = new JTabbedPane();
		//elements panel 1
		
		JLabel label1 = new JLabel("Usuario");
		label1.setBounds(0, 0, 100, 20);
		JLabel label2 = new JLabel("Contraseña");
		label2.setBounds(0, 100, 100, 20);
		JTextField texto = new JTextField("Escriba Usuario");
		texto.setBounds(100, 0, 100, 20);
		JPasswordField pasw= new JPasswordField("Escriba Contraseña");
		pasw.setBounds(100, 100, 100, 20);
		JButton boton = new JButton("Enviar");
		boton.setBounds(300, 50, 100, 20);
		//tabla
		GridLayout tabla = new GridLayout();
		tabla.setColumns(2);
		tabla.setRows(2);
		//poner tabla al panel
		//panel1.setLayout(tabla);
		//add elements to panel
		panel1.setLayout(null);
		
		panel1.add(label1);
		panel1.add(texto);
		panel1.add(label2);
		panel1.add(pasw);
		panel1.add(boton);
		panelSolapas.add("pestaña 1",panel1);
		jframe.getContentPane().add(panelSolapas);

	}

}
