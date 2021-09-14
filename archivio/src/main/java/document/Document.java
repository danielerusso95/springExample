package document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
	String text;
	
	public double calcolaQualita() {
		return (double)1/(1+text.length());		
	}
	
}
