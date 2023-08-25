package org.codes.codingplatforms.leet.august;

public class AccountBalance2806 {
    public static void main(String[] args) {
        AccountBalance2806 a=new AccountBalance2806();
        a.accountBalanceAfterPurchase(23);
    }
    public int accountBalanceAfterPurchase(int purchaseAmount) {


        return 100-(int)Math.floor(((double) purchaseAmount/10)+.5)*10;





    }
}
