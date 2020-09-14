import java.util.Scanner;

class Movie {

	private String name;
	private String rating;
	private int ticketSold;
	
	public Movie (String mName, String mRating, int mticketSold)
	{super();
	
	name = mName;
	rating = mRating;
	ticketSold = mticketSold;
	}
	public String getName() {
		return name;
	}
	
	public void setName (String mName)
	{
		name = mName;
	}
	public String getRating() {
		return rating;
	}
	
	public void setRating(String mRating)
	{
		rating = mRating;
	}
	public int getticketSold() 
	{
		return ticketSold;
	}
	public void setticketSold(int mticketSold)
	{
		ticketSold = mticketSold;
	}
	public String toString()
	{
		return getName()+" ("+getRating()+") Tickets sold: "+ getticketSold();
		
	}
}
public class MovieDriver{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		char ch = 'y';
		String name="";
		String rating="";
		int tickets = 0;
	
	while (ch =='y' || ch=='Y') {
		System.out.println("Enter the name of a movie: ");
		name = keyboard.nextLine();
		
		System.out.println("Enter the rating of movie: ");
		rating = keyboard.nextLine();
		
		System.out.println("Ebter the number of tickets sold for this movie: ");
		tickets= keyboard.nextInt();
		
		keyboard.nextLine();
		
		Movie m = new Movie(name, rating, tickets);
		System.out.println(m);
		System.out.println("Do you want to enter another movie? (y or n) ");
		ch = keyboard.nextLine().charAt(0);
	}
	System.out.println("Goodbye");
	keyboard.close();
	}
}
		
		
