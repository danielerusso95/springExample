package lesson6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class testLombok {
	public int test=0;
	public int test1=0;
	
	public void test() {
		System.out.println("ciao");
	}
}
