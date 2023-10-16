package com.capgemini.escuelita.mavenEjemplo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
static Calculadora calculo;

@BeforeAll
static void setUpBeforeClass() throws Exception {
	System.out.println("estoy en el BEFORE ALL " );
	calculo=new Calculadora();
}

	@Test
	void testSumar() {
		int suma=calculo.sumar(3, 5);
		// prueba feliz
		int rpta=8;
		System.out.println("prueba feliz de la suma " );
		assertEquals(suma, rpta);
		
		// prueba infeliz
		rpta=9;
		System.out.println("prueba infeliz de la suma " );
		assertEquals(suma, rpta);
	}

	@Test
	void testRestar() {
		int suma=calculo.restar(9, 5);
		// prueba feliz
		int rpta=4;
		System.out.println("prueba feliz de la resta " );
		assertEquals(suma, rpta);
	}

}
