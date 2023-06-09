package org.codes.codingplatforms.leet.june;

import java.util.Map;

public class CoorporateFIlghtBooking {
    public static void main(String[] args) {
        /*[[1,2,10],[2,3,20],[2,5,25]], n = 5*/
        int t[][]=new int[][]{{1,2,10},{2,3,20},{2,5,25}};
        CoorporateFIlghtBooking c=new CoorporateFIlghtBooking();
        c.corpFlightBookings(t,5);
    }
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int t[]=new int[n];

        for(int i=0;i<bookings.length;i++)
        {
            for(int j=bookings[i][0];j<=bookings[i][1];j++)
            {
                t[j-1]+=bookings[i][2];
            }
        }return t;
    }
}
