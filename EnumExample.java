import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Collections;
 
public class EnumExample {
 
   public static void main(String[] args) {
      //create an ArrayList object
      ArrayList<String> arrayList = new ArrayList<String>();
 
      //Add elements to ArrayList
      arrayList.add("C");
      arrayList.add("C++");
      arrayList.add("Java");
      arrayList.add("DotNet");
      arrayList.add("Perl");
 
      // Get the Enumeration object
      Enumeration<String> e = Collections.enumeration(arrayList);
 
      // Enumerate through the ArrayList elements
      System.out.println("ArrayList elements: ");
      while(e.hasMoreElements())
      System.out.println(e.nextElement());
   }
}

/*The trick here is that first we have to pass in our arraylist into a Collection class's function called enumeration. The type will be of enumeration. To continue iterating through the arraylist, we call hasMoreElements() on our object. To get the nextElement() to iterate to the next element.
*/



