package Hopital.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "secretary")
@SequenceGenerator(name="seqSecretaire", sequenceName="secretary_sequence")
public class Secretaire {

	private Long id;
	private String nom;
	private String prenom;
	private  Civilite civilite;
	private boolean enPause=false;
//	@OneToMany(mappedBy="secretaire")
	private List<FileAttente> fileattentes =new ArrayList<>();
	
	
	public Secretaire() {
		super();
	}


	public Secretaire( String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	@Id
	@GeneratedValue(generator="seqSecretaire")
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	@Column(name = "lastname", length = 100)
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "firstname", length = 100)
	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "civility", length = 10)
	public Civilite getCivilite() {
		return civilite;
	}


	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}


	public boolean isEnPause() {
		return enPause;
	}

	@Column(name = "break", length = 100)
	public void setEnPause(boolean enPause) {
		this.enPause = enPause;
	}

	public List<FileAttente> getFileattente() {
		return fileattentes;
	}

	
	public void setFileattente(List<FileAttente> fileattentes) {
		this.fileattentes = fileattentes;
	}
	
	
	@Override
	public String toString() {

		return "--> Secretaire : \n----> Nom : " + nom + "\n----> Prenom : " + prenom + "\n----> Civilite : " + civilite + "\n----> En pause : " + enPause
				+ "\n";
	}

	
}
	
	
