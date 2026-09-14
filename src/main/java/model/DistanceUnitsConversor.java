package model;

public class DistanceUnitsConversor {

    public Double milesToKilometers (Double miles){
        if(miles == null){
            throw new IllegalArgumentException();
        }
        return miles*1.852;
    }

    public Double kilometersToMiles (Double kilometers){
        if(kilometers == null){
            throw new IllegalArgumentException();
        }

        return kilometers/1.852;
    }


}
