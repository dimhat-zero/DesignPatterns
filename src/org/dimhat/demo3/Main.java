package org.dimhat.demo3;

import org.dimhat.demo3.factory.AppFactory;
import org.dimhat.demo3.factory.BookFactory;
import org.dimhat.demo3.factory.Factory;
import org.dimhat.demo3.factory.SimpleFactory;
import org.dimhat.demo3.product.Product;

/**
 * 工厂方法
 * <p>
 * 工厂方法让类把实例化推迟到子类
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月24日 上午10:30:56
 */
public class Main {

	public static void main(String[] args) {

		Factory appFactory = new AppFactory();
		Factory bookFactory = new BookFactory();

		Product appProduct = appFactory.createProduct();
		appProduct.name();
		Product bookProduct = bookFactory.createProduct();
		bookProduct.name();

		// 简单工厂
		SimpleFactory factory = new SimpleFactory();
		Product product = factory.createProduct("book");
		product.name();
	}

}
