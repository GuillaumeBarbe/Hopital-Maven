package Hopital.model;

public class Patient {
	private String nom;
	private String prenom;
	private String numeroSecuriteSocial;
	private  Civilite civilite;
	

	public Patient(String nom, String prenom, String numeroSecuriteSocial, Civilite civilite) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroSecuriteSocial = numeroSecuriteSocial;
		this.civilite = civilite;
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


	public String getNumeroSecuriteSocial() {
		return numeroSecuriteSocial;
	}


	public void setNumeroSecuriteSocial(String numeroSecuriteSocial) {
		this.numeroSecuriteSocial = numeroSecuriteSocial;
	}


	public Civilite getCivilite() {
		return civilite;
	}


	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}


	@Override
	public String toString() {
		return "--> Patient : \n----> Nom : " + nom + "\n----> Prenom : " + prenom + "\n----> Numero securite social : " + numeroSecuriteSocial
				+ "\n----> Civilite : " + civilite + "\n";
	}

	
}
