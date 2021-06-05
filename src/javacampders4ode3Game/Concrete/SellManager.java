package javacampders4ode3Game.Concrete;

import javacampders4ode3Game.Abstract.BaseSell;
import javacampders4ode3Game.Adapters.Edevlet;
import javacampders4ode3Game.Entities.DiscountCoupen;
import javacampders4ode3Game.Entities.Product;
import javacampders4ode3Game.Entities.User;

public class SellManager implements BaseSell{

	
	@Override
	public void sell(User user, Product product, DiscountCoupen coupen,Edevlet edevlet) {
		if(edevlet.checktheUser(user)) {
			double lastprice=product.getProductPrice()-(product.getProductPrice()*coupen.getDiscount()/100);
			System.out.println(product.getProductName()+" has selled for "+ lastprice+ " to " + user.getName());
		}else {
			System.out.println("Product couldn't be selled");
		}
		 
		
		
	}

}
