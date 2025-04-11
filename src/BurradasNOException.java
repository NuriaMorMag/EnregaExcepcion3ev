/**
 * Excepción personalizada para manejar el lenguaje obsceno en mensajes.
 * Esta clase hereda de la clase Exception.
 */

public class BurradasNOException extends Exception {
	
	/** La palabra prohibida que causó la excepción. */
    private String palabraProhibida;

    /**
     * Constructor para crear una nueva excepción con la palabra prohibida.
     * 
     * @param palabra La palabra prohibida que causó la excepción.
     */
    public BurradasNOException(String palabra) {
        super("Error no se permite lenguaje obsceno."); //super() llama al constructor de la clase Exception con el mensaje de error
        this.palabraProhibida = palabra;
    }

    /**
     * Obtiene la palabra prohibida que causó la excepción.
     * 
     * @return La palabra prohibida.
     */
    public String getPalabraProhibida() {
        return palabraProhibida;
    }
   
}