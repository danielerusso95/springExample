package it.softwareinside.smista;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * La  classe  Lettera  rappresenta  lettere  ai  fini  della  gestione  postale,
 * con  associati  indirizzi  di mittente e destinatario, e recanti l’informazione del “senso di marcia” della lettera,
 * ovvero se la  lettera  sta  viaggiando  nel  senso  standard  (ritornoAlMittente  =  false)  o  viceversa  sta ritornando 
 * indietro per essere restituita al mittente.
 * Al momento della costruzione, il senso di marcia della lettera è sempre quello standard, ma successivamente può essere modificato. 
 * @author daniele
 *
 */
public class Letter {
	private String sender;
	private String destinatario;
	private boolean returnToSender;
	public int getPriority() {
		return 0;
	}
	
}
