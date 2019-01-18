package cn.mikufans.construct.proxy;

public class Agent implements Idol{

	private KizunaAi ai;

	public void singing() {
		System.out.println("下面有请我们的IDOL爱酱");
		if(ai == null){
			ai = new KizunaAi();
		}
		ai.singing();
	}

}
