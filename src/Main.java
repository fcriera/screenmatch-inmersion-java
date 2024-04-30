import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //System.out.println("Movie Matrix");

        // Variable Declaration
        int releaseDate = 1999;
        double rating = 4.5;
        boolean includedInBasicPlan = true;
        String name = "Matrix";
        String synopsis = """
                The best movie of the century
                """;
        double mediaRatingUser = 0;


        System.out.println("Movie Name: " + name);
        System.out.println("Plot Synopsis: " + synopsis);
        System.out.println(releaseDate);
        System.out.println(includedInBasicPlan);

        double mediaRating = (4.5+4.8+3)/3;
        System.out.println("Media rating of the Movie Matrix: " + mediaRating);

        if (releaseDate >= 2023){
            System.out.println("Popular movie at the moment");
        } else {
            System.out.println("Retro Movie worth watching");
        }

        for (int i = 0; i < 3; i++) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Insert your rating of Matrix");
            double gradeMatrix = keyboard.nextDouble();
            mediaRatingUser = mediaRatingUser + gradeMatrix / 3;
        }
        System.out.println("Rating of the Movie Matrix given by User: " + mediaRatingUser);
    }
}