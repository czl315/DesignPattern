package cn.czl.designModel.factoryCommon;

public class FactoryCommonTest {

	public static void main(String[] args) {
		FactoryCommon factory = new FactoryCommon();
		String rs = factory.getAnimal("mouse");
		System.out.println(rs);
		String rs2 = factory.getAnimal("cow");
		System.out.println(rs2);
		String rs3 = factory.getAnimal("aaa");
		System.out.println(rs3);
	}

}
