package org.dimhat.demo3.factory;

import org.dimhat.demo3.product.BookProduct;
import org.dimhat.demo3.product.Product;

public class BookFactory implements Factory {

	@Override
	public Product createProduct() {
		return new BookProduct();
	}

}
