package cn.czl.designModel.factoryCommon;

public class FactoryCommon {
	public String getAnimal(String animal) {
		if("mouse".equals(animal)) {
			return new AnimalMouseServiceImpl().getName();
		}else if("cow".equals(animal)) {
			return new AnimalCowServiceImpl().getName();
		}else {
			return "未实现的工厂方法";
		}
	}
}
