package cn.mikufans.construct.proxy;


public class Demo {

	public static void main(String[] args) {
		Idol idol = new Agent(new KizunaAi());
		idol.singing();
	}
}
