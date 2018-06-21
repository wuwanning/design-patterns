package cn.mikufans.create.singleton;

public class SingletonEhan {

	//1 私有化构造方法
	private SingletonEhan(){};
	
	//2 初始化一个实例对象
	private static final SingletonEhan singletonLanhan = new SingletonEhan();
	
	//3 向外部提供获取实例的方法
	public static SingletonEhan getInstance(){
		return singletonLanhan;
	}
 	
}


