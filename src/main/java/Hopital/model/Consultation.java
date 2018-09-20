package Hopital.model;
import java.util.Date;

public class Consultation {
	
	private Date dateVisiteArrive;
	private Date dateVisiteFin;
	
	private Patient patient;
	private Salle salle;
	private Specialite specialite;
	

	public Consultation(Date dateVisiteArrive, Patient patient, Salle salle,  Specialite spec) {
		super();
		this.dateVisiteArrive = dateVisiteArrive;
		this.patient = patient;
		this.salle = salle;
		this.specialite = spec;
	}

	public Date getDateVisiteArrive() {
		return dateVisiteArrive;
	}

	public Date getDateVisiteFin() {
		return dateVisiteFin;
	}

	public void setDateVisiteFin(Date dateVisiteFin) {
		this.dateVisiteFin = dateVisiteFin;
	}

	@Override
	public String toString() { 
		return "--> Consultation : \n----> Date arrivee visite : " + dateVisiteArrive+ "\n"+ patient + salle+ specialite + "\n";
	}
	

}
