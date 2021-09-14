
public class Home {

	public String type;
	public String name;
	public double area,price=this.area*1000;
	public Owner owner;
	public int num;
	
	
	public Home(String name,String type, double area, int num) {
		this.name=name;
		this.num=num;
		this.type=type;
		this.area=area;
		this.price=this.area*1000;	
	}
	
	public void setOwner(Owner owner) {
		this.owner=owner;
	}
	
	public double getPrice() {
		return this.price;
	}

	public double getArea() {
		return this.area;
	}

	public String getType() {
		return this.type;
	}
	public String getName() {
		return this.name;
	}
	
	
}
