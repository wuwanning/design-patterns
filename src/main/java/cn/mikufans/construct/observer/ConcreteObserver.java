package cn.mikufans.construct.observer;

public class ConcreteObserver implements Observer {

    private String name;
    private String message;
    
    public ConcreteObserver(String name) {
        this.name = name;
    }
    
  
    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }

	public void update(String message) {
		this.message = message;
        read();
		
	}
    
}

