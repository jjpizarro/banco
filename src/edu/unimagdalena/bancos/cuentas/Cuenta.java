package edu.unimagdalena.bancos.cuentas;

public class Cuenta {
	private final Persona titular;
	private double saldo;
	private EstadoCuenta estado;
	private double[] ultimasOperaciones = null;
	
	public Cuenta(Persona titular) {
		this(titular, 100.0);
	}
	
	
	public Cuenta(Persona titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.estado = EstadoCuenta.ACTIVA;
		this.ultimasOperaciones = new double[20];
	}


	public void ingreso(double cantidad){
		saldo += cantidad;
	}
	
	public void reintegro(double cantidad){
		if(cantidad <= saldo){
			saldo -= cantidad;
		}
	}


	public Persona getTitular() {
		return titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public EstadoCuenta getEstado() {
		return estado;
	}


	public void setEstado(EstadoCuenta estado) {
		this.estado = estado;
	}
	
	
}
