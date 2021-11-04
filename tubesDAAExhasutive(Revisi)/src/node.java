
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class node {
    ArrayList<job> jobs;
    boolean layak;
    node next;

    public node(ArrayList<job> jobs, boolean b) {
        this.jobs=jobs;
        this.layak=b;
        this.next=null;
    }
    
}
