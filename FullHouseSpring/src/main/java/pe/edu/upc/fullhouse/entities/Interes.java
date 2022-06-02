package pe.edu.upc.fullhouse.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Interes")
public class Interes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idInteres;

	@ManyToOne
	@JoinColumn(name = "idStudent")
	private Student student;
	
	public Interes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Interes(int idInteres, Student student) {
		super();
		this.idInteres = idInteres;
		this.student = student;
	}

	public int getIdInteres() {
		return idInteres;
	}

	public void setIdInteres(int idInteres) {
		this.idInteres = idInteres;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
