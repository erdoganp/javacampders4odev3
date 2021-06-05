package javacampders4ode3Game.Concrete;

import javacampders4ode3Game.Abstract.BaseUser;
import javacampders4ode3Game.Adapters.Edevlet;
import javacampders4ode3Game.Entities.User;

public class UserManager implements BaseUser{

	@Override
	public void add(User user,Edevlet edevlet) {
		if(edevlet.checktheUser(user))
			System.out.println(user.getName()+ " has been registered");
		else {
			System.out.println("has not registered");
			}
		}
	

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println(" user is deleted");
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("user is updated");


}
}