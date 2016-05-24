package org.dimhat.demo3.factory;

import org.dimhat.demo3.product.AppProduct;
import org.dimhat.demo3.product.Product;

public class AppFactory implements Factory {

	@Override
	public Product createProduct() {
		return new AppProduct();
	}

}
