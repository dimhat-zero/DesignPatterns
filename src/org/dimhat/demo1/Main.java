package org.dimhat.demo1;

import org.dimhat.demo1.factory.AdidasFactory;
import org.dimhat.demo1.factory.Factory;
import org.dimhat.demo1.factory.NikeFactory;
import org.dimhat.demo1.product.Clothes;
import org.dimhat.demo1.product.Shoes;

/**
 * 抽象工厂
 * <p>
 * 优点：方便对产品族进行管理<br/>
 * 缺点：难以支持新产品，比如裤子
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月23日 下午5:03:43
 */
public class Main {

	public static void main(String[] args) {
		// adidas工厂
		Factory adidasFactory = new AdidasFactory();
		Clothes adidasClothes = adidasFactory.createClothes();
		adidasClothes.name();
		Shoes adidasShoes = adidasFactory.createShoes();
		adidasShoes.name();
		// nike工厂
		Factory nikeFactory = new NikeFactory();
		Clothes nikeClothes = nikeFactory.createClothes();
		nikeClothes.name();
		Shoes nikeShoes = nikeFactory.createShoes();
		nikeShoes.name();

	}

}
