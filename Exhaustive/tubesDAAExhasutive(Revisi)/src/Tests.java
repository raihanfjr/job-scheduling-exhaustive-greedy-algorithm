
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
public class Tests {
    public ArrayList<ArrayList<job>> subsets(job[] jobs) {
        if (jobs == null){
            return null;
        }
        ArrayList<ArrayList<job>> result = new ArrayList<ArrayList<job>>();
        for (int i = 0; i < jobs.length; i++) {
            ArrayList<ArrayList<job>> temp = new ArrayList<ArrayList<job>>();
            //get sets that are already in result
            for (ArrayList<job> a : result) {
                temp.add(new ArrayList<job>(a));
            }
            //add S[i] to existing sets
            for (ArrayList<job> a : temp) {
                a.add(jobs[i]);
            }
            //add S[i] only as a set
            ArrayList<job> single = new ArrayList<job>();
            single.add(jobs[i]);
            temp.add(single);
            result.addAll(temp);
        }
        //add empty set
        result.add(new ArrayList<job>());
        return result;
    }
    public job[] inputJobs(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Jumlah data yang ingin dimasukkan : ");
        int jml = scn.nextInt();
        job[] jobs = new job[jml];
        int i = 0;
        while(i < jml){
            System.out.println("Job "+(i+1)+" : ");
            System.out.print("Deadline : ");
            int ddl = scn.nextInt();
            System.out.print("Profit : ");
            int profit = scn.nextInt();
            job j = new job(ddl, profit);
            jobs[i] = j;
            i++;
        }
        return jobs;
    }
}
