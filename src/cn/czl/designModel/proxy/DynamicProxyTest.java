package cn.czl.designModel.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
	public static void main(String[] args) {
		BuyCar buyCar = new BuyCarImpl();
//		buyCar.buy();
		BuyCar buyCarProxy = (BuyCar) Proxy.newProxyInstance(BuyCar.class.getClassLoader(), new Class[] {BuyCar.class}, new DynamicProxyHandler(buyCar));
		buyCarProxy.buy();
	}
}
