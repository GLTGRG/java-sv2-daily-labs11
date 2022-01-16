package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void testGetPlusElevation(){
        int result = new Hiking().getPlusElevation(List.of(10,21,25,12,23));

        assertEquals(26, result);
    }

    @Test
    void testGetPlusElevationIncreasing(){
        int result = new Hiking().getPlusElevation(List.of(10,21,25,12,23,1));

        assertEquals(27, result);
    }

    @Test
    void testGetPlusElevationDecreasing(){
        int result = new Hiking().getPlusElevation(List.of(10,9,8,7,6,1));

        assertEquals(0, result);
    }

}