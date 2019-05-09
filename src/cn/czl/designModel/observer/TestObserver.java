package cn.czl.designModel.observer;

public class TestObserver {

	public static void main(String[] args) {
		ObserveredInterface observered = new ObserveredInterfaceImpl();
		
		ObserserInterface oberserA = new ObserserInterfaceImplA();
		ObserserInterface oberserB = new ObserserInterfaceImplB();
		observered.addObserver(oberserA );//���ӵ�1���۲���
		observered.addObserver(oberserB );//���ӵ�2���۲���
		
		observered.notifyObserver();
	}

}
