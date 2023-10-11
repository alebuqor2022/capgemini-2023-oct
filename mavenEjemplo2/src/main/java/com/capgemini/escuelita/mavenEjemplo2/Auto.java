package com.capgemini.escuelita.mavenEjemplo2;

public class Auto {

	String marca="Toyota";
	String color="negro";
	double motor=2.0;

	public Auto() {
		super();
	}

	public Auto(String marca, String color, double motor) {
		super();
		this.marca = marca;
		this.color = color;
		this.motor = motor;
	}

	public void imprimirInfo() {
		System.out.println("el auto marca " + this.marca +
				" es de color " + this.color + " tiene una potencia de " +
				this.motor);
	}

	public void subirPotencia(double potencia) {
		this.motor+=potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}


	}

