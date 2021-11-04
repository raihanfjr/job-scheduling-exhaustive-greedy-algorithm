
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
public class linkedJList {
    public  int jammul;
    public  node head;
    public linkedJList insert(linkedJList list, ArrayList<job> jobs, boolean b){ 
	node new_node = new node(jobs, b);
	new_node.next = null; 
	if (list.head == null) { 
            list.head = new_node; 
	}else { 
            node last = list.head; 
            while (last.next != null) { 
		last = last.next; 
            } 
            last.next = new_node; 
	} 
	return list; 
    } 

    public void printList(linkedJList list){
        node currNode = list.head;
        node solusi = null;
        int maxProfit = 0;
        System.out.println("LinkedList: "); 
        while (currNode != null) {
            System.out.println("|==========================================================|");
            System.out.println("|Id\t   Profit\tDeadline\tHarus selesai pukul|");
            System.out.println("|==========================================================|");
            int tProfit = 0;
            ArrayList<job> temp = currNode.jobs;
            for(int i=0;i<temp.size();i++){
                System.out.println("|"+temp.get(i).getId()+"\t     "+temp.get(i).getProfit()+"\t\t    "+temp.get(i).getDeadline()+"\t\t\t"+(temp.get(i).getDeadline()+jammul)+"\t   |");
                tProfit = tProfit + temp.get(i).getProfit();
            }
            System.out.println("|----------------------------------------------------------|");
            System.out.println("|Profit : "+tProfit+"\t\t\t\t\t\t   |");
            if(currNode.layak == true){
                System.out.println("|Layak : Layak\t\t\t\t\t\t   |");
                if(tProfit > maxProfit){
                    solusi = currNode;
                    maxProfit = tProfit;
                }
            }else{
                System.out.println("|Layak : Tidak Layak\t\t\t\t\t   |");
            }
            System.out.println("|==========================================================|");
            System.out.println("                            ***                             ");
            currNode = currNode.next; 
        }
        System.out.println("SOLUSI");
        System.out.println("Profit : "+maxProfit);
        System.out.println("|==========================================================|");
        System.out.println("|Id\t   Profit\tDeadline\tHarus selesai pukul|");
        System.out.println("|==========================================================|");
        if(solusi==null){
            System.out.println("Tidak ada solusi");
        }else{
            ArrayList<job> sol = solusi.jobs;
            for(int i=0;i<sol.size();i++){
                System.out.println("|"+sol.get(i).getId()+"\t     "+sol.get(i).getProfit()+"\t\t    "+sol.get(i).getDeadline()+"\t\t\t"+(sol.get(i).getDeadline()+jammul)+"\t   |");
            }
        }
        System.out.println("|==========================================================|");
    }
}
