package org.dimhat.demo1.factory;

import org.dimhat.demo1.product.Clothes;
import org.dimhat.demo1.product.Shoes;

public interface Factory {

	Clothes createClothes();

	Shoes createShoes();
}
