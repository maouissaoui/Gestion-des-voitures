package fr.gestion.location.model.entity;

/**
 * Interface de tous les objets DATA
 * @author aouissaoui
 *
 */
import java.io.Serializable;

public abstract class AbstractDataObject implements Serializable {
	/**
	 * serial number
	 */
	private static final long serialVersionUID = 6267026062454788851L;
	/**
	 * @return l'id du DATA object
	 */
	public abstract int getId();

}
