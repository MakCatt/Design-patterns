public class DottedShapeDecorator extends ShapeDecorator {
    public DottedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setDottedBorder(decoratedShape);
    }

    private void setDottedBorder(Shape decoratedShape){
        System.out.println("Border: Dotted");
    }
}
