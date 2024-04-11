package edu.ifsc.gof.observer.model;

import edu.ifsc.gof.observer.interfaces.Observer;
import edu.ifsc.gof.observer.interfaces.Subject;

public class ConcreteObserver implements Observer{
    private String name;
    private Subject topic;

    public ConcreteObserver(String name) {
        this.name = name;
    }
        
    @Override
    public void update() {
        String msg = (String)topic.getupdate(this);
    }

    @Override
    public void setSubject(Subject subj) {
        this.topic = subj;
    }
    
}
