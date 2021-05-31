package com.genericmaxnumber;

public class FindMaxNumber 
{
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

	public void printMaxNumber(Integer max) {
	
		System.out.println("Maximum Value is:" + max);
	}
}
