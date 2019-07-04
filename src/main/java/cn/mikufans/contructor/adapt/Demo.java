package cn.mikufans.contructor.adapt;

public class Demo {

	public static void main(String[] args) {
		Adaptor ad = new Adaptor();
		ad.twoSocket();
		ad.socket();
		
		Adapter ad2 = new Adapter(new Adaptee());
		ad2.twoSocket();
		ad2.socket();
	}
}
