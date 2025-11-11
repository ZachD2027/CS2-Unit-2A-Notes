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

    // 2. ELSE IF BLOCKS (chained conditionals)
    // when you are accounting for multiple possible answers
    int battery = 19;
    // Always start the block with an if statement
    if ( battery >= 95 ) {
      System.out.println("Unplug your phone!");
    }
    else if ( battery <= 50 ) {
      System.out.println("Plug in your phone soon...");
    }
    // ORDER MATTERS for else if blocks
    // as soon as a condition is met, the rest of the chain is skipped
    else if ( battery < 20 ) {
      System.out.println("LOW POWER MODE");
    }
    else {
      System.out.println("otherwise...blowup");
    }
    
    // COMPOUNT BOOLEAN EXPRESSIONS
    // to test TWO conditions in an if statement
    boolean cleanedRoom = false;
    boolean didHomework = false;

    // The AND (&&) operator joins two expressions
    // only comes out to TRUE if BOTH ARE TRUE!
    if( (cleanedRoom == true) && (didHomework == true) ) {
      System.out.println("Go have fun!");
    }

    // The Or (||) operator joins two expressions
    // comes out to TRUE if AT LEAST ONE is TRUE!
    // (less restrictive conditions than AND)
    if ( (cleanedRoom == true) || (didHomework == true) ) {
      System.out.println("The less strict prents are fine with you going out!");
    }

    // The NOT (!) operator can be used to NEGATE
    // a boolean expression
    if ( ! (didHomework == true) ) {
      System.out.println("Do your CodeCollab! The class is depending on you!");
    }
    // REMINDER: boolean VARIABLES can be used
    // instead of full EXPRESSIONS (with relational operators)
    if ( !didHomework ) {
      System.out.println("You did NOT do your HW...");
    }

    // IMPORTANT NOTE ABOUT STRINGS:
    // (and other Object data types)
    // You can't use the == operator to CHECK EQUALITY
    // instead use a String MEthod called .equals()
    String course = "AP Computer Science";
    if ( course.equals("AP Computer Science") ) {
      System.out.println("Time to learn JAVA!");
    }
    // .equals is CASE-SENSITIVE
    // itchecks every single character in order between the 2 Strings

    String message1 = "Hello World";
    String message2 = "Hello World";
    if ( message1.equals(message2) ) {
      System.out.println("The messages match perfectly!");
    }
    // You can mix String VARIABLES with String LITERALS
    // ex) both are string LITERALS below
    if ( "ho".equals("ho") ) {
      System.out.println("ho :)");
    }





   } // this closes the main METHOD
} // This closes the main CLASS