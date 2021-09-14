package document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class DocumentoPrioritario extends Document{
	private int incremento;
	
	public DocumentoPrioritario(String text, int incremento) {
		super(text);
		this.incremento=incremento;
	}
	
	@Override
	public double calcolaQualita() {			
		return ((double)1/(1+text.length()))+incremento;		
	}

}
