/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class driver {
    public static void main(String[] args) {
        scheduler s=new scheduler(6);
//        job[] jobs = s.inputJobs();
        int n = 3; 
        job[] jobs = new job[n];
        jobs[0] = new job(2, 1); 
        jobs[1] = new job(1, 2); 
        jobs[2] = new job(2, 3); 
//        jobs[3] = new job(1, 30); 
//        jobs[0] = new job(12, 2000000); 
//        jobs[1] = new job(1, 3000000); 
//        jobs[2] = new job(3, 4000000); 
//        jobs[3] = new job(14, 5000000); 
//        jobs[4] = new job(6, 2000000);
//        jobs[5] = new job(7, 2000000); 
//        jobs[6] = new job(2, 3000000); 
//        jobs[7] = new job(13, 4000000); 
//        jobs[8] = new job(5, 5000000); 
//        jobs[9] = new job(9, 2000000);
//        jobs[10] = new job(12, 3000000); 
//        jobs[11] = new job(1, 4000000); 
//        jobs[12] = new job(3, 2000000); 
//        jobs[13] = new job(4, 1000000); 
//        jobs[14] = new job(16, 3000000);
//        jobs[15] = new job(7, 5000000); 
//        jobs[16] = new job(2, 2000000); 
//        jobs[17] = new job(3, 9000000); 
//        jobs[18] = new job(25, 1000000); 
//        jobs[19] = new job(9, 9000000);
//        jobs[20] = new job(11, 4000000); 
//        jobs[21] = new job(1, 3000000); 
//        jobs[22] = new job(5, 4000000); 
//        jobs[23] = new job(12, 5000000); 
//        jobs[24] = new job(4, 4000000);
//        jobs[25] = new job(19, 2000000); 
//        jobs[26] = new job(13, 3000000); 
//        jobs[27] = new job(14, 4000000); 
//        jobs[28] = new job(2, 5000000); 
//        jobs[29] = new job(22, 9000000);
//        jobs[30] = new job(9, 3000000); 
//        jobs[31] = new job(10, 10000000); 
//        jobs[32] = new job(17, 2000000); 
//        jobs[33] = new job(2, 3000000); 
//        jobs[34] = new job(6, 3000000);
//        jobs[35] = new job(7, 5000000); 
//        jobs[36] = new job(3, 2000000); 
//        jobs[37] = new job(3, 9000000); 
//        jobs[38] = new job(4, 7000000); 
//        jobs[39] = new job(2, 9000000);
//        jobs[40] = new job(2, 3000000); 
//        jobs[41] = new job(1, 3000000); 
//        jobs[42] = new job(3, 4000000); 
//        jobs[43] = new job(4, 5000000); 
//        jobs[44] = new job(6, 1000000);
//        jobs[45] = new job(7, 9000000); 
//        jobs[46] = new job(18, 5000000); 
//        jobs[47] = new job(3, 3000000); 
//        jobs[48] = new job(15, 2000000); 
//        jobs[49] = new job(9, 6000000);
//        jobs[50] = new job(13, 9000000); 
//        jobs[51] = new job(1, 11000000); 
//        jobs[52] = new job(3, 9000000); 
//        jobs[53] = new job(4, 8000000); 
//        jobs[54] = new job(6, 7000000);
//        jobs[55] = new job(7, 3000000); 
//        jobs[56] = new job(12, 20000000); 
//        jobs[57] = new job(3, 2000000); 
//        jobs[58] = new job(5, 3000000); 
//        jobs[59] = new job(9, 4000000);
//        jobs[60] = new job(1, 5000000); 
//        jobs[61] = new job(18, 2000000); 
//        jobs[62] = new job(5, 7000000); 
//        jobs[63] = new job(2, 8000000); 
//        jobs[64] = new job(14, 4000000);
//        jobs[65] = new job(9, 6000000); 
//        jobs[66] = new job(3, 3000000); 
//        jobs[67] = new job(13, 9000000); 
//        jobs[68] = new job(2, 1000000); 
//        jobs[69] = new job(1, 9000000);
//        jobs[70] = new job(9, 11000000); 
//        jobs[71] = new job(10, 90000000); 
//        jobs[72] = new job(7, 8000000); 
//        jobs[73] = new job(2, 7000000); 
//        jobs[74] = new job(6, 4000000);
//        jobs[75] = new job(7, 3000000); 
//        jobs[76] = new job(3, 2000000); 
//        jobs[77] = new job(3, 1000000); 
//        jobs[78] = new job(4, 3000000); 
//        jobs[79] = new job(20, 4000000);
//        jobs[80] = new job(9, 3000000); 
//        jobs[81] = new job(10, 10000000); 
//        jobs[82] = new job(7, 2000000); 
//        jobs[83] = new job(3, 3000000); 
//        jobs[84] = new job(4, 3000000);
//        jobs[85] = new job(7, 5000000); 
//        jobs[86] = new job(3, 2000000); 
//        jobs[87] = new job(22, 9000000); 
//        jobs[88] = new job(9, 7000000); 
//        jobs[89] = new job(8, 9000000);
//        jobs[90] = new job(7, 3000000); 
//        jobs[91] = new job(6, 3000000); 
//        jobs[92] = new job(7, 4000000); 
//        jobs[93] = new job(10, 5000000); 
//        jobs[94] = new job(21, 1000000);
//        jobs[95] = new job(2, 9000000); 
//        jobs[96] = new job(1, 5000000); 
//        jobs[97] = new job(24, 3000000); 
//        jobs[98] = new job(2, 2000000); 
//        jobs[99] = new job(3, 6000000);
        long start = System.nanoTime();
        s.scheduling(jobs, jobs.length);
        long elapsedTime = System.nanoTime() - start;
        System.out.println("Process time : "+elapsedTime+" Nanosecond");
    }
  
}
