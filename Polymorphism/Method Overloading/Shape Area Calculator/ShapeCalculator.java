package shapeCalculator;

class ShapeCalculator {

    int area(int side){
        return side*4;
    }

    int area(int length, int breadth){
        return length*breadth;
    }

    double area(double radius){
        return 3.14*radius*radius;
    }

    double area(double base, double height, boolean isTriangle){
        if(isTriangle){
        return 0.5*base*height;
        } else {
            System.out.println("Not a triangle! Returning 0");
            return 0;
        }
    }

}