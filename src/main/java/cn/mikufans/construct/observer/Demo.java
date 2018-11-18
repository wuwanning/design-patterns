package cn.mikufans.construct.observer;

public class Demo {
	public static void main(String[] args) {
		ConcreteSubject cs = new ConcreteSubject();
		ConcreteObserver o1 = new ConcreteObserver("mike");
		ConcreteObserver o2 = new ConcreteObserver("ane");
		cs.attach(o1);
		cs.attach(o2);
		cs.notifyObservers("今天不上班");
		ConcreteObserver o3 = new ConcreteObserver("vlan");
		cs.attach(o3);
		cs.notifyObservers("明天也不上班");
		cs.detach(o1);
		cs.notifyObservers("以后永远都不用上班咯 万岁");
		
	}
}
