package db.exceptions;

public class GeneralDBException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public GeneralDBException(String msg) {
		super("Error: " + msg);
	}
}
