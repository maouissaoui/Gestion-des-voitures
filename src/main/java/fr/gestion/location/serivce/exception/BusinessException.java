package fr.gestion.location.serivce.exception;

/**
 * Thrown by the business logic in case of some business related problem.
 *
 * @author naouissa
 */
public class BusinessException extends Exception {
	/**
	 * Default serial version id.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * un commit doit �tre fait ? utilise pour le commit entre la couche web et
	 * la couche applicative
	 */
	private Boolean commit = true;

	/**
	 * @return the commit
	 */
	public Boolean getCommit() {
		return commit;
	}

	/**
	 * @param commit
	 *            the commit to set
	 */
	public void setCommit(Boolean commit) {
		this.commit = commit;
	}
	
	/**
	 * Constructs a new exception with the specified message key.
	 *
	 * @param messageKey
	 *            the message key.
	 */
	public BusinessException(final String messageKey) {
		super(messageKey);
	}

	/**
	 * Returns the message key of this exception.
	 *
	 * @return the message key
	 */
	public String getMessageKey() {
		return getMessage();
	}
}
