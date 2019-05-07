package cn.mikufans.construct.proxy;

public class Agent implements Idol{

	private Idol idol;

	public Agent(Idol idol){
		this.idol = idol;
	} 
	
	public void singing() {
		System.out.println("下面有请我们的IDOL爱酱");
		idol.singing();
	}

}
