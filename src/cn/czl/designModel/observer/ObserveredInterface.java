package cn.czl.designModel.observer;

public interface ObserveredInterface {
	public void addObserver(ObserserInterface oberserInterface);
	public void delObserver(ObserserInterface oberserInterface);
	public void notifyObserver();

}
