import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    CD cd1 = new CD("Take5", "Takin' a break", 1988, 5);
    CD cd2 = new CD("Gwen Stefani", "LAMB", 2003, 9);

    List<CD> allCDs = new ArrayList<CD>();
    allCDs.add(cd1);
    allCDs.add(cd2);

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
