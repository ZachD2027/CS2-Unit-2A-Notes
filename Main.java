public class Main {

   public static void main(String []args) {
     
      // BOOLEAN VARIABLES can only hold true or fase
      boolean lightsOn = false;
      boolean dannyPresent = true;

      //BOOLEAN EXPRESSIONS are like questions (or comparisons)
      // where the only possible answers are true or false
      boolean exp1 = (dannyPresent == true); //is Danny here?
      boolean exp2 = (lightsOn != true); //are the lights NOT on? (off)

      // Comparing numerical values
      int x = 2;
      int y = 6;

      // Check for EQUALITY using the == operator
      System.out.println( x == y); // you can print boolean exp. directly
      // Check for NOT equal using the != operator
      boolean exp3 = ( x!= y); // store the boolean exp result in a variable
      System.out.println(exp3);

      System.out.println( x < y );
      System.out.println( x > y);
      System.out.println( x <= y);
      
      // MULTI-WAY SELECTION
      // 1. NESTING if statements is like asking "follow up questions"
      int age = 102;
      boolean havePermit = true;
      System.out.println("Let's see if you can take this road test...");
      if ( age >= 16 ) {
         System.out.println("Alright, I guess you're old enough...");
         // After passing the first condition (age >= 16)
         // you ask a FOLLOW-UP (another if statement)
         if ( havePermit == true ) {
            System.out.println("Fine, get in the car.");
         }      
      }
      else { 
         System.out.println("You're to young. Grow up.");
    }  




   }

}