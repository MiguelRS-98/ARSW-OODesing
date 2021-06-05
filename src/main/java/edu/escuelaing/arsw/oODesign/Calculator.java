package edu.escuelaing.arsw.oODesign;

import static edu.escuelaing.arsw.oODesign.OoDesing.linkedList;
import static java.lang.Float.parseFloat;

/**
 * This class calculates the average and deviation of LinkedList
 * @author Miguel Ángel Rodríguez Siachoque
 */
public class Calculator 
{
    private static double average, deviation;
    
    /**
     * This method constructor of Calculator.
     */
    public void Calculator ()
    {
        this.average = 0;
        this.deviation = 0;
    }
    
    /**
     * This method averages the data.
     * @return Average value.
     */
    public static double getAverage () {
        double sumAvg = 0;
        for (int i=0; i<linkedList.size(); i++) {
            double xiAvg = parseFloat((linkedList.getNode(i)).toString());
            xiAvg = Math.round(xiAvg*100.0)/100.0;
            sumAvg += xiAvg;
        }
        average = sumAvg/linkedList.size();
        average = Math.round(average*100.0)/100.0;
        return average;
    }
    
    /**
     * This method deviations the data.
     * @return Deviation value.
     */
    public static double getDeviation () {
        double sumSqrt = 0;
        for (int i=0; i<linkedList.size(); i++){
            double xi = parseFloat((linkedList.getNode(i)).toString());
            double xTotal = xi - average;
            double x2 = xTotal * xTotal;
            sumSqrt += x2;
        }
        deviation = Math.sqrt((sumSqrt/(linkedList.size()-1)));
        deviation = Math.round(deviation*100.0)/100.0;
        
        return deviation;
    }
}
