package collectionfra;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
	ArrayList obj=new Arraylist();    //non generic arraylist accept all type of data
	obj.add(39);
	obj.add("ammu");
	obj.add(10.05);
	
	System.out.println(obj);
	
	ArrayList<String> obj1=new ArrayList();    // generic arraylist only same data type is allowed
	obj1.add("shabna");
	obj1.add("Asif");
	//obj1.add(10)
	System.out.println(obj1);
	
	
	List<Integer> obj2=new ArrayList();      //list is a interface
	obj2.add(21);//add() is used for adding data
	obj2.add(32);
	obj2.add(42);
	System.out.println(obj2);
	
	obj2.remove(2);     //method to remove one element by index position (method for both arraylist and list)
	System.out.println(obj2);
	
	
	List<Integer> obj3=new ArrayList();      //list is a interface
	obj3.addAll(obj2);  //method to add all elements in another list obj2
	System.out.println(obj3);
	
	
	obj2.removeAll(obj2);  //remove all value in list
	System.out.println(obj2);
	
	int x=obj3.size();   //find size of objects
	System.out.println("length= "+x);
	
	System.out.println("value= "+obj1.get(0));//get() is used to find one object in list
	
	
	boolean b=obj3.contains(10); //contains() used for check the element is exist in collection or not,
	                              // it is boolean value 
	                              //(if exist true ,if not false)
	System.out.println(b);
	
	obj3.add(10);
	System.out.println(obj3);
	
	
	
	
	
	
	}

}
