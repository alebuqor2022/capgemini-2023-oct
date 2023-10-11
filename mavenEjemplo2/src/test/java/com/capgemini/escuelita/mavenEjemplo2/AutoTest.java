package com.capgemini.escuelita.mavenEjemplo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AutoTest {
	static Auto miAuto;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("estoy en el BEFORE ALL " );
		miAuto=new Auto("Ford","azul",1.0);
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("estoy en el BEFORE each " );
	}
	
	@Test
	void testImprimirInfo() {
		String actual=miAuto.getColor();
		String expected="azul";
		assertEquals(expected, actual);
		System.out.println("espero que sea " + expected + " y me dio " + actual);
	}

	@Test
	void testSubirPotencia() {
		//fail("Not yet implemented");
		System.out.println("estoy en el Test de Motor " );
		miAuto.setMotor(3.0);
		double potenciaMax=4.0;
		assertTrue(miAuto.getMotor()<potenciaMax);
		
		
		
	}
	
	

	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("estoy en el AFTER ALL " );
	}

	


	

}
