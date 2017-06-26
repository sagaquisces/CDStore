import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    CD cd1 = new CD("Take5", "Takin' a break", 1988, 5);
    CD cd2 = new CD("Gwen Stefani", "LAMB", 2003, 9);
    CD cd3 = new CD("Alban Berg", "Lulu", 2005, 10);
    CD cd4 = new CD("Charles Alkan", "Etudes", 1995, 15);
    CD cd5 = new CD("Anton Arensky", "String Quartet", 2010, 2);

    List<CD> allCDs = new ArrayList<CD>();
    allCDs.add(cd1);
    allCDs.add(cd2);

    //ask if want to search by year or by price range

    System.out.println("Welcome to CD Barn.");

    System.out.println("Enter 'year' if you want to search by release year, or 'price' if you want to search by price range");

    String searchChoice = myConsole.readLine();

    boolean searchResults = false;

    if (searchChoice.equals("year")) {
      System.out.println("Search for CD according to year:");

      Integer cdChoiceByYear = Integer.parseInt(myConsole.readLine());

      for (CD singleCD : allCDs) {

        if ( cdChoiceByYear == singleCD.mReleaseYear ) {
          System.out.println("--------------------");
          System.out.println( singleCD.mArtistName );
          System.out.println( singleCD.mAlbumName );
          System.out.println( singleCD.mReleaseYear );
          System.out.println( singleCD.mPrice );

          searchResults = true;
        }

      }
      if (!searchResults){
        System.out.println ("No results from search");
      }

    } else if (searchChoice.equals("price")) {
      System.out.println("Search for CD according to price range.");
      System.out.println("What is your low end (0 or greater):");

      Integer lowChoiceByPrice = Integer.parseInt(myConsole.readLine());

      System.out.println("What is your high end (greater or equal to your low end):");

      Integer highChoiceByPrice = Integer.parseInt(myConsole.readLine());

      if (lowChoiceByPrice < 0 || highChoiceByPrice < 0 || lowChoiceByPrice > highChoiceByPrice) {
        System.out.println("Has to be a reasonable price range. Exiting program now.");
      } else {

        for (CD singleCD : allCDs) {
          if (lowChoiceByPrice <= singleCD.mPrice && highChoiceByPrice >= singleCD.mPrice) {
            System.out.println("--------------------");
            System.out.println( singleCD.mArtistName );
            System.out.println( singleCD.mAlbumName );
            System.out.println( singleCD.mReleaseYear );
            System.out.println( singleCD.mPrice );

            searchResults = true;
          }
        }
        if (!searchResults){
          System.out.println ("No results from search");
        }

      }


    } else {
      System.out.println("You didn't follow my explicit directions. Booting you out!");
    }





    // for ( CD singleCD : allCDs ) {
    //   System.out.println("-------------------");
    //   System.out.println( singleCD.mArtistName );
    //   System.out.println( singleCD.mAlbumName );
    //   System.out.println( singleCD.mReleaseYear );
    //   System.out.println( singleCD.mPrice );
    // }
  }
}
