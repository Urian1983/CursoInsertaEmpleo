package model;

public class DistanceUnitsConversor {

    public float milesToMeters (float miles){
        return miles*1852f;
    }

    public float metersToMiles(float meters){

        return meters/1852f;
    }


}
