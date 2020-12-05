package com.company;

public class ExistingContentCheckRequestHandler extends RequestHandler {

    public void handleRequest(WebRequest webRequest) {
        String path = webRequest.getPath();
        if (path =="/dashboard"){
            this.successorHandleRequest(webRequest);
        }   else if (path == "/home"){
            this.successorHandleRequest(webRequest);
        }   else {
            System.out.println("Status 404 : Page missing");
        }
    }
}
