package cn.mikufans.create.builder;

import org.junit.Test;

public class Demo {


	@Test
	public void testBuilder(){
		Director director = new Director(new ConcreateBuilder());
		Product product = director.build();
		product.bianli();
	}
}
