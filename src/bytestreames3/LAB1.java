
package bytestreames3;

public class LAB1 {

    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redCicle = new RedShapeDecorator(circle);
        redCicle.draw();
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();
    }
    
}
