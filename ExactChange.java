import java.util.Scanner; 

public class ExactChange {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      
      int input = scnr.nextInt();
      
      if (input > 0){
      int[] values = {100, 25, 10, 5, 1};
      String[] change = {"Dollar", "Quarter", "Dime", "Nickel", "Penny"};
      
      for (int i = 0; i < values.length; i++) {
         int count = input / values[i];
         input %= values[i];
         
         if (count > 0) {
            System.out.println(count + " " + (count == 1 ? change[i] : change[i] + "s"));
         }
      } 
   } else {
      System.out.println("No change");
   }
      scnr.close();
   }
}
