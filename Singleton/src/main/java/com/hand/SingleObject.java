package com.hand;

public class SingleObject {
    //创建SingleObject的一个对象
    private static SingleObject instance = new SingleObject();
    //让构造函数为private，这样该类就不会被实例化
    private SingleObject(){}
    //获取唯一可用的对象
    public static SingleObject getInstance(){

//        if (instance == null){
//            instance = new SingleObject();  懒汉式，线程不安全
//        }  线程安全需要在static后加synchorized




        return instance;  //饿汉式
    }
    public void showMessage(){
        System.out.println("Hello World");
    }
}
