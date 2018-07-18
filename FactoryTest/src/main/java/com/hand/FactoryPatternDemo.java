package com.hand;

//使用该工厂，通过传递类型信息来获取实体类的对象
public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
         //获取ciecle对象，并调用他的draw方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //调用CIRCLE的draw方法
        shape1.draw();

        //获取Rectangle的对象，并调用他的draw方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 =shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
