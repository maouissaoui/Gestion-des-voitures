package fr.gestion.location.model.entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * Table Location
 * 
 * @author aouissaoui
 */
@Entity
@Table(name = "LOCATION")
public class Location extends AbstractDataObject {

	/** serial number */
	private static final long serialVersionUID = -5632809824222485257L;
	/**  id Location */
	@Id
	@GeneratedValue
	private int idLocation;
	/** durée de location */
	@Column(name = "durée")
	private int durée;
	/** date de date */
	@Column(name = "date")
	private Date date;
	
	public  Location(int id) {
	this.idLocation=id;
	}
	public  Location() {
	
	}
	
	@Override
	public int getId() {

		return getIdLocation();
	}
	/**
	 * @return the idLocation
	 */
	public int getIdLocation() {
		return idLocation;
	}
	/**
	 * @param idLocation the idLocation to set
	 */
	public void setIdLocation(int idLocation) {
		this.idLocation = idLocation;
	}
	/**
	 * @return the durée
	 */
	public int getDurée() {
		return durée;
	}
	/**
	 * @param durée the durée to set
	 */
	public void setDurée(int durée) {
		this.durée = durée;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	

}
