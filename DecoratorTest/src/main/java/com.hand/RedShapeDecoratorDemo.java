//使用RedShapeDecorator来装饰shape对象
public class RedShapeDecoratorDemo {
    public static void main(String[] args){
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle=new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with noemal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\n Rectangle of red border");
        redRectangle.draw();
    }
}
