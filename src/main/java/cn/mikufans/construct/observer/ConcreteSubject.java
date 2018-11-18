package cn.mikufans.construct.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    List<Observer> list = new ArrayList();
    public void attach(Observer observer) {
        list.add(observer);
    }
    public void detach(Observer observer) {
        list.remove(observer);
    }
    public void notifyObservers(String message) {
        for(Observer o : list){
            o.update(message);
        }
    }
}
