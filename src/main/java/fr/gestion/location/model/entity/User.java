package fr.gestion.location.model.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Table User
 * 
 * @author aouissaoui
 */
@Entity
@Table(name = "USER")
public class User extends AbstractDataObject {

	/**
	 * serial number
	 */
	private static final long serialVersionUID = -5632809824222485257L;
	/** id User */
	@Id
	@GeneratedValue
	private int idUser;
	/** nom de User */
	@Column(name = "nomUser")
	private String nomUser;
	/** prenom de User */
	@Column(name = "prenomUser")
	private String prenomUser;
	/** cin de User */
	@Column(name = "cinUser")
	private int cinUser;
	/** login de User */
	@Column(name = "loginUser")
	private String loginUser;
	/** password de User */
	@Column(name = "passwordUser")
	private String passwordUser;
	/** adresse de User */
	@Column(name = "adresseUser")
	private String adresseUser;
	/** teléphone de User */
	@Column(name = "telUser")
	private int telUser;

	public User(int id) {
		this.idUser = id;
	}

	public User() {
	}

	@JsonIgnore
	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinTable(name = "Location", joinColumns = { @JoinColumn(name = "idUser") }, inverseJoinColumns = {
			@JoinColumn(name = "idVoiture") })
	private Set<Voiture> voitures = new HashSet<Voiture>();

	@Override
	public int getId() {
		return getIdUser();
	}

	/**
	 * @return the idUser
	 */
	public int getIdUser() {
		return idUser;
	}

	/**
	 * @param idUser
	 *            the idUser to set
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	/**
	 * @return the nomUser
	 */
	public String getNomUser() {
		return nomUser;
	}

	/**
	 * @param nomUser
	 *            the nomUser to set
	 */
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	/**
	 * @return the prenomUser
	 */
	public String getPrenomUser() {
		return prenomUser;
	}

	/**
	 * @param prenomUser
	 *            the prenomUser to set
	 */
	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	/**
	 * @return the cinUser
	 */
	public int getCinUser() {
		return cinUser;
	}

	/**
	 * @param cinUser
	 *            the cinUser to set
	 */
	public void setCinUser(int cinUser) {
		this.cinUser = cinUser;
	}

	/**
	 * @return the loginUser
	 */
	public String getLoginUser() {
		return loginUser;
	}

	/**
	 * @param loginUser
	 *            the loginUser to set
	 */
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	/**
	 * @return the passwordUser
	 */
	public String getPasswordUser() {
		return passwordUser;
	}

	/**
	 * @param passwordUser
	 *            the passwordUser to set
	 */
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	/**
	 * @return the adresseUser
	 */
	public String getAdresseUser() {
		return adresseUser;
	}

	/**
	 * @param adresseUser
	 *            the adresseUser to set
	 */
	public void setAdresseUser(String adresseUser) {
		this.adresseUser = adresseUser;
	}

	/**
	 * @return the telUser
	 */
	public int getTelUser() {
		return telUser;
	}

	/**
	 * @param telUser
	 *            the telUser to set
	 */
	public void setTelUser(int telUser) {
		this.telUser = telUser;
	}

	/**
	 * @return the voitures
	 */
	public Set<Voiture> getVoitures() {
		return voitures;
	}

	/**
	 * @param voitures
	 *            the voitures to set
	 */
	public void setVoitures(Set<Voiture> voitures) {
		this.voitures = voitures;
	}

}
