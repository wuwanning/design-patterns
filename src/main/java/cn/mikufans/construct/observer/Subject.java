package cn.mikufans.construct.observer;

public interface Subject {
	  public void attach(Observer observer);
	  public void detach(Observer observer);
	  
	  void notifyObservers(String message);
}
