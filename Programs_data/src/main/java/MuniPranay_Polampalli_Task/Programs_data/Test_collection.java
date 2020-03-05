/**
 * 
 */
package MuniPranay_Polampalli_Task.Programs_data;

import MuniPranay_Polampalli_Task.Programs_data.custom_collection_list.MyList;

/**
 * @author polampalli
 *
 */
public class Test_collection
   {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Integer integer_values[]= {1,2,3,4,5,6,7,8,9,10,0,0};
		MyList<Integer> list_object=new MyList<Integer>(integer_values);
		
		System.out.println("Displaying the elements  in the Custom List : ");
		list_object.display();
	    System.out.println("Adding a value 39 to Custom List"+list_object.adding(39));
		System.out.println("Updating a element in the custom list at index 4 : "+list_object.set(4,49));
		System.out.println("Getting a element in custom list at index 5: "+list_object.get(5));
		System.out.println("Removing a element in custom list: "+list_object.rem(4,5));
		System.out.println("Size of the custom list is: "+list_object.size());
		System.out.println("Displaying the elements  in the Custom List after Operations :");
		list_object.display();
	}
	}
