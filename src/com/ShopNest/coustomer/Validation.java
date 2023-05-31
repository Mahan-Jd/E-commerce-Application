package com.ShopNest.coustomer;

import com.ShopNest.dbhandler.DataFetcher;

public class Validation 
{
	public static Boolean isValid(String uname,String pass)
	{
		String dbpass=DataFetcher.fetchPassword(uname);
		if(pass.length() == 0){
			return false;
			
		}else if(pass.equals(dbpass))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
