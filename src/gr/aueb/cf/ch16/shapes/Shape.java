//package gr.aueb.cf.ch16.shapes;
//
//public class Shape {
//    private enum Type { RECTANGLE, CIRCLE }
//
//    //Tag field
//    private final Type type;
//
//    //Field for Rectangle
//    private double height;
//    private double width;
//
//    //Private fields for Circle
//    private double radius;
//
//    //Constructor for Rectangle
//    public Shape(double height, double width) {
//        type = Type.RECTANGLE;
//        this.height = height;
//        this.width = width;
//    }
//
//    //Constructor for Circle
//    public Shape(double radius) {
//        this = Type.CIRCLE;
//        this.radius = radius;
//    }
//
//    public double getArea() {
//        switch (type) {
//            case CIRCLE:
//                return 2 * Math.PI + radius*radius;
//        }
//    }
//}
