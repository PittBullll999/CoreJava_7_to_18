package org.codes.java.java8.functionalinterface;

@FunctionalInterface
interface MathsPatern
{
    public void print(int n);
}
@FunctionalInterface
interface MathOperation{
    public int op(int n);
}

@FunctionalInterface
interface MessageAndCaption
{
    public void message(String s);
}
@FunctionalInterface
interface MathOPr
{
    int opr(int n,int m);
}

public class OneParameter {
    public static void main(String[] args) {
        mathsPatternMethods();
        System.out.println("\n..........................\n");
        mathsOperationMethods();
    }
    private static void mathsPatternMethods()
    {
        MathsPatern fibonacci=(n)->{
            int fir=0;
            int sec=1;
            System.out.println(fir);
            System.out.println(sec);
            for(int i=2;i<n;i++)
            {
                int tem=sec;
                sec=sec+fir;
                fir=sec;
                System.out.println(sec);
            }
        };
        MathsPatern laZyCarterSequence=(n)->{

            for(int i=1;i<n;i++)
            {
                System.out.println(
                        ((i*i)+i+2)/2
                );
            }

        };
        MathsPatern magicSqureSeries=(n)->{
            for(int i=1;i<n;i++)
            {
                System.out.println(
                        (i*((i*i)+1))/2
                );
            }
        };
        fibonacci.print(20);
        System.out.println("............");
        laZyCarterSequence.print(20);
        System.out.println("...................");
        magicSqureSeries.print(20);
    }
    private static void mathsOperationMethods()
    {
        MathOperation doubling=(n)->{
            return 2*n;
        };
        MathOperation squar=(n)->{
            return n*n;
        };
        MathOperation cube=(n)->{
            return (n*n*n);
        };
        System.out.println(doubling.op(124));
        System.out.println(squar.op(100));
        System.out.println(cube.op(25));
    }
    private static void StringMessage()
    {
        MessageAndCaption message=s -> {
            System.out.println("This is a message "+s);
        };
        message.message("Happy christmas");
    }
    private static void MathOpMethods()
    {
        MathOPr add=(a,b)->{

            return a+b;
        };
    }


}
