package cn.czl.designModel.proxy;

public class StaticProxyTest {
	public static void main(String[] args) {
		BuyCar buyCar = new BuyCarImpl();
//		buyCar.buy();
		StaticProxy buyCarProxy = new StaticProxy(buyCar);
		buyCarProxy.buy();
	}
}
