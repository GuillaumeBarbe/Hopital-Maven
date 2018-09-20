package Hopital.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


//@Entity
//@Table(name = "waitingqueue")
//@SequenceGenerator(name = "seqFile", sequenceName = "waitingqueue_sequence")

public class FileAttente {
//	@Id
//	@GeneratedValue(generator = "seqFile")
	private Long id;
	private List<Patient> listePatient = new ArrayList<>();
	private int capacite = 100;
	private Medecin medecin;
	private Secretaire Secretaire;
	


	
	
	
	public FileAttente(Long id, List<Patient> listePatient, int capacite) {
		super();
		this.id = id;
		this.listePatient = listePatient;
		this.capacite = capacite;
	}


	public FileAttente() {
	}


//	@ManyToOne
//	@JoinColumn(name ="secretary_id")
	public Secretaire getSecretaire() {
		return Secretaire;
	}

	
	public void setSecretaire(Secretaire secretaire) {
		Secretaire = secretaire;
	}


	public List<Patient> getListePatient() {
		return listePatient;
	}


	public void setListePatient(List<Patient> listePatient) {
		this.listePatient = listePatient;
	}


	public int getCapacite() {
		return capacite;
	}


	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	@Override
	public String toString() {
		return "--> FileAttente : \n----> ListePatient : \n" + listePatient + "\n---> Capacite : " + capacite + "\n";
	}




	public Medecin getMedecin() {
		return medecin;
	}




	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	
}
