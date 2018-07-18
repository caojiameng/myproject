package com.hand;

import javafx.scene.paint.Stop;

//使用context来查看当状态State改变时的行为变化
public class StatePatternDemo {
    public static void main(String[] args){
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
