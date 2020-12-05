package com.company;

import java.util.ArrayList;

public class WebServer implements WebRequestObservable{
    private RequestHandler requestHandler;
    private ArrayList<WebRequestObserver> observers = new ArrayList();

    public WebServer(RequestHandler requestHandler){
        this.requestHandler = requestHandler;
    }

    public String getRequest(WebRequest request) {
        this.requestHandler.handleRequest(request);
        this.notifyObservers(request);
        return "";
    }

    public void attach(WebRequestObserver observer) {
        this.observers.add(observer);
    }

    public void detach(WebRequestObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(WebRequest webRequest) {
        for (WebRequestObserver observer : observers){
            observer.update(webRequest);
        }
    }
}
