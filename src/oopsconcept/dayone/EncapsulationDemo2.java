package oopsconcept.dayone;

//encapsulation has controlled access 
public class EncapsulationDemo2 { //wrapping data and methods inside a class and not giving access to other classes for secured data.
	public static void main(String[] args) {
		EncapsulationDemo player = new EncapsulationDemo();
		player.setName("Dhoni");
		player.setAge(40);
		player.setJerseyNo(7);
		
//		System.out.println(player.getName());
//		System.out.println(player.getJerseyNo());
//		System.out.println(player.getAge());
		
		System.out.println(player);	
		
	}
}
