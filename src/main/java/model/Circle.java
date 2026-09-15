package model;
import static java.lang.Math.PI;

public class Circle {

    public double area (int radius ){
        int powRadius = radius * radius;
        return PI*powRadius;
    }

    public double perimeter (int radius){
        return 2*PI*radius;
    }

}
