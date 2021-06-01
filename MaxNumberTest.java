package com.genericmaxnumber;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest 
{
	FindMaxNumber maxNumber = new FindMaxNumber();
	/**
	 * this function is use to return the maximum integer value
	 */
	@Test
	public void returnMaximumValueInteger() {
        Integer[] intArray = {3,8,4,9,2,10};
        maxNumber = new FindMaxNumber();
        Integer maxInteger = maxNumber.findMaxNumber(intArray);
        maxNumber.printMaxNumber(maxInteger);
        Assert.assertEquals(Integer.valueOf(10), maxInteger);
    }
	/**
	 * this function is use to return the maximum float value
	 */
	@Test
    public void returnMaximumValueFloat() {
        Float[] floatNum = {1.1f , 1.2f , 1.5f , 1.9f , 2.2f , 2.5f};
        maxNumber = new FindMaxNumber();
        Float maxFloat = maxNumber.findMaxNumber(floatNum);
        maxNumber.printMaxNumber(maxFloat);
        Assert.assertEquals(Float.valueOf(2.5f), maxFloat);
    }
	/**
	 * this function is use to return the maximum string value
	 */
	@Test
    public void returnMaximumValueString() {
        String[] string = {" Nikita ", " Pooja ", " Astha " , " Sima " , " Gita "};
        maxNumber = new FindMaxNumber();
        String maxString = maxNumber.findMaxNumber(string);
        maxNumber.printMaxNumber(maxString);
        Assert.assertEquals(" Sima ", maxString);
    }

	


}
