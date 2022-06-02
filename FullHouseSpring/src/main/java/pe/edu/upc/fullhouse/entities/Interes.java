package pe.edu.upc.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Interes")
public class Interes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idInteres;

	public Interes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Interes(int idInteres) {
		super();
		this.idInteres = idInteres;
	}

	public int getIdInteres() {
		return idInteres;
	}

	public void setIdInteres(int idInteres) {
		this.idInteres = idInteres;
	}
	
	

}
