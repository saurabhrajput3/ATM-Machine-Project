import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int atmN=554621475;
        int atmP=5524;
        System.out.println("Welcome to ATM Machine !!!");
        System.out.println("Enter ATM number");
        int atmNumber=sc.nextInt();
        System.out.println("Enter ATM Pin");
        int atmPin=sc.nextInt();

        AtmInterfaceImp obj=new AtmInterfaceImp();
        if(atmNumber==atmN&&atmPin==atmP){
            while(true){
                System.out.println("Choose the option give below..... ");
                System.out.println("Options: \n 1) Deposit Amount \n 2) Withdrawal Amount \n 3) Current Balance \n 4) Account Statement \n 5) Exit");
                int op=sc.nextInt();

                if(op==1){
                    System.out.println("Enter Amount");
                    double dAmount=sc.nextDouble();
                    obj.depositAmount(dAmount);
                }
                else if(op==2){
                    System.out.println("Enter Amount");
                    double wAmount=sc.nextDouble();
                    obj.withdrawalAmount(wAmount);
                }
                else if(op==3){
                        obj.viewBalance();
                }
                else if(op==4){
                        obj.viewStatement();
                }
                else if(op==5){
                    return;
                }
                else{
                    System.out.println("INVALID OPTION\n Enter AGAIN");
                }


            }
        }
        else{
            System.out.println("INVALID input \n Try Again");
        }





    }
}