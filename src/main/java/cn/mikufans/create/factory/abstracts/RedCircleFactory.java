package cn.mikufans.create.factory.abstracts;

public class RedCircleFactory implements CircleFactory {

	public Circle getCircle() {
		
		return new RedCircle();
	}

}
