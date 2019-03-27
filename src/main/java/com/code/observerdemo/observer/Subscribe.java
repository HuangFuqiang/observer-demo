package com.code.observerdemo.observer;

import com.code.observerdemo.observable.Publish;

import java.util.Observable;
import java.util.Observer;

public class Subscribe implements Observer {

    public Subscribe(Observable o) {
        //将该观察者放入待通知观察者里
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("收到了消息:" + ((Publish)o).getData());
    }
}
