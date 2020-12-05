package com.company;

public class RenderContentHandler extends RequestHandler {

    public void handleRequest(WebRequest webRequest) {
        String path = webRequest.getPath();
        if (path=="/dashboard"){
            System.out.println("Status 200 : Dashboard content here");
        } else {
            System.out.println("Status 200 : Home content here");
        }
    }
}
