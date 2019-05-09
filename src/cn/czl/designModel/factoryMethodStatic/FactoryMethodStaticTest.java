package cn.czl.designModel.factoryMethodStatic;

public class FactoryMethodStaticTest {

	public static void main(String[] args) {
		String rs = FactoryMethodStatic.getMethod1();
		System.out.println(rs);
		String rs2 = FactoryMethodStatic.getMethod2();
		System.out.println(rs2);
	}

}
