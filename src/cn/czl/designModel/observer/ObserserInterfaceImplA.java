package cn.czl.designModel.observer;

public class ObserserInterfaceImplA implements ObserserInterface {

	@Override
	public void update() {
		System.out.println(getClass().getSimpleName()+"�۲���A������");
	}

}
