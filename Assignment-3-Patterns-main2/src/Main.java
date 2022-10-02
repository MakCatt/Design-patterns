public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape blueCircle = new BlueShapeDecorator(new Circle());

        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());

        Shape blueDottedCircle = new BlueShapeDecorator(new DottedShapeDecorator(new Circle()));

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of blue border");
        blueCircle.draw();

        System.out.println("\nRectangle of blue border");
        blueRectangle.draw();

        System.out.println("\nCircle with blue and dotted border");
        blueDottedCircle.draw();
    }}