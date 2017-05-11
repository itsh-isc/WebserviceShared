package itsh.pw.webservice.shared.model.dto;

/**
 * 	POJO para envolver listado de objetos
 *      PerfilUsuarioDTO
 * 
 * 	@author     MRYSI. Sinesio Ivan Carrillo Heredia
 * 	@version    05/Abr/2017
 *
**/

/* Modificaciones
 * Fecha		Modificó	Descripción
 * <dd/mm/aaaa>         <autor>		<comentarios>	
 */

import java.util.List;

public class PerfilUsuarioList {
    private List<PerfilUsuarioDTO> perfilUsuarioList;

    public List<PerfilUsuarioDTO> get() {
        return perfilUsuarioList;
    }

    public void set(List<PerfilUsuarioDTO> perfilUsuarioList) {
        this.perfilUsuarioList = perfilUsuarioList;
    }
}
