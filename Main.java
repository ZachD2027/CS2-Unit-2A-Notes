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

   }
}
