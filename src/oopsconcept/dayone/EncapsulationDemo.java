package oopsconcept.dayone;

//encapsulation has controlled access 
public class EncapsulationDemo { //wrapping data and methods inside a class and not giving access to other classes for secured data.
	private String name;
	private int jerseyNo;
	private int age;
	
	public String getName() { //public because we want this method accessible to all classes 
		// get method reads/accesses the data ;here it reads the name.
		return name;
	}
	public int getJerseyNo(){
		return jerseyNo;
	}
	public int getAge() {
		return age;
	}
	
	//set method changes the data
	public void setName(String name) { //void as it returns null value 
		this.name =name; //The name belonging to the current object.
		// the parameter received by the method
		//take the value received as the parameter and store it in this object's name variable.
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo =jerseyNo;
	}
	public void setAge(int age) { //usually in pub variable the age can be set in negative , but with setter we can add validation
		if (age>0) {
		this.age=age;
		}
	}
	
	@Override
// every object in java gets basic methods from object like toString() 
//so, Object already has a toString() method, but I want my EncapsulationDemo to have its own version."
	
public String toString(){
	 	return "player [name=" + name + ",jerseyNo=" + jerseyNo + ",age=" + age + "]";
	}
	
//	public static void main(String[] args) {
//		EncapsulationDemo player = new EncapsulationDemo();
//		player.setName("Dhoni");
//		player.setAge(40);
//		player.setJerseyNo(7);
//		
////		System.out.println(player.getName());
////		System.out.println(player.getJerseyNo());
////		System.out.println(player.getAge());
//		
//		System.out.println(player);
//		
//		
//	}
}
