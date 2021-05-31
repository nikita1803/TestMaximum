package com.genericmaxnumber;

public class FindMaxNumber 
{
	/**
	 * Here i have to change 3 method into the 1 generic method so that it can take any type of value
	 * @param intArray
	 */
		
	public final <E extends Comparable<E>> E findMaxNumber(E...intArray) 
	{
		for (E e : intArray) 
		{
            System.out.println(e);
        }
		for (int i = 0; i < (intArray.length - 1); i++) 
		{
            for (int j = 0; j < (intArray.length - 1); j++) 
            {
                if (intArray[j].compareTo(intArray[j + 1]) < 0) 
                {
                    E temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }

        return intArray[0];
	}
	public <E> void printMaxNumber(E max) 
	{
		System.out.println("Maximum Value is:" + max);
	}

}
