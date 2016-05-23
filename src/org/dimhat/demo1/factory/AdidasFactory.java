package org.dimhat.demo1.factory;

import org.dimhat.demo1.product.AdidasClothes;
import org.dimhat.demo1.product.AdidasShoes;
import org.dimhat.demo1.product.Clothes;
import org.dimhat.demo1.product.Shoes;

public class AdidasFactory implements Factory {

	@Override
	public Clothes createClothes() {
		return new AdidasClothes();
	}

	@Override
	public Shoes createShoes() {
		return new AdidasShoes();
	}

}
