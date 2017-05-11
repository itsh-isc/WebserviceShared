package itsh.pw.webservice.shared.publish;

/**
 * 	Clase mapa para encapsulacion de Rutas del Webservice
 * 
 * 	@author     MRYSI. Sinesio Ivan Carrillo Heredia
 * 	@version    10/Abr/2017
 *
**/

/* Modificaciones
 * Fecha		Modificó	Descripción
 * <dd/mm/aaaa>         <autor>		<comentarios>	
 */

import java.util.HashMap;

public class Paths extends HashMap<String, String>{
    public Paths(String path){        
        String [] items = new String[]{
            "ejemplo",
            "login"
        };
        
        for(String item : items){
            this.put(item, path + item);
        }
    }
}
