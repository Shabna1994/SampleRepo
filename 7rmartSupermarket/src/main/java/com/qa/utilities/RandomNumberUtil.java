package com.qa.utilities;

import java.util.Random;

import com.obsqura.main.base.Base;

public class RandomNumberUtil extends Base {

	
	
public static  int randomNum()
{
	Random r=new Random();
	int low=100,high=1000;
	int result=r.nextInt(high-low)+low;
	return result;
	
}
}
