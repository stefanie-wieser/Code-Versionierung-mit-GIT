package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new CalculatorIm();

        calc.addValue(CalculatorIm.calc1,20);    // currently highest number
        calc.addValue(CalculatorIm.calc1,4);   // currently lowester number
        calc.addValue(CalculatorIm.calc1,16);

        // add other integers
        calc.addValue(CalculatorIm.calc1,39);
        calc.addValue(CalculatorIm.calc1,42);
        calc.addValue(CalculatorIm.calc1,88);

        // output lowest number
            // System.out.print(getMinimum());
        // output highest number
        System.out.println(calc.getMaximum(CalculatorIm.calc1));

        // output sum of all numbers
        System.out.println(calc.sum(CalculatorIm.calc1));

    }
}
