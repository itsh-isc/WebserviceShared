package itsh.pw.webservice.shared.publish;

/**
 * 	Clase para inicializacion de Rutas del Webservice
 * 
 * 	@author     MRYSI. Sinesio Ivan Carrillo Heredia
 * 	@version    05/Abr/2017
 *
**/

/* Modificaciones
 * Fecha		Modificó	Descripción
 * <dd/mm/aaaa>         <autor>		<comentarios>	
 */

import java.util.Map;

public class Publishment {    
    private Map<String, String> paths;
    private String mainPath;
    private String serviceURI;
    
    public Publishment(String host, String port, String context, String serviceURI){
        this.mainPath = "http://" + host + ":" + port + "/" + context + "/ws/";
        this.serviceURI = serviceURI;
        
        this.paths = new Paths(mainPath);
    }
    
    public String getPath(String key){
        return paths.get(key);
    }
    
    public String getPathWsdl(String key){
        return getPath(key) + "?wsdl";
    }
    
    public String getServiceName(String path){
        return String.valueOf(path.charAt(0)).toUpperCase() + path.substring(1) + "Service";
    }
    
    public String getMainPath() {
        return mainPath;
    }

    public String getServiceURI() {
        return serviceURI;
    }
}
