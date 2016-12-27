public class Animal {

	protected String name;
	
	public Animal(){
		
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void move(){
		System.out.println("Animal move");
	}
}