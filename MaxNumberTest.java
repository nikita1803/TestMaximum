package com.genericmaxnumber;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest 
{
	FindMaxNumber maxNumber = new FindMaxNumber();
	
	@Test
	public void returnMaximumValue() {
        Integer[] intArray = {3,8,4};
        maxNumber = new FindMaxNumber();
        Integer maxInteger = maxNumber.findMaxNumber(intArray);
        maxNumber.printMaxNumber(maxInteger);
        Assert.assertEquals(Integer.valueOf(8), maxInteger);
    }

}
