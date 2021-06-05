package javacampders4ode3Game.Abstract;

import javacampders4ode3Game.Adapters.Edevlet;
import javacampders4ode3Game.Entities.DiscountCoupen;
import javacampders4ode3Game.Entities.Product;
import javacampders4ode3Game.Entities.User;

public interface BaseSell {
	void sell(User user,Product product,DiscountCoupen coupen,Edevlet edevlet);
}
