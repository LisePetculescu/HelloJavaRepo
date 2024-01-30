import java.util.Scanner;

public class DateAge {

   int myAge;
   int dateAge;

    public void start() {
        writeWelcome();
        // ... kald resten af programmet
    }
    

    public void writeWelcome() {
        System.out.println(""" 
        Er din date for ung? 
        --------------------

        hihi
        """);
    }

    // getMinimumAge();
    // isDateOlder();
    // isDateOldEnough();
    // getInput();

    public static void main(String... args) {

       DateTooYoung app = new DateTooYoung();
       app.start();
    }
}
