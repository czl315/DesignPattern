package cn.czl.designModel.factoryMethodStatic;

public class FactoryMethodStatic {
	public static String getMethod1() {
		return new Method1ServiceImpl().getMethod();
	}
	public static String getMethod2() {
		return new Method2ServiceImpl().getMethod();
	}
}
