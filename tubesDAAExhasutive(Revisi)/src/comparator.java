
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class comparator implements Comparator{
    public int compare(Object o1, Object o2){ 
        job j1 = (job)o1; 
        job j2 = (job)o2; 
        if (j1.getDeadline() != j2.getDeadline()) 
            return j2.getDeadline() - j1.getDeadline(); 
        else
            return j2.getProfit() - j1.getProfit(); 
        } 
}
