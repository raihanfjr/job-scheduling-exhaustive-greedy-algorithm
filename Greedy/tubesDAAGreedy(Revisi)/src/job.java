/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class job implements Comparable{
    private static int jml; 
    private int id; 
    private int deadline; 
    private int profit;

    public job(int deadline, int profit) {
        jml++;
        this.id = jml;
        this.deadline = deadline;
        this.profit = profit;
    }
    public int getId() {
        return id;
    }
    public int getDeadline() {
        return deadline;
    }
    public int getProfit() {
        return profit;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
    public void setProfit(int profit) {
        this.profit = profit;
    }
    public int compareTo(Object t) {
        int compareddl=((job)t).getDeadline();
        /* For Ascending order*/
        return this.deadline-compareddl;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }
}
