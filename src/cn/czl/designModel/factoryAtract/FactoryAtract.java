package cn.czl.designModel.factoryAtract;

public class FactoryAtract {

	public static void main(String[] args) {
		Face face = new Factory1Service();
		String rs = face.getRs();
		System.out.println(rs);
		
		Face face2 = new Factory2Service();
		String rs2 = face2.getRs();
		System.out.println(rs2);
	}

}
