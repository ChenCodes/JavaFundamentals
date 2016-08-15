import java.util.*;

public class ArrayListExample {
  public static void main(String args[]) {
    /*Our arraylist is going to have objects of string type. */
    ArrayList<String> obj = new ArrayList<String>();
    
    /*Adding elements into the arraylist.*/
    
    obj.add("One");
    obj.add("Two");
    obj.add("Three");
    obj.add("Four");
    
    /*If we wanted to display the array elements.*/
    System.out.println("Currently the arrary list has the following elements:" + obj);
    
    
    /*Adding an element at a given index*/
    obj.add(0, "zero");
    
    /*Remove elements from an arraylist like this*/
    obj.remove("zero");
    
    /*To remove an object from a given index*/
    obj.remove(1);
    
  }
}

Something to take note of:

Can you do ArrayList<int> array = new ArrayList<int>() ?
You cannot do this because ArrayList can only reference types, not primitives. Integer is a class, not a primitive. When creating an ArrayList object, it will store the Integer type, not the int primitive. 

  This takes us to another conceptual understanding of primitive vs reference data types.
    Here are some eaxmples of primitive types(not associated with a class, **only stores values**):
      byte, short, int, long, float, double, boolean, char
        Specific example:
          double d = 3.0;
          d.intValue(); <-- this will throw a compiler error
    
    Here are some examples of reference types (instantiable class as well as arrays)
      String, Scanner, Random, Die, int[], String[], etc
      
        Double d2 = new Double(3.0);
        d2.intValue(); <-- this will work because we made an object that was associated with the double class which has a built in method called intValue.
    
    
Thus said, here's a cool arraylist problem:
ArrayList<Integer> obj = new ArrayList<Integer>();

	  /*This is how elements should be added to the array list*/
	  obj.add(1);
	  obj.add(2);
	  obj.add(3);
	  obj.remove(1);
	  
What will the arraylist be here?
  Answer is that it will be [1, 3]. The first index element was removed.
  
Now, what happens if typecast the 1 in "obj.remove(1)" into an Integer?
  The answer will be [2, 3]. This is because we forced the object being passed in to be of the form Integer rather than int which it was originally. 
  
    
Useful Java ArrayList methods:
add(Object o) -> adds object to arraylist in the last position 
add(int index, Object o) -> adds object to arraylist at the given index
remove(Object o) -> removes object at the first place that it shows up at
remove(int index) -> removes element at the specified index
set(int index, Object o) -> swaps out an existing element at a specified index and replaces it with the object that is passed in
indexOf(Object o) -> gives the index of the object o. If the element isn't found in the list then the method will return -1
get(int index) -> this returns the object of the list which is present at the specified index
size() -> gives the size of the arraylist
contains(Object o) -> checks whether the given object o is present in the arraylist.


Additional ArrayList tasks:
Sublist -> when using a sublist on an arraylist, make sure to create a new arraylist object because sublist will return a list of type list. 

  ArrayList<Integer> obj = new ArrayList<Integer>();
	obj.add(1);
	obj.add(2);
	obj.add(3);
  ArrayList<Integer> obj2 = new ArrayList<Integer>(obj.subList(0, 2));
  obj2 -> [1, 2]
  
  If you want to turn it into a list, that's fine as well.
  List<Integer> list = obj.subList(0, 2);










    
    
