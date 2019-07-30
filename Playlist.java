import Nitin_ds.*;
import java.util.*;

public class Playlist
{
	public static void main(String[] args)
	{
		System.out.println("1. Create Playlist");
		System.out.println("2. Exit");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		if(choice==1)
		{
			System.out.println("Enter a Name for your playlist");
			String playlist_name = sc.next();

			System.out.println(" Your Playlist's Name is :- " +  playlist_name);
		}
		else
		{
			System.out.println("Please Visit Again");
		}
	}
}