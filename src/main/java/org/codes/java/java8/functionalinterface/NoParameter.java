package org.codes.java.java8.functionalinterface;



@FunctionalInterface
interface Pattern{
    public void print();


}
public class NoParameter {
    public static void main(String[] args) {
        //no parameter is using in this area
        Pattern fibonacci=()->{//this will print fibonnacci serriese up to 10
            int fir=0;
            int sec=1;
            System.out.println(fir);
            System.out.println(sec);
            for(int i=2;i<10;i++)
            {
                int tem=sec;
                sec=sec+fir;
                fir=tem;
                System.out.println(sec);
            }
        };
        Pattern factorial=()->{
            int i=1;
            int p=1;
            System.out.println(i);
            for(int k=0;k<10;k++)
            {
                p+=1;
                i=i*(p);

                System.out.println(i);
            }

        };
        Pattern evenNumbers=()->{
            for(int i=0;i<100;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i);
                }
            }
        };
        Pattern laZyCarterSequence=()->{

            for(int i=1;i<11;i++)
            {
                System.out.println(
                        ((i*i)+i+2)/2
                );
            }

        };
        Pattern magicSqureSeries=()->{
            for(int i=1;i<11;i++)
            {
                System.out.println(
                        (i*((i*i)+1))/2
                );
            }
        };
        magicSqureSeries.print();
        laZyCarterSequence.print();

    }


}
