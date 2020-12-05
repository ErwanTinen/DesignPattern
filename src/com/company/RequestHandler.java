package com.company;

public abstract class RequestHandler {
    protected RequestHandler successor;

    public abstract void handleRequest(WebRequest webRequest);

    public void setSuccessor(RequestHandler successor) {
        this.successor = successor;
    }

    protected void successorHandleRequest(WebRequest webRequest) {
        if (this.successor != null) {
            this.successor.handleRequest(webRequest);
        }

    }
}