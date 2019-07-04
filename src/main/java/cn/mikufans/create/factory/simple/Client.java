package cn.mikufans.create.factory.simple;

import org.junit.Test;

public class Client {

	@Test
	public void testFactory(){
		ShapeSimpleFactory sf = new ShapeSimpleFactory();
		//想要圆 
		Shape shape = sf.getShape("circle");
		shape.draw();
		
		//想要正方形
		Shape shape2 = sf.getShape("square");
		shape2.draw();
	}
}
