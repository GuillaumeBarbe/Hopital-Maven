package Hopital.model;

public class Specialite {

	private String libelle; 
    private float prix; 
    private Medecin medecin = null; 
      

	public Specialite(String libelle, float prix, Medecin medecin) {
		super();
		this.libelle = libelle;
		this.prix = prix;
		this.medecin = medecin;
	}

	public Specialite(String libelle, float prix) {
		super();
		this.libelle = libelle;
		this.prix = prix;
	}

	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public Medecin getMedecin() {
		return medecin;
	}


	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "----> Specialite : \n--------> Libelle : " + libelle + "\n--------> Prix : " + prix + "\n--------> Nom Medecin : " +medecin.getNom()+"\n";
	}
	
      
}