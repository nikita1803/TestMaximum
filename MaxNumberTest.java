package com.genericmaxnumber;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest 
{
	FindMaxNumber maxNumber = new FindMaxNumber();
	
	@Test
	public void returnMaximumValueInteger() {
        Integer[] intArray = {3,8,4};
        maxNumber = new FindMaxNumber();
        Integer maxInteger = maxNumber.findMaxNumber(intArray);
        maxNumber.printMaxNumber(maxInteger);
        Assert.assertEquals(Integer.valueOf(8), maxInteger);
    }
	@Test
    public void returnMaximumValueFloat() {
        Float[] floatNum = {1.1f , 1.2f , 1.5f};
        maxNumber = new FindMaxNumber();
        Float maxFloat = maxNumber.findMaxNumber(floatNum);
        maxNumber.printMaxNumber(maxFloat);
        Assert.assertEquals(Float.valueOf(1.2f), maxFloat);
    }

}
