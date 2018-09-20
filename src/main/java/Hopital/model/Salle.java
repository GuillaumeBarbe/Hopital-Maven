package Hopital.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Salle {
	private long idSalle; 
	private String nomSalle;

	public Salle(String nomSalle) {
		super();
		this.nomSalle = nomSalle;
	}
    
	public String getNomSalle() {
		return nomSalle;
	}

	@Override
	public String toString() {
		return "----> Salle : \n--------> Nom salle : " + nomSalle + "\n";
	}
    
	@Id
	@OneToOne
	public long getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(long idSalle) {
		this.idSalle = idSalle;
	}
}
