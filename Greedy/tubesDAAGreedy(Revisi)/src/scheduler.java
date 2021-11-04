/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.*;
public class scheduler{
    private int profit;
    private int jammul;
    public scheduler(int jammul){
        this.jammul=jammul;
    }
    public void scheduling(job[] arr, int n){
        System.out.println("GREEDY ALGORITHM");
        System.out.println("|==========================================================|");
        System.out.println("|Id\t   Profit\tDeadline\tHarus selesai pukul|");
        System.out.println("|==========================================================|");
        for(int y=0;y<n;y++){
            if(arr[y]!=null){
                System.out.println("|"+arr[y].getId()+"\t    "+arr[y].getProfit()+"\t\t   "+arr[y].getDeadline()+"\t\t\t"+(jammul+arr[y].getDeadline())+"\t   |");
            }
        }
        System.out.println("|==========================================================|");
        
        List<job> jobs = new ArrayList<>();
        comparator compare = new comparator();
        Arrays.sort(arr, compare);
        System.out.println("|==========================================================|");
        System.out.println("|Id\t   Profit\tDeadline\tHarus selesai pukul|");
        System.out.println("|==========================================================|");
        for(int y=0;y<n;y++){
            if(arr[y]!=null){
                System.out.println("|"+arr[y].getId()+"\t    "+arr[y].getProfit()+"\t\t   "+arr[y].getDeadline()+"\t\t\t"+(jammul+arr[y].getDeadline())+"\t   |");
            }
        }
        System.out.println("|==========================================================|");
        
        TreeSet<Integer> ts = new TreeSet<>(); 
        for (int i=0;i<n;i++)
            ts.add(i);
        System.out.print("Solusi: {");
        
        int i=0;
        Integer x = ts.floor(arr[i].getDeadline()-1);
        if (x != null) {
            profit = profit + arr[i].getProfit();
            System.out.print(arr[i].getId());
            jobs.add(arr[i]);
            ts.remove(x);
        }
        i++;
        while(i<n){
            x = ts.floor(arr[i].getDeadline() - 1);
            if (x != null) {
                System.out.print(", ");
                profit = profit + arr[i].getProfit();
                System.out.print(arr[i].getId());
                jobs.add(arr[i]);
                ts.remove(x);
            }
            i++;
        }
        Collections.sort(jobs);
        System.out.println("}");
        System.out.println("Profit: "+profit);
        System.out.println("|==========================================================|");
        System.out.println("|Id\t   Profit\tDeadline\tHarus selesai pukul|");
        System.out.println("|==========================================================|");
        jobs.forEach(job -> {
            System.out.println("|"+job.getId()+"\t    "+job.getProfit()+"\t\t   "+job.getDeadline()+"\t\t\t"+(jammul+job.getDeadline())+"\t   |");
        });
        System.out.println("|==========================================================|");
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
