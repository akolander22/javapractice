//java practice app
// import java.io.Console;
//
// String firstName = "Andrew";
// console.printf("Hello my name is %s", firstName);
import java.io.Console;

public class app {

    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
      // __Name__ is a __adjective__ __noun__.  They are always __adverb__ __verb__.
      String ageAsString = console.readLine("How old are you?  ");
      int age = Integer.parseInt(ageAsString);
      if (age < 13) {
        //Insert exit code
        console.printf("Sorry you must be at least 13 to use this program.\n");
        System.exit(0);
      }
      String name = console.readLine("Enter a name:  ");
      String adjective = console.readLine("Enter an adjective:  ");
      String noun = console.readLine("Enter a noun:  ");
      if (noun.equalsIgnoreCase("dork") ||
          noun.equalsIgnoreCase("jerk")) {
        console.printf("That language is not allowed.  Exiting. \n\n");
        System.exit(0);
      }
      String adverb = console.readLine("Enter an adverb ending in -ly:  ");
      String verb1 = console.readLine("Enter a verb ending in -ing:  ");
      String verb2 = console.readLine("Enter a verb: ");
      String verb3 = console.readLine("Enter another verb: ");
      String noun2 = console.readLine("Enter a plural noun: ");
      String properNoun = console.readLine("Enter a proper noun: ");
      String place = console.readLine("Enter a place: ");

      console.printf("Your Madlib:\n--------------\n");
      console.printf("%s is a %s %s, who is %s years old. ", name, adjective, noun, age);
      console.printf("Bears are always %s %s.\n", adverb, verb1);
      console.printf("Make sure to always %s.\n It would be awful if you didn't %s properly.\n", verb2,verb3);
      console.printf("I love %s. ")
    }

}
