public class Movie{

// global variables
private String movieName;
private double rating;
private int revenue;
private int numRatings;



// constructors
public Movie(){
    movieName = "Avengers";
    rating = 8.0;
    revenue = 33;
    numRatings = 623357910;

}

public Movie(String MOVIENAME, double RATING, int REVENEU, int NUMRATINGS){
    movieName = MOVIENAME;
    rating = RATING;
    revenue = REVENEU;
    numRatings = NUMRATINGS;

}

// methods
public void movieToString(){
    System.out.println("Movie: " + movieName);
    System.out.println("Rating: " + rating);
    System.out.println("Num of Ratings" + numRatings);
    System.out.println("Revenue: " + revenue);
    
}

public String getMovieName() {
    return movieName;
 }

public int getRevenue() {
    return revenue;
 }

public void addRating(double newrating) {
    rating = (rating * numRatings + newrating) / (numRatings + 1);
    numRatings++;
 }
















