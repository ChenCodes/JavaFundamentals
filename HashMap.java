import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class Details {

   public static void main(String args[]) {

      /*Our hashmap will contain an integer mapped to a string*/
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

      /*Adding elements to HashMap*/
      hmap.put(12, "Chaitanya");
      hmap.put(2, "Rahul");
      hmap.put(7, "Singh");
      hmap.put(49, "Ajeet");
      hmap.put(3, "Anuj");

      /* Display content using Iterator*/
      Set set = hmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }

      /* Get values based on key*/
      String var= hmap.get(2);
      System.out.println("Value at index 2 is: "+var);

      /* Remove values based on key*/
      hmap.remove(3);
      System.out.println("Map key and values after removal:");
      Set set2 = hmap.entrySet();
      Iterator iterator2 = set2.iterator();
      while(iterator2.hasNext()) {
          Map.Entry mentry2 = (Map.Entry)iterator2.next();
          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
          System.out.println(mentry2.getValue());
       }

   }
}

If we wanted to use a for loop to loop through the key and value pairs in the hashmap, here's how to do it.


//FOR LOOP
HashMap<Integer, String> hmap = new HashMap<Integer, String>();
hmap.put(11, "AB");
hmap.put(2, "CD");
hmap.put(3, "EF");
hmap.put(9, "GH");
hmap.put(3, "IJ");

for (Map.Entry me: hmap.entrySet()) {
  System.out.println("Key: + me.getKey() + " & Value " + meg.getValue());
}

//WHILE LOOP
Iterator iterator = hmap.entrySet().iterator();
while(iterator.hasNext()) {
  Map.Entry me2 = (Map.Entry) iterator.next();
  System.out.println("Key: " + me2.getKey() + " & Value " + m2.getValue());
}



NOTE: HashMap is a non-synchronized collection class. This means that we cannot perform thread-safe operations normally on it. 
Map map = Collections.synchronizedMap(new HashMap());

Set set = map.keySet();

synchronized (map) {
  Iterator iterator = set.iterator();
  while(iterator.hasNext()) {
    Map.Entry me = (Map.Entry) iterator.next();
    System.out.println(me.getKey() + ": ");
    System.out.println(me.getValue());
  }
}









