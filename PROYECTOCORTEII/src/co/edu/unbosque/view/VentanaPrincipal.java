package co.edu.unbosque.view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

	private PanelDatos pDatos;

	public VentanaPrincipal() {
		
		setTitle("Registro de usuarios");
		
		setSize(1000, 760);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		inicializarComponentes();
		
	}
		
	public void inicializarComponentes() {
		
		pDatos = new PanelDatos();
		pDatos.setBounds(800, 600, 700, 300);
		getContentPane().add(pDatos);
	}

}
