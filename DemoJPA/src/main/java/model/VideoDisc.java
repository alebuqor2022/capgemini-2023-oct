package model;
//1er ejemplo de herencia tradicional en JAVA
//public class VideoDisc extends Disc{
//
//	private String director;
//	private String lenguage;
//	
//	//getters & setters
//}

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

//2do Ejemplo 
//MAPEO --> Tabla por jerarquia de Clase
//@Entity
//@DiscriminatorValue("VIDEO")
//public class VideoDisc extends Disc{
//
//	@Column
//	private String director;
//	@Column
//	private String lenguage;
//	
//	//getters & setters
//}



////3er Ejemplo 
////MAPEO --> Tabla por Super y SubClase
//@Entity
//@Table(name="VIDEO_Disc")
//@PrimaryKeyJoinColumn(name="DiscId")
//public class VideoDisc extends Disc{
//
//	@Column
//	private String director;
//	@Column
//	private String lenguage;
//	
//	//getters & setters
//}

//4to Ejemplo 
//MAPEO --> Tabla por SubClase y clases concretas
@Entity
@Table(name="VIDEO_DISC")
public class VideoDisc extends Disc{

	@Column
	private String director;
	@Column
	private String lenguage;
	
	//getters & setters
}



