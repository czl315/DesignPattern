package cn.czl.designModel.factoryMethod;

public class FactoryMethod {
	public String getMethod1() {
		return new Method1ServiceImpl().getMethod();
	}
	public String getMethod2() {
		return new Method2ServiceImpl().getMethod();
	}
}
