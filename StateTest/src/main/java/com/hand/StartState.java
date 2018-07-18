package com.hand;




//创建接口的实体类
public class StartState implements State{



    public void doAction(Context context) {
           System.out.println("Player is in start state");
           context.setState(this);
    }
    public String toString(){
        return "Start State";
    }
}
