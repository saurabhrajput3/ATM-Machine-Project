import java.util.*;
import java.lang.*;
public class AtmInterfaceImp implements AtmInterface {
    ATM atm=new ATM();
    Queue<Object> q=new LinkedList<>();

   @Override
   public void viewBalance(){

        System.out.println("\nAvailable balance is "+atm.getBalance()+" \n");
    }
    @Override
    public void viewStatement(){
        System.out.println("Account Statement:");
        while(q.size()>0){
            System.out.println(q.poll());
        }

    }
    @Override
    public void withdrawalAmount(double wAmount){
        if(wAmount%500==0){
            if(atm.getBalance()>=wAmount){
                q.add(wAmount + " Amount withdrawal");
                System.out.println("Collect your Amount");
                atm.setBalance(atm.getBalance() - wAmount);
                viewBalance();
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Enter amount in multiple of 500\n TRY AGAIN");
        }
    }
    @Override
    public void depositAmount(double dAmount){
        q.add(dAmount+" Amount deposited");
        System.out.println("Amount deposited successfully");
        atm.setBalance(atm.getBalance()+dAmount);
        viewBalance();
    }

}
