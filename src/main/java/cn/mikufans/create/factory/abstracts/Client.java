package cn.mikufans.create.factory.abstracts;

import org.junit.Test;

public class Client {
	
	@Test
	public void testAbstractFactory(){
		CircleFactory blueFactory = new BlueCircleFactory();
		CircleFactory redFactory = new RedCircleFactory();
		
		blueFactory.getCircle().draw();
		redFactory.getCircle().draw();
	}

}
