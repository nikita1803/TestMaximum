package com.genericmaxnumber;

public class FindMaxNumber 
{
	/**
	 * findMaxNumber is a function to check the maximum value in float
	 * @param floatNum
	 * @return float value
	 */
	public Float findMaxNumber(Float[] floatNum) 
	{
		for (int i = 0; i < (floatNum.length - 1); i++) 
		{
            for (int j = 0; j < (floatNum.length - 1); j++) 
            {
                if (floatNum[j].compareTo(floatNum[j + 1]) < 0) 
                {
                    Float temp = floatNum[j];
                    floatNum[j] = floatNum[j + 1];
                    floatNum[j + 1] = temp;
                }
            }
        }

        return floatNum[0];
	}
		public void printMaxNumber(float max) 
		{
		
			System.out.println("Maximum Value is:" + max);
		}
	/**
	 * findMaxNumber is a function to check the maximum value in integer.
	 * @param intArray
	 * @return integer value
	 */
		
	public Integer findMaxNumber(Integer[] intArray) 
	{
		for (int i = 0; i < (intArray.length - 1); i++) 
		{
            for (int j = 0; j < (intArray.length - 1); j++) 
            {
                if (intArray[j].compareTo(intArray[j + 1]) < 0) 
                {
                    Integer temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }

        return intArray[0];
	}
	public void printMaxNumber(Integer max) 
	{
		System.out.println("Maximum Value is:" + max);
	}


}
