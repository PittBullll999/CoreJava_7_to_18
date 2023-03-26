package org.codes.codingplatforms.leet.march;

public class Bank {
    public static void main(String[] args) {
        //["Bank","withdraw","transfer","deposit","transfer","withdraw"]
        //[[[10,100,20,50,30]],[3,10],[5,1,20],[5,20],[3,4,15],[10,50]]
        Bank b=new Bank(new long[]{10,100,20,50,30});
        b.withdraw(3,10);
    }
    long[] balance;
    int acountlength;
    public Bank(long[] balance) {
        this.balance=balance;
        this.acountlength=balance.length;

    }

    public boolean transfer(int account1, int account2, long money) {
        if(checkAccoundExist(account1)||checkAccoundExist(account2))
        {
            return false;
        }
        if(balance[account1-1]<money)
        {
            return false;
        }
        else {
            balance[account1-1]-=money;
            balance[account2-1]+=money;
            return true;
        }
    }

    public boolean deposit(int account, long money) {
        if (checkAccoundExist(account))
        {
            return false;
        }
        else {
            balance[account-1]+=money;
            return true;
        }

    }

    public boolean withdraw(int account, long money) {
        if(checkAccoundExist(account))
        {
            return false;
        }
        if(balance[account-1]<money)
        {
            return false;
        }
        else {
            balance[account-1]-=money;
            return true;
        }

    }
    private boolean checkAccoundExist(int account)
    {
        return (account<acountlength);

    }
}
