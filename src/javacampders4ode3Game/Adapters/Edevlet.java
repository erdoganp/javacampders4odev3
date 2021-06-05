package javacampders4ode3Game.Adapters;

import javacampders4ode3Game.Entities.User;

public class Edevlet {

	public boolean checktheUser(User user) {
		
		if(!user.getName().isEmpty() && !user.getTcNumber().isEmpty()) {
			System.out.println("the user is legal");
			return true;
		}else {
			System.out.println("user is fake");
			return false;
		}
		
	}
}
