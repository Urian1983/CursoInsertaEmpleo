package model;
import static java.lang.Math.PI;

public class Circle {

    public Double area (Float radius ){
        if(radius == null){
            throw new IllegalArgumentException();
        }
        float powRadius = radius * radius;
        return PI*powRadius;

    }

    public Double perimeter (Float radius){
        if(radius == null){
            throw new IllegalArgumentException();
        }

        return 2*PI*radius;
    }

}
