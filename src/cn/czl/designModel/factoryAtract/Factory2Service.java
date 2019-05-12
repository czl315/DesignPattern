package cn.czl.designModel.factoryAtract;

public class Factory2Service implements Face {

	@Override
	public String getRs() {
		return new Busi2ServiceImpl().getRs();
	}
}
