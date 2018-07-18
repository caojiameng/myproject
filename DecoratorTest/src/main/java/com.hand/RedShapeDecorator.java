//创建ShaperDecorater的实体装饰类
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);

    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Boeder Collor: Red");
    }
}
