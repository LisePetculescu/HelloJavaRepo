import java.util.Scanner; 

public class UserInput {
    public static void main(String[] args ) {
        Scanner InputName = new Scanner(System.in);
        System.out.println("Skriv dit navn:");

        String name = InputName.nextLine();
        System.out.println("Hej " + name + ", hvor gammel er du? ");


        Scanner InputAge = new Scanner(System.in);
        System.out.println("Skriv din alder (år):");


        int age = InputAge.nextInt();
        int fødselsÅr = 2024-age-1;

        System.out.println("Så må du være født i " + fødselsÅr + ", medmindre du har haft fødselsdag i år");
    }
}