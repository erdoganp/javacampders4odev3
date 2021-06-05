package javacampders4ode3Game.Abstract;

import javacampders4ode3Game.Adapters.Edevlet;
import javacampders4ode3Game.Entities.User;

public interface BaseUser {
	void add(User user,Edevlet edevlet);
	void delete(User user);
	void update(User user);

}
