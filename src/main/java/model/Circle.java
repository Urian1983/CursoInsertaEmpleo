package model;

public class Circle {

    private static final Double PI = 3.14159;

    public Double area (Float radius ){
        if(radius == null){
            throw new IllegalArgumentException();
        }
        Float powRadius = radius * radius;
        return PI*powRadius;

    }

    public Double perimeter (Float radius){
        if(radius == null){
            throw new IllegalArgumentException();
        }

        return 2*PI*radius;
    }

}
