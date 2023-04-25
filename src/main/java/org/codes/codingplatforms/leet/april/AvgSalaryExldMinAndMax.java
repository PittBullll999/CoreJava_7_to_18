package org.codes.codingplatforms.leet.april;

public class AvgSalaryExldMinAndMax {
    public static void main(String[] args) {
        int t[]=new int[]{48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        AvgSalaryExldMinAndMax a=new AvgSalaryExldMinAndMax();
        a.average(t);
    }
    public double average(int[] salary) {
        double min=Integer.MAX_VALUE;
        double max=Integer.MIN_VALUE;
        double sum=0;
        double count=0;
        for(int i:salary)
        {
            if(i<min)
            {
                min=i;
            }
            if(i>max)
            {
                max=i;

            }
            sum+=i;
            count+=1;
        }
        return (sum-max-min)/(count-2);
    }
}
