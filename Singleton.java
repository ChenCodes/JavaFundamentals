public class Singleton {

   private static Singleton singleton = new Singleton( );
   
   /* A private Constructor prevents any other 
    * class from instantiating.
    */
   private Singleton(){ }
   
   /* Static 'instance' method */
   public static Singleton getInstance( ) {
      return singleton;
   }
   /* Other methods protected by singleton-ness */
   protected static void demoMethod( ) {
      System.out.println("demoMethod for singleton"); 
   }
}

//Calling on this method in a different class, we will see the that print statement gets printed. 
/* public class SingletonDemo {
   public static void main(String[] args) {
      Singleton tmp = Singleton.getInstance( );
      tmp.demoMethod( );
   }
}
*/

//The reason for using a singleton class is when we want to have access to one instance of a class and one instance only. Singletons often control access to resources such as database connections or sockets.

