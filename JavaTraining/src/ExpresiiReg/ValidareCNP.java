
/*     Using new learned methodology of agile development names Test Driven 
   Development please implement a new method to validate, based on a pattern 
   and using regular expressions in Java, the PID (CNP in Romania) based on 
   following rules:

    CNP: SYYMMDDNNNNNN

    1. It has 13 digits.

    2. First digit (S) could be 1 or 2 (for male or female). 

    3. Next 6 digits are for YYMMDD where MM is month on 2 digits, DD day on 2 digits and YY is year on 2 digits.

    4. Last 6 are Numbers between 0 and 9.
 * 
 */
package ExpresiiReg;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
/**
 *
 * @author Andrei
 */
      public class ValidareCNP {
          
    public static boolean validateDate(String text) {
 // the following object constructs a SimpleDateFormat using the given pattern
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
  //!!    It's important to type exactly the date format, year y in lower-case,
  //!!  month M in upper-case and day d in lower-case, otherwise, even if the 
  //!!  typed CNP is correct, the program outputs an invalid date for CNP !!!
  
    // by adding setLenient(false), SimpleDateFormat rejects invalid dates!
        sdf.setLenient(false);
        try {
            sdf.parse(text);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    } 

     // now we create the main method:

      public static void main(String[] args) {
        // creating a scanner object
        Scanner scannerSourceString = new Scanner(System.in);
       
            System.out.println("Type CNP here: ");
            String source = scannerSourceString.next();

            // verify if CNP contains 13 characters
            if (source.length() < 13 || source.length() > 13) {
                System.out.println("CNP length not suitable");
            } else {
                //check if CNP string contains just numbers
                boolean onlyNumbers = false;
                
                //regular expression tests if all 13 characters are digits
                Pattern digits = Pattern.compile("\\d{13}");
                Matcher matcher = digits.matcher(source);

                while (matcher.find()) {
                    onlyNumbers = true;
                }
                // if regular expression or pattern was not found in the input
                if (!onlyNumbers) {
                    System.out.println("CNP must contain only digits!");
                } else {
                    // check if the first digit is 1 or 2
       Pattern patternFirstDigit = Pattern.compile("^[1-2]");
             Matcher matcherFirstDigit = patternFirstDigit.matcher(source);
                 boolean found = false;
                   while (matcherFirstDigit.find()) {
                        found = true;
                    }
                    // if first digit is 1 or 2:
                    if (found) {
       // pattern must start with 1 or 2, then the next 6 digits follows date format
               Pattern date = Pattern.compile("^[1-2]\\d{2}\\d{2}\\d{2}");
                   Matcher matchDate = date.matcher(source);
                       String resultDate = "";
                        while (matchDate.find()) {
                            resultDate = String.format(matchDate.group());
                        }
              //validate date
       //    Because date in CNP starts from index 1 ( index 0 refers to gendre, 
     // it's the first digit), we use "substring" method, so the date validation
     //  starts with index 1
           if (validateDate(resultDate.substring(1))) {
                            System.out.println(" CNP accepted.");
                          
                   } else {
                          System.out.println("Invalid date!");
                        }
                   } else {
             System.out.println("First digit of CNP must be 1 or 2! ");
                    }
                }
            }
    }

    }
    
    

