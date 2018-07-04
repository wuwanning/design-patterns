package cn.mikufans.create.factory;

import org.junit.Test;

public class Demo {

	@Test
	public void test(){
		ShapeFactory sf = new ShapeFactory();
		//想要圆 
		Shape shape = sf.getShape("circle");
		shape.draw();
		
		//想要正方形
		Shape shape2 = sf.getShape("square");
		shape2.draw();
	}
}
