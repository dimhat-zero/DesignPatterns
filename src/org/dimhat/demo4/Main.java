package org.dimhat.demo4;

/**
 * 原型
 * <p>
 * 性能比new好，重复创建相似对象时使用<br/>
 * 注意：如果拷贝8种基本类型之外的需要深拷贝
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月24日 上午11:41:10
 */
public class Main {

	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		for (int i = 0; i < 10; i++) {
			ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
			clonecp.show();
		}
	}

}
