package MuniPranay_Polampalli_Task.Programs_data;

import java.util.AbstractList;
import java.util.List;

public class custom_collection_list {

	
	
	
	
	public static <T> List<T> asList(T[] array) 
	{
	    return new MyList<T>(array);
	}

	public static class MyList<T> extends AbstractList<T> {

	    private final T[] array;

	    MyList(T[] array_new)
	    {
	        array = array_new;
	    }

	    public T get(int index)
	    {
	        return array[index];
	    }
	    public T  adding( T element_value)
	    {
	    	int k=size();
	    	array[k-1]=element_value;
	    	return element_value;
	    
	    }
	    
        private static int count=0;
        
	    public T set(int index, T element_value) 
	    {
	        T Old_Value = array[index];
	        array[index] = element_value;
	        return Old_Value;
	    }
	   
	    
	    
	    
	    public T rem(int index, T element_value)
	    {
	    	for(int i=index;i<array.length-1;i++)
	    	{
	    		array[i]=array[i+1];	
	    	}
	    	count++;
	    	return element_value;
	    }
	    public  int size()
	    {
	    	int total_length=array.length-count;
	        return total_length;
	    }
	    public void display() 
	    {
	    	for(int i=0;i<size();i++) 
	    	{
	    		System.out.print(array[i]+" ");
	    	}
	    	System.out.println();
	    }
	}

	
	
	
	
	
}
