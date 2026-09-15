package model;
import static java.lang.Math.PI;

public class Circle {

    public double area (Float radius){
        Float powRadius = radius * radius;
        return PI*powRadius;
    }
    public Double perimeter (Float radius){
        return 2*PI*radius;
    }

}
