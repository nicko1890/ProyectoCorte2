package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel {

	private JLabel cedula, fechaExp, lugarExp, apellidos, nombres, fechaNacimiento, lugarNacimiento, sexo;

	private JTextField tCedula, tFechaExp, LtugarExp, tApellidos, tNombres, tFechaNacimiento, tLlugarNacimiento, tSexo;
	
	private JButton agregar, eliminar, modificar;
	
	public PanelDatos() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		setBorder(new TitledBorder("Ingrese sus datos"));
		
		
	}

	public JLabel getCedula() {
		return cedula;
	}

	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}

	public JLabel getFechaExp() {
		return fechaExp;
	}

	public void setFechaExp(JLabel fechaExp) {
		this.fechaExp = fechaExp;
	}

	public JLabel getLugarExp() {
		return lugarExp;
	}

	public void setLugarExp(JLabel lugarExp) {
		this.lugarExp = lugarExp;
	}

	public JLabel getApellidos() {
		return apellidos;
	}

	public void setApellidos(JLabel apellidos) {
		this.apellidos = apellidos;
	}

	public JLabel getNombres() {
		return nombres;
	}

	public void setNombres(JLabel nombres) {
		this.nombres = nombres;
	}

	public JLabel getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(JLabel fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public JLabel getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(JLabel lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public JLabel getSexo() {
		return sexo;
	}

	public void setSexo(JLabel sexo) {
		this.sexo = sexo;
	}

	public JTextField gettCedula() {
		return tCedula;
	}

	public void settCedula(JTextField tCedula) {
		this.tCedula = tCedula;
	}

	public JTextField gettFechaExp() {
		return tFechaExp;
	}

	public void settFechaExp(JTextField tFechaExp) {
		this.tFechaExp = tFechaExp;
	}

	public JTextField getLtugarExp() {
		return LtugarExp;
	}

	public void setLtugarExp(JTextField ltugarExp) {
		LtugarExp = ltugarExp;
	}

	public JTextField gettApellidos() {
		return tApellidos;
	}

	public void settApellidos(JTextField tApellidos) {
		this.tApellidos = tApellidos;
	}

	public JTextField gettNombres() {
		return tNombres;
	}

	public void settNombres(JTextField tNombres) {
		this.tNombres = tNombres;
	}

	public JTextField gettFechaNacimiento() {
		return tFechaNacimiento;
	}

	public void settFechaNacimiento(JTextField tFechaNacimiento) {
		this.tFechaNacimiento = tFechaNacimiento;
	}

	public JTextField gettLlugarNacimiento() {
		return tLlugarNacimiento;
	}

	public void settLlugarNacimiento(JTextField tLlugarNacimiento) {
		this.tLlugarNacimiento = tLlugarNacimiento;
	}

	public JTextField gettSexo() {
		return tSexo;
	}

	public void settSexo(JTextField tSexo) {
		this.tSexo = tSexo;
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getModificar() {
		return modificar;
	}

	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}
}


