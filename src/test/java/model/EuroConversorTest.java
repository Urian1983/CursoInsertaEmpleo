package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuroConversorTest {


    @Test
    void euroToPesetasTest(){

        EuroConversor euroConversor = new EuroConversor();
        Double result = euroConversor.euroToPeseta(1.0);
        assertEquals(166.387,result);
    }

    @Test
    void PesetasToEuroTest(){
        EuroConversor euroConversor = new EuroConversor();
        Double result = euroConversor.pesetaToEuro(166.387);
        assertEquals(1, result);
    }

}