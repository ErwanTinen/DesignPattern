package com.company;

public class PolicyCheckRequestHandler extends RequestHandler {

    public void handleRequest(WebRequest webRequest) {
        String path = webRequest.getPath();
        if ((path == "/dashboard") && !(webRequest.getLoggedUser().isAdmin())){
            System.out.println("Status 403 : user is not authorized to access this content");
        } else {
            this.successorHandleRequest(webRequest);
        }

    }
}
