package cn.czl.designModel.factoryMethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		FactoryMethod factory = new FactoryMethod();
		String rs = factory.getMethod1();
		System.out.println(rs);
		String rs2 = factory.getMethod2();
		System.out.println(rs2);
	}

}
