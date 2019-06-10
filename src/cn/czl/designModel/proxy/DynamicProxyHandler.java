package cn.czl.designModel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
	
	private Object object;
	
	public DynamicProxyHandler(Object object){
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("动态代理-前置工作");
		Object obj = method.invoke(object, args);
		System.out.println("动态代理-后续工作");
		return obj;
	}

}
