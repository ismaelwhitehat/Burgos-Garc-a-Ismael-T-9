package Exceptions;


// Creamos la Exception

@SuppressWarnings("serial")
public class ElementNotAllowedException extends RuntimeException {
	
	public ElementNotAllowedException(String mensaje){
		
		super("Excepción:"+mensaje);
	}

}
