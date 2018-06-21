package cn.mikufans.create.singleton;

import org.junit.Test;

public class Demo {

	@Test
	public void test1(){
		SingletonEhan ehan = SingletonEhan.getInstance();
		SingletonEhan ehan2 = SingletonEhan.getInstance();
		System.out.println(ehan==ehan2);
	}
	
	@Test
	public void test2(){
		SingletonLanhan lanhan = SingletonLanhan.getInstance();
		SingletonLanhan lanhan2 = SingletonLanhan.getInstance();
		System.out.println(lanhan==lanhan2);
	}
	
}
