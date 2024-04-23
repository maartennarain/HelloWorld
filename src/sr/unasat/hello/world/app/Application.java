package sr.unasat.hello.world.app;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //declaring a variable of aanmaken van een variable
        boolean isValidAnswer;

        System.out.println("is 10 + 0 = 11?");

        //initaliseren van een variable is de eerste keer dat we een waarde toekennen aan een variable
        isValidAnswer = false; //initializing a variable of initialiseren van een variable

        System.out.println("Het antwoord is niet valide. de variable isValidAnswer is: " + isValidAnswer);


        System.out.println("is 10 + 0 = 10?");
        isValidAnswer = true; //assigning a value to a variable of toekennen van een waarde aan een variable
        System.out.println("Het antwoord is valide. de variable isValidAnswer is: " + isValidAnswer);

//Zelfde vraagstuk maar dan met variabelen
        int nummer1 = 10;
        int nummer2 = 0;
        System.out.println();
        System.out.println("zelfde vraagstuk maar dan met variabelen");
        System.out.println("is 10 + 0 = 11?");
        isValidAnswer = ((nummer1 + nummer2) == 11);
        System.out.println("het antwoord is " + isValidAnswer);

         nummer1 = 10;
         nummer2 = 0;
        System.out.println();
        System.out.println("zelfde vraagstuk maar dan met variabelen");
        System.out.println("is 10 + 0 = 10?");
        isValidAnswer = ((nummer1 + nummer2) == 10);
        System.out.println("het antwoord is " + isValidAnswer);
    }

}
