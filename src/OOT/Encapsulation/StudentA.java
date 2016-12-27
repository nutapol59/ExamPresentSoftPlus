public class StudentA {
	private String name;
	private String lastname;


	public StudentA(){
		System.out.println("Student");
	}

	public void setName(String name){
		this.name = name;
	}


	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public String getName(){
		return name;
	}

	public String getLastname(){
		return lastname;
	}
}