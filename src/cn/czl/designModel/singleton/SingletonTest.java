package cn.czl.designModel.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println("��������Singleton����һ�ֳ��õ����ģʽ����JavaӦ���У����������ܱ�֤��һ��JVM�У��ö���ֻ��һ��ʵ�����ڡ�������ģʽ�м����ô���\r\n" + 
				"\r\n" + 
				"1��ĳЩ�ഴ���Ƚ�Ƶ��������һЩ���͵Ķ�������һ�ʺܴ��ϵͳ������\r\n" + 
				"\r\n" + 
				"2��ʡȥ��new��������������ϵͳ�ڴ��ʹ��Ƶ�ʣ�����GCѹ����\r\n" + 
				"\r\n" + 
				"3����Щ���罻�����ĺ��Ľ������棬�����Ž������̣����������Դ�������Ļ���ϵͳ��ȫ���ˡ�������һ�����ӳ����˶��˾��Աͬʱָ�ӣ��϶����ҳ�һ�ţ�������ֻ��ʹ�õ���ģʽ�����ܱ�֤���Ľ��׷��������������������̡�\r\n" + 
				"--------------------- \r\n");
		
		Singleton singleton = Singleton.getInstance();
		for (int i = 0; i < 10; i++) {
			System.out.println(singleton);
		}
	}

}
