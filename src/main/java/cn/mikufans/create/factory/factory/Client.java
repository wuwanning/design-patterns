package cn.mikufans.create.factory.factory;

import org.junit.Test;

public class Client {

	@Test
	public void testFactory() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		//ShapeEasyFactory sf = new ShapeEasyFactory();
		Factory cf = (CircleFactory)Class.forName("cn.mikufans.create.factory.factory.CircleFactory").newInstance();
		Factory sf = (SquareFactory)Class.forName("cn.mikufans.create.factory.factory.SquareFactory").newInstance();
		//想要圆 
		Shape shape = cf.getShape();
		shape.draw();
		
		//想要正方形
		Shape shape2 = sf.getShape();
		shape2.draw();
	}
}
