package cn.czl.designModel.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObserveredInterfaceImpl implements ObserveredInterface {
	List<ObserserInterface> list = new ArrayList<ObserserInterface>();

	@Override
	public void addObserver(ObserserInterface oberserInterface) {
		list.add(oberserInterface);
	}

	@Override
	public void delObserver(ObserserInterface oberserInterface) {
		list.remove(oberserInterface);
	}

	@Override
	public void notifyObserver() {
		for (Iterator<ObserserInterface> iterator = list.iterator(); iterator.hasNext();) {
			ObserserInterface oberserInterface = (ObserserInterface) iterator.next();
			oberserInterface.update();
		}
	}

}
