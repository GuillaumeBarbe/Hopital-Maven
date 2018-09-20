package Hopital.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity

public class Medecin {
	
	private long ID; 
	private String nom; 
	private String prenom; 
	private Convention convention; 
	private boolean carteVitale; 
	private boolean cmu; 	
	private List<Specialite> listSpec;

	public Medecin(String nom, String prenom, Convention convention, boolean carteVitale, boolean cmu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.convention = convention;
		this.carteVitale = carteVitale;
		this.cmu = cmu;
		this.listSpec = new ArrayList<>();
		
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Convention getConvention() {
		return convention;
	}



	public void setConvention(Convention convention) {
		this.convention = convention;
	}



	public boolean isCarteVitale() {
		return carteVitale;
	}



	public void setCarteVitale(boolean carteVitale) {
		this.carteVitale = carteVitale;
	}



	public boolean isCmu() {
		return cmu;
	}



	public void setCmu(boolean cmu) {
		this.cmu = cmu;
	}



	public List<Specialite> getListSpec() {
		return listSpec;
	}



	public void setListSpec(List<Specialite> listSpec) {
		this.listSpec = listSpec;
	}



	@Override
	public String toString() {

		return "--> Medecin :\n----> Nom : " + nom + "\n----> Prenom : " + prenom + "\n----> Convention : " + convention + "\n----> CarteVitale : "+ carteVitale + "\n----> CMU : " + cmu + "\n" + listSpec + "\n";
	}
    
  
  
	
		
}
	

