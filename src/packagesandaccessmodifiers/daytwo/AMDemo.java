package packagesandaccessmodifiers.daytwo;

public class AMDemo {
		public static void main(String[] args) {
			AccessModifierDemo amd1 = new AccessModifierDemo();
			System.out.println(amd1.publicVar);   // Can be accessed from anywhere
			
			//System.out.println(amd1.privateVar); // Cannot be accessed outside AccessModifierDemo
			System.out.println(amd1.protectedVar);  // Accessible because AMDemo is in the SAME package
			System.out.println(amd1.defaultVar); // Accessible because AMDemo is in the SAME package

		}

	}