public class BurradasNOException extends Exception {
	
    private String palabraProhibida;

    //Constructor
    public BurradasNOException(String palabra) {
        super("Error no se permite lenguaje obsceno."); //super() llama al constructor de la clase Exception con el mensaje de error
        this.palabraProhibida = palabra;
    }

    // Getter para acceder a la palabra que causó el error
    public String getPalabraProhibida() {
        return palabraProhibida;
    }
   
}