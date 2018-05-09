package bitcamp.java106.pms.servlet;

import javax.servlet.http.HttpServletRequest;

import bitcamp.java106.pms.server.ServerRequest;

public class ServerRequestAdapter extends ServerRequest {
    HttpServletRequest request;
    
    
    public ServerRequestAdapter(HttpServletRequest request) {
        super("");
        this.request = request;
        
    }
    
    @Override
    public String getParameter(String name) {
        // TODO Auto-generated method stub
        return request.getParameter(name);
    }
    
    @Override
    public String getServerPath() {
        return request.getServerPath();
    }

}
