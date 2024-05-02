import modelo.Movie;

import java.util.Scanner;

public class Principal {
    public void menu(){
        int option = 0;
        Scanner keyboard = new Scanner(System.in);
        while (option != 9){
            String menu = """
                    Welcome to Screenmatch
                    1) Register Movie
                    2)Register Serie
                    
                    9)Exit
                    """;
            System.out.println(menu);
            option = keyboard.nextInt();
            keyboard.nextLine();
            switch (option){
                case 1:
                    System.out.println("Register Movie name: ");
                    String name = keyboard.nextLine();
                    keyboard.nextLine();
                    System.out.println("Register release Date: ");
                    int releaseDate = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Register Movie lenght in minutes: ");
                    int lenghtInMinutes = keyboard.nextInt();
                    keyboard.nextLine();
                    Movie userMovie = new Movie();
                    userMovie.setName(name);
                    userMovie.setReleaseDate(releaseDate);
                    userMovie.setDurationInMinutes(lenghtInMinutes);
                    userMovie.info();
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
