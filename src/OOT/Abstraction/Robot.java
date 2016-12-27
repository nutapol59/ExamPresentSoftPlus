package OOT.Abstraction;
public abstract class Robot implements Arm,Foot{

	public Robot(){
		System.out.println("Robot");
		//count = 3;  //can't do
		System.out.println(count);
	}

	public void touch(){
		System.out.println("Robot Touch");
	}

	public void walk(){
		System.out.println("Robot Walk");
	}

	public abstract void say();


}