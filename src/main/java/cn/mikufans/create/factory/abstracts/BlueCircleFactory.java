package cn.mikufans.create.factory.abstracts;

public class BlueCircleFactory implements CircleFactory{

	public Circle getCircle() {
		return new BlueCircle();
	}
}
