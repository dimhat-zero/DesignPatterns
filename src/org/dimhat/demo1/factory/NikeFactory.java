package org.dimhat.demo1.factory;

import org.dimhat.demo1.product.Clothes;
import org.dimhat.demo1.product.NikeClothes;
import org.dimhat.demo1.product.NikeShoes;
import org.dimhat.demo1.product.Shoes;

public class NikeFactory implements Factory {

	@Override
	public Clothes createClothes() {
		return new NikeClothes();
	}

	@Override
	public Shoes createShoes() {
		return new NikeShoes();
	}

}
