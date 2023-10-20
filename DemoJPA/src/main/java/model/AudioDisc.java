package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

// 1er ejemplo de herencia tradicional en JAVA
//public class AudioDisc extends Disc {
//		
//	private int nroOfSongs;
//	private String singer;
//	
//	//getters & setters
//}

// 2do Ejemplo 
// MAPEO --> Tabla por jerarquia de Clase
//@Entity
//@DiscriminatorValue("AUDIO")
//public class AudioDisc extends Disc {
//	@Column
//	private int nroOfSongs;
//	@Column
//	private String singer;
//}


////3er Ejemplo 
////MAPEO --> Tabla por Super y SubClase
//@Entity
//@Table(name="AUDIO_Disc")
//@PrimaryKeyJoinColumn(name="DiscId")
//public class AudioDisc extends Disc {
//	@Column
//	private int nroOfSongs;
//	@Column
//	private String singer;
//}

//4to Ejemplo 
//MAPEO --> Tabla por  SubClase o clases concretas
@Entity
@Table(name="AUDIO_DISC")
public class AudioDisc extends Disc {
	@Column
	private int nroOfSongs;
	@Column
	private String singer;
}




