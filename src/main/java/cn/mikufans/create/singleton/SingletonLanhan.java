package cn.mikufans.create.singleton;

public class SingletonLanhan {

	//1 私有化构造方法
	private SingletonLanhan(){};
	
	//2 生成 一个实例对象(先不初始化 所以不能使用final)
	private static  SingletonLanhan singletonLanhan = null;
	
	//3 向外部提供获取实例的方法 防止并发可以同步
	public static synchronized SingletonLanhan getInstance(){
		if(singletonLanhan == null){
			singletonLanhan = new SingletonLanhan();
		}
		return singletonLanhan;
	}
}
