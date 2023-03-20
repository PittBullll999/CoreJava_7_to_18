package org.codes.codingplatforms.leet.january2023;

public class GasStations {

    public static void main(String[] args) {
        int t[]=new int[]{2,3,4};
        int cost[]=new int[]{3,4,3};
        GasStations g=new GasStations();
        System.out.println(g.canCompleteCircuit(t,cost));
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i=0;i<gas.length;i++)
        {
            if(check(i,gas,cost))
            {
                return i;
            }
        }
        return -1;

    }
    private boolean check(int i,int[] gas,int[] cost)
    {

        if(gas[i]-cost[i]<0)
        {
            return false;
        }
        int len=gas.length;
        int tankbal=gas[i];
        int pos=i;
        while (tankbal>=0)
        {
            if(tankbal-cost[pos%len]<0)
            {
                return false;
            }
            tankbal=tankbal-cost[pos%len]+gas[(pos+1)%len];
            pos=(pos+1)%len;
            if(pos==i)
            {
                return true;
            }
        }
        return false;
    }

}
