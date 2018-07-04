package cn.mikufans.create.builder;

public class Director {
	
	private Builder builder = null;
	
	public Director(Builder builder){
		this.builder = builder;
	}

	public Product build(){
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		
		return builder.getResult();
	}
}
