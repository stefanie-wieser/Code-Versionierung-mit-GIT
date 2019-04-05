package at.fhj.iit;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class CalculatorIm implements Calculator{

        static List<Integer> calc1 = new ArrayList<Integer>();

    public int getMaximum(List calc1){
        List<Integer> sortedList = new ArrayList(calc1);
        Collections.sort(sortedList);

        return sortedList.get(sortedList.size()-1);
    }
    public int getMinimum(List calc1) {
        List<Integer> sortedList = new ArrayList(calc1);
        Collections.sort(sortedList);

        return sortedList.get(sortedList.size() );

    }

    public void addValue(List calc1, int a){
        calc1.add(a);
    }

    public int sum(List calc1){
        int sum = 0;
        List<Integer> sortedList = new ArrayList(calc1);
        Collections.sort(sortedList);

        for (int i=0;i<calc1.size();i++) {
            sum+=sortedList.get(i);
        }
        return sum;
    }
}
