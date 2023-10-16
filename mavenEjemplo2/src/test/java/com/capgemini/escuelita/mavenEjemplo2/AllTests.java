package com.capgemini.escuelita.mavenEjemplo2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AutoTest.class, CalculadoraTest.class })
public class AllTests {

}
