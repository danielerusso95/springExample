package it.softwareinside.smista;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)

/**
 * La classe LetteraPrioritaria rappresenta lettere con associata un’informazione addizionale di priorità.
 * @author daniele
 *
 */
public class PriorityLetter extends Letter {
	private int priority;
	
	public PriorityLetter(String sender,String 
			recipient, boolean returnToSender, int priority) {
		super(sender,recipient,returnToSender);
		setPriority(priority);
	}
		
	public void setPriority(int priority) {
		if(priority>0) this.priority = priority;
		else this.priority=1;
	}
	
	@Override
	/**
	 * Il  metodo  getPriorità  restituisce  la  priorità  attuale  delle  lettere
	 * se  queste  viaggiano nel  senso  standard  (da  mittente  a  destinatario),
	 * mentre  restituisce  zero  se  viaggiano in senso inverso.
	 */
	public int getPriority() {
		if(!this.isReturnToSender())
			return this.priority;
		else return 0;
	}
	
	@Override
	public String toString() {
		return "Priority"+super.toString()+" "+this.getPriority();
	}
}
