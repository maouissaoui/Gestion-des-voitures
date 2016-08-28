package fr.gestion.location.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Table Manager
 * 
 * @author aouissaoui
 */
@Entity
@Table(name = "MANAGER")
public class Manager extends AbstractDataObject {
	/** serial number */
	private static final long serialVersionUID = -5632809824222485257L;
	/** id manager */
	@Id
	@GeneratedValue
	private int idManager;
	/** nom de manager */
	@Column(name = "nomManager")
	private String nomManager;
	/** prenom de manager */
	@Column(name = "prenomManager")
	private String prenomManager;

	/** cin de manager */
	@Column(name = "cinManager")
	private int cinManager;

	/** permis conduite de manager */
	@Column(name = "permisconduite")
	private String permisConduite;

	/** numéro de carte de crédit manager */
	@Column(name = "ncartecredit")
	private int nCarteCredit;

	/** login de manager */
	@Column(name = "login")
	private String login;
	/** password de manager */
	@Column(name = "password")
	private String password;

	public Manager(int id) {
		this.idManager = id;
	}

	public Manager() {
	}

//	 @OneToMany((fetch = FetchType.LAZY, mappedBy = "voiture")
//	 private Set<Voiture> voitures;
	

	/**
	 * @return the voitures
	 */
	// public Set<Voiture> getVoitures() {
	// return voitures;
	// }
	//
	// /**
	// * @param voitures the voitures to set
	// */
	// public void setVoitures(Set<Voiture> voitures) {
	// this.voitures = voitures;
	// }

	@Override
	public int getId() {
		return getIdManager();
	}

	/**
	 * @return the idManager
	 */
	public int getIdManager() {
		return idManager;
	}

	/**
	 * @param idManager
	 *            the idManager to set
	 */
	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}

	/**
	 * @return the nomManager
	 */
	public String getNomManager() {
		return nomManager;
	}

	/**
	 * @param nomManager
	 *            the nomManager to set
	 */
	public void setNomManager(String nomManager) {
		this.nomManager = nomManager;
	}

	/**
	 * @return the prenomManager
	 */
	public String getPrenomManager() {
		return prenomManager;
	}

	/**
	 * @param prenomManager
	 *            the prenomManager to set
	 */
	public void setPrenomManager(String prenomManager) {
		this.prenomManager = prenomManager;
	}

	/**
	 * @return the cinManager
	 */
	public int getCinManager() {
		return cinManager;
	}

	/**
	 * @param cinManager
	 *            the cinManager to set
	 */
	public void setCinManager(int cinManager) {
		this.cinManager = cinManager;
	}

	/**
	 * @return the permisConduite
	 */
	public String getPermisConduite() {
		return permisConduite;
	}

	/**
	 * @param permisConduite
	 *            the permisConduite to set
	 */
	public void setPermisConduite(String permisConduite) {
		this.permisConduite = permisConduite;
	}

	/**
	 * @return the nCarteCredit
	 */
	public int getnCarteCredit() {
		return nCarteCredit;
	}

	/**
	 * @param nCarteCredit
	 *            the nCarteCredit to set
	 */
	public void setnCarteCredit(int nCarteCredit) {
		this.nCarteCredit = nCarteCredit;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
