package org.dimhat.demo3.factory;

import org.dimhat.demo3.product.AppProduct;
import org.dimhat.demo3.product.BookProduct;
import org.dimhat.demo3.product.Product;

public class SimpleFactory {

	public Product createProduct(String name) {
		if ("app".equalsIgnoreCase(name))
			return new AppProduct();
		else if ("book".equalsIgnoreCase(name)) {
			return new BookProduct();
		} else {
			return null;
		}

	}
}
