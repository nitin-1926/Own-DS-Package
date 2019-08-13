import Nitin_ds.*;
import java.util.*;

class Playlist
{
	private static class Songify
	{

	}
}

public class Songify
{
	Scanner sc = new Scanner(System.in);
	DoublyLinkedList<Playlist> pl = new DoublyLinkedList<Playlist>();

	public void view_playlists()
	{
		System.out.println(pl.toString());
	}

	public void create_playlist()
	{
		System.out.println("Enter a Name for your playlist");
		String playlist_name = sc.next();

		//System.out.println(" Your Playlist's Name is :- " +  playlist_name);
		pl.addLast(playlist_name);
	}
	public static void main(String[] args)
	{
		System.out.println("To");
		System.out.println("Create Playlist, Press 1");
		System.out.println("Exit, Press 0");

		int choice = sc.nextInt();

		if(choice==1)
		{
			create_playlist();
		}
		else
		{
			System.out.println("Nice to Serve you!! Please Visit Again.");
		}
	}
}