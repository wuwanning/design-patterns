package cn.mikufans.create.factory.factory;

public class SquareFactory implements Factory{

	public Shape getShape() {
		return new Square();
	}

}
