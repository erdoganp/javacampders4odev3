package javacampders4ode3Game.Concrete;

import javacampders4ode3Game.Abstract.BaseProduct;
import javacampders4ode3Game.Entities.Product;

public class ProductManager implements BaseProduct{

	@Override
	public void add(Product product) {
		System.out.println(product.getProductName()+ " has been added");
		
	}

	@Override
	public void delele(Product product) {
		System.out.println(product.getProductName()+ " has been deleted");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getProductName()+" has been updated");
		
	}

}
