import java.util.*;
  import Nitin_ds.*;
  // import javafx.*;
  // import javafx.scene.media.*;
  // import media_player.*;

  class PlayList
  {

    private static class Song
    {

      private String song_name;
      private boolean isPlaying;

      Song(String n,boolean isP)
      {
        song_name = n;
        isPlaying = false;
      }

    }

    String playlist_name;
    int mode;
    DoublyLinkedList<Song> song;

    PlayList(String n,int mod)
    {
      playlist_name = n;
      mode = mod;
      song = new DoublyLinkedList<Song>();
    }

    void addSong()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Song Name to add");
      String name = sc.nextLine();
      Song new_song = new Song(name,false);
      song.addLast(new_song);
      System.out.println("Song Added");
    }

    void deleteSong()
    {
      viewSongs();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter SongNo To delete,1 for first song,2 for second song and so on......");
      int index = sc.nextInt();
      song.removeValueAt(index);
      System.out.println("Song Removed");
    }

    void viewSongs()
    {
      if(song.size() == 0)
      {
        System.out.println("List is Empty");
      }
      else
      {
        System.out.println(playlist_name + " contains");
        System.out.println(song.toString());
      }
    }

    void playSongs()
    {
      if(song.size() == 0)
      {
        System.out.println("List is Empty");
      }
      else
      {
        int i=0;
        while(i<song.size())
        {
          System.out.println("Currently Playing");
          System.out.println(song.returnCurrent().song_name);
          i++;
        }
      }
    }

  }

  public class Media
  {

    DoublyLinkedList<PlayList> pb = new DoublyLinkedList<PlayList>();

    public void view_Playlists()
    {
      System.out.println(pb.toString());
    }

    public void create_playlist()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PlayList Name");
        String name = sc.nextLine();
        PlayList playlist = new PlayList(name,1);
        pb.addLast(playlist);
        System.out.println("PlayList Created");
        while(true)
        {
          // System.out.println("\033\143");
          System.out.println("Add Song in playlist,Press 1");
          System.out.println("Delete Song From playlist,Press 2");
          System.out.println("Change Mode of playlist,Press 3");
          System.out.println("View Songs in PlayList,Press 4");
          System.out.println("Play This PlayList,Press 5");
          System.out.println("Go To Back Menu,Press 0");
          int choice = sc.nextInt();
          switch(choice)
          {
              case 0:
              return;

              case 1:
              playlist.addSong();
              break;

              case 2:
              playlist.deleteSong();
              break;

              case 3:
              break;

              case 4:
              playlist.viewSongs();
              break;

              case 5:
              playlist.playSongs();
              break;

              default:
              System.out.println("No option matched");
              break;
          }
        }
    }

    public void edit_playlist()
    {
        System.out.println("Enter PlayList Name To Edit");
    }

    public static void main(String[] args)
    {
      Media media = new Media();
      Scanner sc = new Scanner(System.in);
      while(true)
      {
          // System.out.println("\033\143");
          System.out.println("Create A PlayList,Enter 1");
          System.out.println("Edit A PlayList,Enter 2");
          System.out.println("View PlayLists,Enter 3");
          System.out.println("Exit,Press 0");
          int choice = sc.nextInt();
          switch(choice)
          {

              case 0:
              System.exit(0);
              break;

              case 1:
              media.create_playlist();
              break;

              case 2:
              media.edit_playlist();
              break;

              case 3:
              media.view_Playlists();
              break;

              default:
              System.out.println("No option matched");
              break;

          }
      }
    }
  }