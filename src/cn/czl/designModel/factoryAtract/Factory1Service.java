package cn.czl.designModel.factoryAtract;

public class Factory1Service implements Face {

	@Override
	public String getRs() {
		return new Busi1ServiceImpl().getRs();
	}
}
