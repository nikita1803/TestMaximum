package com.genericmaxnumber;

public class GenericClass <X , Y, Z>
{
	X[] myXArray;
	Y[] myYArray;
	Z[] myZArray;
	/**
	 * constructor of the class
	 * @param myXArray
	 * @param myYArray
	 * @param myZArray
	 */
	public GenericClass(X[] myXArray , Y[] myYArray , Z[] myZArray )
	{
		this.myXArray = myXArray;
		this.myYArray = myYArray;
		this.myZArray = myZArray;
	}
	
	public static void main(String[] args) 
	{
		Integer[] a = {2,9,7};
		Float[] b = {1.1f , 1.2f , 1.4f };
		String[] c = {"Nikita" , "Ankita" , "Shweta"};
		toPrint(a);
		toPrint(b);
		toPrint(c);
		findMaxNumber(a);
		findMaxNumber(b);
		findMaxNumber(c);
	}
	/**
	 * this function is use to print the array
	 */
	private void toPrint()
	{
		toPrint(myXArray);
		toPrint(myYArray);
		toPrint(myZArray);
	}
	/**
	 * this method is use to find out the maximum value 
	 * extended by the generic method so only one function can take any type of value 
	 * @param <E>
	 * @param a
	 */
	public final static <E extends Comparable<E>> E findMaxNumber(E[] a) 
	{
		for (E e : a) 
		{
            System.out.println(e);
        }
		for (int i = 0; i < (a.length - 1); i++) 
		{
            for (int j = 0; j < (a.length - 1); j++) 
            {
                if (a[j].compareTo(a[j + 1]) < 0) 
                {
                    E temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
		System.out.println("Maximum numebr is " +a[0]);
        return a[0];
	}
	/**
	 * this print method show the elements after performing the max function.
	 * @param <E>
	 * @param a
	 */
	
	private static <E> void toPrint(E[] a)
	{
		for (E i: a)
		{
			System.out.println(i);
		}
	}
}
