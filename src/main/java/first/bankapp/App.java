package first.bankapp;

import java.util.Scanner;
import static java.lang.System.*;
import first.bankapp.model.bankModel;
import first.bankapp.controller.bankController;

public class App 
{
    public static void main( String[] args )
    {
       bankController bc=new bankController();
       bankModel bm=new bankModel();
       Scanner scan=new Scanner(System.in);
       out.println("--------welcome to bank---------");
       out.println("Enter account Holder name:- ");
       String accHolderName=scan.next();
       bm.setAccHolderName(accHolderName);
       try
       {
    	   
    	   if(bc.checkUsername(bm)){
    		   {
    			   out.println("Enter Password for your Account");
    			   String accPassword=scan.next();
    			   bm.setAccPassword(accPassword);
    			   try {
    				   
    				   if(bc.checkPassword(bm))
    				   {
    					   out.println("Enter account number");
    					   int accNumber =scan.nextInt();
    					   bm.setAccNumber(accNumber);
    					   out.println("Enter minimum balance");
    					   int accBalance=scan.nextInt();
    					   bm.setAccBalance(accBalance);
    					   out.println("------your details------");
    					   out.println(bm.toString());
    					   
    					   int op=0;
    					   while(op<3)
    					   {
    						  out.println("Select Operation \n Press 1 for Deposit \n Press 2 for withdraw \n Press 3 for Exit");
    					      op=scan.nextInt();
    					      switch(op) {
    					      
    					      case 1 ->
    					      { 
    					    	  out.println("Enter password to deposit");
    					    	  String pwd=scan.next();
    					    	  try 
    					    	  {
    					    		  if(bc.toDeposit(bm,pwd))
    					    		  {
    					    	       out.println("Enter amount to deposit");
    					    	       int newAmt=scan.nextInt();
    					    	       bm.depositAmount(newAmt);
    					    	       out.println("your account balance is "+bm.getAccBalance());
    					    		  }
    					    	  }
    					    	  catch(Exception e)
    					    	  {
    					    		  out.println(e.getMessage());
    					    	  }
    					    	  
    					        }
    					      
    					      case 2 ->    					      
    					      {
    					    	  out.println("Enter password to withdraw");
    					    	  String pwd=scan.next();
    					    	  out.println("Enter amount for withdraw");
    					    	  int newAmt=scan.nextInt();
    					    	  try {
    					    		if(bc.toWithdraw(bm, pwd, newAmt)) {
    					    			bm.withdrawAmount(newAmt);
    					    			out.println("withdraw successfull \n your account balance is:- "+bm.getAccBalance());
    					    		}    					    	  
    					    	  }
    					    	  catch(Exception e) {
    					    		  out.println(e.getMessage());
    					    	  }
    					    	  }
    					        default->System.exit(0);
    					        }
    					        }
    				               }
    					      }
    					   catch(Execption e) { out.println(e.getMessage()); }
    					   }
    				   }
                  }
                catch(Exception e) 
               {
            	   out.println(e.getMessage());
         	      System.exit(0);
              }
    	     scan.close();
 }
 }
       
    
