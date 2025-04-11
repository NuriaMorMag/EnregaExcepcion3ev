import java.util.Scanner;

public class Test {
	
    static String tpalabros[] = {"caca","culo","pedo","pis"};
    
    public static void main ( String argv[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
        
        boolean terminar = false;
        
        while (!terminar) {
        	
            try {
                // Llamamos al método que lee y valida la línea
                String linea = leerLineaOK(sc);

                // Si es un punto, terminamos el programa
                if (linea.equals(".")) {
                    System.out.println("Fin de programa.");
                    break;
                }

                // Si la linea es correcta mostramos OK
                System.out.println("OK");
                
            } catch (BurradasNOException e) {
                // Si se lanza la excepción, mostramos el mensaje de error
                System.out.println(e.getMessage());
                // Mostrar la palabra prohibida:
                System.out.println("Palabra prohibida: " + e.getPalabraProhibida());
            }
        }
        
    }
     
    // Método que lee una línea y verifica si contiene palabras prohibidas
    public static String leerLineaOK (Scanner sc) throws BurradasNOException {
    	String linea = sc.nextLine();
    	
    	for (int i = 0; i < tpalabros.length; i++) {
    		String palabra = tpalabros[i];
    		
            // Comprobamos si la línea contiene una palabra prohibida
            if (linea.toLowerCase().contains(palabra)) {
                throw new BurradasNOException(palabra); // Lanzamos nuestra excepción personalizada con la palabra prohibida
            }
        }
    	
    	return linea; //línea que escribió el usuario, solo se devuelve si no tiene palabras prohibidas
    }
}

