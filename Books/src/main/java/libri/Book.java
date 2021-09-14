package libri;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	private String title;
	private int pages;
	
	@Override
	public String toString() {
		return getTitle()+" "+getPages();
	}
}
