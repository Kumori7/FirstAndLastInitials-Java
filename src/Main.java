public class Main {
    public static void main(String[] args) {

        String firstName = "Bob";

        String lastName = "Benson";

        System.out.println("first name : "+firstName);

        System.out.println("last name : "+lastName);

        // convert string to charArray
        char[] firstNameChar = firstName.toCharArray();

        // convert string to charArray
        char[] lastNameChar = lastName.toCharArray();

        System.out.println("initials : "+firstNameChar[0] + "." + lastNameChar[0]);


        /*for (int i = 0; i <firstNameChar.length; i++) {
            System.out.print(firstNameChar[i] + " ");
        }*/


      /*  for (int i = 0; i< lastNameChar.length; i++) {
            System.out.print(lastNameChar[i] + " ");
        }*/


    } // end of Main Method

} // end of Class Main

// file created Monday 2nd August 2021 around 9.40pm
// program finished Monday 2nd August 2021 around 9.53pm

// https://www.javatpoint.com/java-string-to-char