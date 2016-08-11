package fr.gestion.location.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import fr.gestion.location.model.entity.Manager;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Table Voiture
 * 
 * @author aouissaoui
 *
 */
@Entity
@Table(name = "VOITURE")
public class Voiture extends AbstractDataObject {

	/**
	 * serial number
	 */
	private static final long serialVersionUID = -5632809824222485257L;
	@Id
	@GeneratedValue
	@Column(name = "idVoiture")
	private int idVoiture;
	/** Matricule du voiture */
	@Column(name = "matricule")
	private String matricule;
	/** le modele */
	@Column(name = "modele")
	private String modele;
	/** la marque */
	@Column(name = "marque")
	private String marque;
	/** le constructeur */
	@Column(name = "constructeur")
	private String constructeur;
	/** le moteur */
	@Column(name = "moteur")
	private String moteur;
	/** le prix */
	@Column(name = "prix")
	private double prix;

	@ManyToMany(mappedBy = "voitures")
	@JsonIgnore
	private List<User> users = new ArrayList<User>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idManager", nullable = false)
	private Manager manager;

	

	public Voiture(int id) {
		this.idVoiture = id;
	}

	public Voiture() {

	}

	@Override
	public int getId() {
		return getIdVoiture();
	}

	/**
	 * @return the idVoiture
	 */
	public int getIdVoiture() {
		return idVoiture;
	}

	/**
	 * @param idVoiture
	 *            the idVoiture to set
	 */
	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule
	 *            the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * @param modele
	 *            the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque
	 *            the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the constructeur
	 */
	public String getConstructeur() {
		return constructeur;
	}

	/**
	 * @param constructeur
	 *            the constructeur to set
	 */
	public void setConstructeur(String constructeur) {
		this.constructeur = constructeur;
	}

	/**
	 * @return the moteur
	 */
	public String getMoteur() {
		return moteur;
	}

	/**
	 * @param moteur
	 *            the moteur to set
	 */
	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users
	 *            the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	

}
