/*  Your Name: Gina Aorahim
    Assignment Name:   EnumeratedTypes        
    Date:  09/26/20
    Test Data Set:
*/

public class EnumeratedTypes {
    enum PrimarySeasons {
        SPRING, SUMMER, FALL, WINTER
    }

    public static void main(String[] args) {
        PrimarySeasons mySeason = PrimarySeasons.SPRING;

        System.out.println("My primary season is:" + mySeason);
        System.out.println("The ordial value is: " + mySeason.ordinal());

        mySeason = PrimarySeasons.WINTER;
        System.out.println("My Primary season is: " + mySeason);
        System.out.println("The ordial value is: " + mySeason.ordinal());

    }
}
