package cn.mikufans.create.factory.factory;

public class CircleFactory implements Factory{

	public Shape getShape() {
		return new Circle();
	}

}
