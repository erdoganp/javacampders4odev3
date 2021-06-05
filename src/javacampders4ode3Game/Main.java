package javacampders4ode3Game;
import java.time.LocalDate;

import javacampders4ode3Game.Adapters.Edevlet;
import javacampders4ode3Game.Concrete.SellManager;
import javacampders4ode3Game.Concrete.UserManager;
import javacampders4ode3Game.Entities.DiscountCoupen;
import javacampders4ode3Game.Entities.Product;
import javacampders4ode3Game.Entities.User;

public class Main {

	public static void main(String[] args) {
		
		User user1=new User(1,"Erdogan","Pacaci",LocalDate.of(1991,04,21),"1345546");
		Product product = new Product();
		product.setProductid(1);
		product.setProductName("game1");
		product.setProductPrice(1500);
		
		DiscountCoupen discountCoupen=new DiscountCoupen();
		discountCoupen.setDiscountid(1);
		discountCoupen.setDiscountName("perfectgamer");
		discountCoupen.setDiscount(10);
		
		UserManager userManager=new UserManager();
		
		userManager.add(user1, new Edevlet());
		
		SellManager sellManager = new SellManager();
		
		sellManager.sell(user1, product, discountCoupen,new Edevlet());

	}

}
