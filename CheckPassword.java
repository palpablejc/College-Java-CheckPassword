
import java.util.Scanner;

/**
 * CIS 225-01 This program checks the user's password length
 * @author John Carter
 * @version 1.0 10/28/16
 */
public class CheckPassword {

    public static void main(String[] args) {
        
        //input
        String password = getPasswordFromUser();
        //processing and output
        meetCriteria(password);

    }
    /**
     * method for input
     * @return 
     */
    public static String getPasswordFromUser() {
         //prompt
        System.out.print("Enter your Password: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        return password;
    }
    
    /**
     * method for processing and output
     * @param password 
     */
    public static void meetCriteria(String password) {

        if (password.length() < 8) {
            String validPassword = "Invalid Password: Password must have least 8 characters";
            System.out.println(validPassword);
            //return validPassword;
        } else {
            String invalidPassword = "Valid Password";
            System.out.println(invalidPassword);
            // return invalidPassword;
        }
    }

}
