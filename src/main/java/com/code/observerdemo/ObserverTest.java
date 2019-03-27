package com.code.observerdemo;

import com.code.observerdemo.observable.Publish;
import com.code.observerdemo.observer.Subscribe;

public class ObserverTest {

    public static void main(String[] args) {
        Publish publish = new Publish();
        Subscribe subscribe = new Subscribe(publish);
        publish.setData("发布一个消息");
    }
}
