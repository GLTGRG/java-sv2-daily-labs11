package day02;

import java.util.List;

public class Hiking {

    public int getPlusElevation(List<Integer> elevation){
        int fullElevation = 0;
        for (int i = 1; i < elevation.size(); i++){
            int difference = elevation.get(i)-elevation.get(i-1);
            if (difference>0){
                fullElevation+=difference;
            }
        }
        return fullElevation;
    }
}
