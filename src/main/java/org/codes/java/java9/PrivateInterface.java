package org.codes.java.java9;

//this private interface methode is for the private methode that is used for default methode inside the interface
//this is not accessible outside the interface
interface MathMethodes{
    default int squre(int n)
    {
        System.out.println("This squring methode is using a special way");
        return squaring(n);
    }
    private int squaring(int n)
    {
        int t=n;
        for(int i=0;i<n;i++)
        {
            t+=n;
        }
        return n;
    }
}
class M implements MathMethodes{

}
public class PrivateInterface {
    public static void main(String[] args) {
        M m=new M();
        m.squre(10);
        var s="abhinv raj m";
        System.out.println(s);
        var t=1000L;
        System.out.println(t);

    }

}
