package itsh.pw.webservice.shared.contracts;

/**
 * 	Interfaz contrato para Ejemplo
 * 
 * 	@author     MRYSI. Sinesio Ivan Carrillo Heredia
 * 	@version    05/Abr/2017
 *
**/

/* Modificaciones
 * Fecha		Modificó	Descripción
 * <dd/mm/aaaa>         <autor>		<comentarios>	
 */

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IEjemplo extends ContratoWS{
        
    @WebMethod 
    public abstract String procesarAlgo(String text1, String text2);

    @WebMethod 
    public abstract boolean procesarOtraCosa();
    
}

