package atmMachine;
import java.util.*;
public class ATM_Interface {
	    public static void main(String args[]){
	       
	        Scanner sc=new Scanner(System.in);
	       
	        System.out.println("Welcome to our ATM\n");
	        long bankbalance=100000,withdrawalamt,depositamt;
	       
	        while(true){
	            System.out.println("1.Withdrawal\n");
	            System.out.println("2.Deposit\n");
	            System.out.println("3.Balance Enquiry\n");
	            System.out.println("4.Exit\n");
	           
	            int option;
	            option=sc.nextInt();
	            switch(option){
	                case 1:
	                    System.out.println("\n\nEnter Money to Withdrawal\n");
	                    withdrawalamt=sc.nextLong();
	                    if(withdrawalamt <= bankbalance){
	                        bankbalance -=withdrawalamt;
	                        System.out.println("\n\n\nPlease Collect Your Cash\n");
	                        System.out.println();
	                        System.out.println("\nYour Current Balance is : "+(double)bankbalance);
	                    }
	                    else{
	                        System.out.println("\n\nInsufficient Balance\n");
	                        System.out.println();
	                        System.out.println("\n\nYour Bank Balance "+bankbalance+"\nBut You Entered "+(double)withdrawalamt);
	                        System.out.println();
	                    }
	                break;
	               
	                case 2:
	                    System.out.println("\n\nEnter Money to Deposit\n");
	                    System.out.println();
	                    depositamt=sc.nextLong();
	                   
	                    if(depositamt >= 20000000){
	                        System.out.println("\n\nContact your bank for Huge Deposits\n");
	                    }
	                    bankbalance += depositamt;
	                   
	                break;
	               
	                case 3:
	                    System.out.println("Bank Balance:\n\t\t"+(double)bankbalance);
	                    System.out.println();
	                break;
	               
	                case 4:
	                    System.exit(0);
	                   
	            }
	           
	        }
	    }
	}


