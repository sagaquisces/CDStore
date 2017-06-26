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

    System.out.println("Welcome to CD Barn. Enter 'year' if you want to search by release year, or 'price' if you want to search by price range");

    String searchChoice = myConsole.readLine();

    if (searchChoice.equals("year")) {
      System.out.println("You want to search by year!");
    } else if (searchChoice.equals("price"))
      System.out.println("You want to search by price!");
    }


    System.out.println("Search for CD according to year:");

    Integer CDChoiceByYear = Integer.parseInt(myConsole.readLine());

    boolean searchResults = false;

    for (CD singleCD : allCDs) {

      if ( CDChoiceByYear == singleCD.mReleaseYear ) {
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

    // for ( CD singleCD : allCDs ) {
    //   System.out.println("-------------------");
    //   System.out.println( singleCD.mArtistName );
    //   System.out.println( singleCD.mAlbumName );
    //   System.out.println( singleCD.mReleaseYear );
    //   System.out.println( singleCD.mPrice );
    // }
  }
}
