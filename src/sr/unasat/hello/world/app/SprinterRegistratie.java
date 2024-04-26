package sr.unasat.hello.world.app;

public class SprinterRegistratie {

    public static void main(String[] args) {
        Sprinter sprinter1 = new Sprinter();
        sprinter1.fullName = "John Doe";
        sprinter1.topSpeed = 40.2;
        sprinter1.weightInKg = 70.5;
        sprinter1.distanceInMeters = 100;

        Sprinter sprinter2 = new Sprinter();
        sprinter2.fullName = "Lesly Doe";
        sprinter2.topSpeed = 40.4;
        sprinter2.weightInKg = 80.5;
        sprinter2.distanceInMeters = 100;

        Sprinter sprinter3 = new Sprinter();
        sprinter3.fullName = "purrel destus";
        sprinter3.topSpeed = 41.4;
        sprinter3.weightInKg = 82.5;
        sprinter3.distanceInMeters = 100;

      /*  System.out.println("Sprinter 1: " + sprinter1.fullName);
        System.out.println("Sprinter 1: " + sprinter1);
        System.out.println("Sprinter 2: " + sprinter2.fullName);
        System.out.println("Sprinter 1: " + sprinter2);
        System.out.println("Sprinter 3: " + sprinter3.fullName);*/

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Sprinter 1: " + sprinter1);

        Sprinter sprinter4 = new Sprinter();
        System.out.println(sprinter4);
        sprinter4 = sprinter1;
        System.out.println(sprinter4);
    }
}
