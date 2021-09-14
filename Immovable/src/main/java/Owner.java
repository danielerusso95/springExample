import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
	public String name,surname,cf;
	public int age;
	
	public Owner(String name,String surname,String cf, int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.cf=cf;
	}
//	public String getName() {
//		return this.name;
//	}
//	public String getSurname() {
//		return this.surname;
//	}
//	public int getAge() {
//		return this.age;
//	}
//	public String getCf() {
//		return this.cf;
//	}
	
	public void printOwner() {
		System.out.println(this.name+" "+this.surname+" "+this.age+" "+this.cf);
	}
}
