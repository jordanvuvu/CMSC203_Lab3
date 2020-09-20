import java.util.Scanner;
public class MovieDriver {
	public static void main(String[] arg) {
		Scanner keyboard = new Scanner(System.in);
		char choice ='y';
		
		while (choice=='y')
		{
		Movie nm= new Movie();
		
		
		System.out.println("Enter the name of a movie: ");
		String title = keyboard.nextLine();
		nm.setTitle(title);
		System.out.println("Enter the rating of the movie: ");
		String rating= keyboard.nextLine();
		nm.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie: ");
		int soldTickets = keyboard.nextInt();
		nm.setSoldTickets(soldTickets);
		System.out.println(nm.toString());
		
		System.out.println("Do you want to enter another? (y or n)");
		choice = keyboard.next().charAt(0);
		keyboard.nextLine();
		
	}
		System.out.println("Goodbye");
	}
}
