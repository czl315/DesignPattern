package cn.czl.designModel.proxy;

public class StaticProxy implements BuyCar {
	private BuyCar buyCarImpl;
	
	public StaticProxy(BuyCar buyCar) {
		this.buyCarImpl = buyCar;
	}
	

	@Override
	public void buy() {
		System.out.println("前置工作");
		buyCarImpl.buy();
		System.out.println("后续工作");
	}

}
