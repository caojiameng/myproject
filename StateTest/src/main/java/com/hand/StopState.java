package com.hand;

public class StopState implements State{

    public void doAction(Context context) {
        System.out.println("Player is in stop State");
        context.setState(this);
    }
    public String toString(){
        return "Stop State";
    }
}
