package com.hand;

public class FrontController {
    private Dispathcher dispathcher;
    public FrontController(){
        dispathcher = new Dispathcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully");
        return true;
    }
    private void trackRequest(String request){
        System.out.println("Page request:" + request);
    }
    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if (isAuthenticUser()){
            dispathcher.dispatch(request);
        }
    }

    public Dispathcher getDispathcher() {
        return dispathcher;
    }

    public void setDispathcher(Dispathcher dispathcher) {
        this.dispathcher = dispathcher;
    }
}
