package first.bankapp.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import import first.bankapp.model.bankModel;

public class bankController {
	
	public boolean checkUsername(bankModel bm) throws IOException {
		String username=bm.getAccHolderName();
		
		if(Pattern.matches("[a-zA-Z]{5,13}",username))
		{
			return true;
		}
		else {
			throw new IOException("username can only alphabets and digits")
		}
	}

}

public boolean checkPasssword(bankModel bm) throws IOExceptoion{
	String password=bm.getAccPassword();
	
	if(Pattern.matches("[a-zA-Z0-9@#]{6,}",password))
	{
		return true;
	}
	else {
		throw new IOException("password can have more than 6 chars ");
	}	
}

public boolean toDeposit(bankModel bm,String pwd,int withdrawAmt) throws IOException{
    
	     String password=bm.getAccPassword();
	     int accbal =bm.getAccBalance();
	     if(pwd.equals(password)) {
	    	 return true;
	     }
	     else {
	    	 throw new IOException("wrong password");
	     }      
}

public boolean toWithdraw(bankModel bm,String pwd,int withdrawAmt) IOException{
	
	String password=bm.getAccPassword():
		int accbal=bm.getAccBalance();
	if(pwd.equals(password)) {
		if(accbal>withdrawAmt) {
			return true;
		}
		else
		{
			throw new IOException("Not Enough Balance");
		}
	}
	else {
		throw new IOException("wrong password");
	}
  
   }
}
