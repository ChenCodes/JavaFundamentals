//Java Enums:

class FreshJuice {
  enum FreshJuiceSize { SMALL, MEDIUM, LARGE }
  FreshJuiceSize size;
}

public class FreshJuiceTest {
  public static void main(String args[]) {
    FreshJuice juice = new FreshJuice();
    juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
      System.out.println("Size: " + juice.size);
   }
}

//What's going on in here is that we first instantiate an instance of the FreshJuice object. Then, we set the attribute "size" to the enum Medium. 
//The reason we have Enums is so that we reduce the number of bugs that can be present in our code. If someone were to use the Fresh Juice machine, they would be limited to one of the three sizes. 
