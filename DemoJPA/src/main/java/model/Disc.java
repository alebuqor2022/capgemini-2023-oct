package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//1er ejemplo tradicional de herencia en JAVA
//public abstract class Disc implements Serializable{
		
//private static final long serialVersionUID=-1L;
//
//private Long DiscId;
//private String name;
//private int price;

//getters & setters
//}


//2do ejemplo 
// MAPEO --> Tabla por Jerarquia de Clase
//@Entity
//@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="Disc_Type",discriminatorType=DiscriminatorType.STRING)
//public class Disc {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long DiscId;
//	@Column
//	private String name;
//	@Column
//	private int price;
//	
//}

////3er ejemplo 
////MAPEO --> Tabla por Super y SubClass
//@Entity
//@Inheritance (strategy=InheritanceType.JOINED)
//public abstract class Disc {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long DiscId;
//	@Column
//	private String name;
//	@Column
//	private int price;
//	
//}


//4TO ejemplo 
//MAPEO --> Tabla por SubClass o clases concretas
@Entity
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Disc {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long DiscId;
	@Column
	private String name;
	@Column
	private int price;
	
}






