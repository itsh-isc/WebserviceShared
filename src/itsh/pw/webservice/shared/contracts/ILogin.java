package itsh.pw.webservice.shared.contracts;

/**
 * 	Interfaz contrato para Login
 * 
 * 	@author     MRYSI. Sinesio Ivan Carrillo Heredia
 * 	@version    05/Abr/2017
 *
**/

/* Modificaciones
 * Fecha		Modificó	Descripción
 * <dd/mm/aaaa>         <autor>		<comentarios>	
 */

import itsh.pw.webservice.shared.model.dto.PerfilUsuarioDTO;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ILogin extends ContratoWS{
    @WebMethod 
    public abstract int validarLogin(String usuario, String password);
    
    @WebMethod 
    public abstract PerfilUsuarioDTO[] getPerfil(int idUsuario);
}
