package cn.czl.designModel.observer;

public class TestObserver {

	public static void main(String[] args) {
		ObserveredInterface observered = new ObserveredInterfaceImpl();
		
		ObserserInterface oberserA = new ObserserInterfaceImplA();
		ObserserInterface oberserB = new ObserserInterfaceImplB();
		observered.addObserver(oberserA );//增加第1个观察者
		observered.addObserver(oberserB );//增加第2个观察者
		
		observered.notifyObserver();
	}

}
