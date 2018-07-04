package cn.mikufans.create.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private  List<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void bianli(){
		for(String part : parts){
			System.out.println("part:"+part);
		}
	}

}
