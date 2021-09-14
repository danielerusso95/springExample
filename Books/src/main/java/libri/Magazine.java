package libri;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Magazine extends Book {
	
	private int numRelease;
	
	public Magazine(String title, int pages, int numRelease) {
		super(title,pages);
		this.numRelease=numRelease;
	}
	@Override
	public String toString() {
		return super.toString()+" "+getNumRelease();
	}
}

