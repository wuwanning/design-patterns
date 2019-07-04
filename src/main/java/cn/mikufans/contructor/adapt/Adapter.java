package cn.mikufans.contructor.adapt;

public class Adapter extends Adaptee implements Target {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		
		this.adaptee = adaptee;
	}
	
	
	public void socket() {
		System.out.println("可以使用三孔插座");
	}

}
