package at.fhj.iit;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public abstract class CalculatorIm implements Calculator{



    public int getMaximum(){

        return 0;
    }
    public int getMinimum() {

        return 0;
    }

    public void addValue(List calc, int a){
        calc.add(a);
    }

}