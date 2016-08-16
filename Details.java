import java.util.*;




public class Details {
  public static void main(String[] args) {
  
  
  
  //This is sorting done using a TreeMap, meant to sort the keys of the hashMap.
    HashMap<Integer, String> hmap = new HashMap<Integer, String>();
    hmap.put(5, "A");
    hmap.put(11, "C");
    hmap.put(4, "Z");
    hmap.put(77, "Y");
    hmap.put(9, "P");
    hmap.put(66, "Q");
    hmap.put(0, "R");
    
    Set set = hmap.entrySet();
    Iterator iterator = set.iterator();
    while(iterator.hasNext()) {
      Map.Entry me = (Map.Entry) iterator.next();
    }
    
    Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
    Set set2 = map.entrySet();
    Iterator iterator2 = set2.iterator();
    while(iterator2.hasNext()) {
      Map.Entry me2 = (Map.Entry) iterator2.next();
    }
  }



  private static HashMap sortByValues(HashMap map) {
    List list = new LinkedList(map.entrySet());
    Collections.sort(list, new Comparator() {
      public int compare(Object o1, Object o2) {
        return ((Comparable) ((Map.entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
      }
  });
  
  
        
        
        
        

      
