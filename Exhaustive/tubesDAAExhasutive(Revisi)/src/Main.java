import java.io.IOException;
import java.util.*;
  
public class Main 
{ 
    // Print all subsets of given set[]
    public linkedJList jList = new linkedJList();
    public ArrayList<ArrayList<job>> jobs = new ArrayList<ArrayList<job>>();
    public ArrayList<job> jobsTemp;
    public ArrayList<job> temp;
    public boolean layak;
    public int jammul;
    public Main(ArrayList<ArrayList<job>> jobs, int jammul){
        this.jobs=jobs;
        this.jammul=jammul;
        jList.jammul=jammul;
    }
    public void insertLinked(){
        System.out.println("EXHAUSTIVE ALGORITHM");
        int n = jobs.size()-1;
        for(int i = 0; i < n; i++){
            layak = false;
            jobsTemp = jobs.get(i);
            Collections.sort(jobsTemp);
            TreeSet<Integer> ts = new TreeSet<>(); 
            for (int j=0 ; j<jobsTemp.size() ; j++){
                ts.add(j);
            }
            int k = 0;
            temp = new ArrayList<job>();
            while(k < jobsTemp.size()){
                Integer l = ts.floor(jobsTemp.get(k).getDeadline() - 1);
                if (l != null) {
                    temp.add(jobsTemp.get(k));
                    ts.remove(l);
                }
                k++;
            }
            layak = jobsTemp.size()==temp.size();
            jList = jList.insert(jList, jobsTemp, layak);
            ts.clear();
                
        }
    }
    public void print(){
        jList.printList(jList);
    }
//        for (int i = 0; i < (1<<n); i++){
//            job[] temp = new job[n];
//            boolean tempb=true;
//            TreeSet<Integer> ts = new TreeSet<>(); 
//            for (i=0;i<n;i++){
//                ts.add(i);
//            }
//            System.out.println(ts);
//            for (int j = 0; j < n; j++){ 
//                if ((i & (1 << j)) > 0){
//                    if(jList[j]!=null){
//                        temp[j]=jList[j];
//                    System.out.println(temp[j].getId());
//                    }
//                }
//            }
//            for (int j = 0; j < n; j++){ 
//                if ((i & (1 << j)) > 0){
//                    Integer x = ts.floor(jList[j].getDeadline() - 1);
//                    if (x != null){ 
//                        ts.remove(x);
//                    }
//                    tempb=true;
//                    while(i<n&&x!=null){
//                        x = ts.floor(jList[j].getDeadline() - 1);
//                        if (x != null){ 
//                            ts.remove(x);
//                        }else{
//                            tempb=false;
//                        }
//                    i++;
//                    }
//                }
//            }
//            jobs = jobs.insert(jobs, temp, true); 
} 