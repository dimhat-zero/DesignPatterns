package org.dimhat.demo6;

/**
 * 适配器
 * <p>
 * 将一个类的接口转换成客户希望的另外一个接口。 <br/>
 * 应用场景：如ps2接口转换成usb接口，A系统的导出，适配B系统的导入
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月24日 下午2:33:54
 */
public class Main {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();// 被适配对象
		Target target = new Adapter(adaptee);// 适配器，目标接口的实现
		target.request();
	}

}
