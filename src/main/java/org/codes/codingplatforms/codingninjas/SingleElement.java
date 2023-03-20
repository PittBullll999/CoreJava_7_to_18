package org.codes.codingplatforms.codingninjas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SingleElement {
    public static int uniqueElement(ArrayList<Integer> arr)
    {

//          for i in range(1,n-2):
//         if((arr[i]!=arr[i+1] )and (arr[i]!=arr[i-1])):
//             return(arr[i])
//     if(arr[n-1]!=arr[n-2]):
//         return(arr[n-1])
//     return(arr[0])
        int n=arr.size();
        for(int i=1;i<n-2;i++)
        {
            if(arr.get(i)!=arr.get(i+1) && arr.get(i)!=arr.get(i+1))
            {
                return arr.get(i);
            }
        }
        if(arr.get(n-1)!=arr.get(n-2))
        {
            return arr.get(n-1);
        }
        return arr.get(0);

    }

}
