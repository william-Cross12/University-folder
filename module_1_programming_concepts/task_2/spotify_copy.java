package module_1_programming_concepts.task_2;
import java.util.Scanner;
import java.util.ArrayList;
public class spotify_copy {
    public static void main(String[] args)
    {
        Song_list song_list = new Song_list();
        spotify_copy.create_songs(song_list);

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while(run == true)
        {
            

            System.out.println();
            System.out.println("1. Add new song");
            System.out.println("2. Remove song");
            System.out.println("3. Print all songs");
            System.out.println("4. Print songs above inputed number of plays");
            System.out.println("5. Quit the program");
            System.out.println();

            System.out.print("select option (e.g: 1): ");
            String num = sc.nextLine();
            

            int value = 0;
            try {
                value = Integer.parseInt(num);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number...");
                System.out.println();
                continue;
            }






            //comment all of code
            //add scanner validation on the options?








            if(value == 1)
            {
                System.out.println();
                System.out.println("Add new song...");
                System.out.print("Input song name: ");
                String name = sc.nextLine();

                System.out.print("Input artist name: ");
                String artist = sc.nextLine();

                System.out.print("input number of plays: ");
                long plays = sc.nextLong();

                Song new_song = new Song(name, artist, plays);

                song_list.addSong(new_song);
                sc.nextLine();
            }

            else if(value == 2)
            {
                System.out.println();
                System.out.println("Remove song...");
                System.out.print("Input song name: ");
                String input_name = sc.nextLine();

                System.out.print("Input artist name: ");
                String input_artist = sc.nextLine();

                System.out.println();
                System.out.println("Attempting to remove song...");

                song_list.removeSongs(input_name, input_artist);
            }

            else if(value == 3)
            {
                song_list.printSongs();
            }

            else if(value == 4)
            {

                System.out.println();
                System.out.println("Find songs...");
                System.out.print("Input number of plays to search from: ");
                long input_plays = sc.nextLong();

                song_list.findSongs(input_plays);
                sc.nextLine();
            }

            else if(value == 5)
            {
                System.out.println("Goodbye");
                run = false;
                sc.close();
            }

            else
            {
                System.out.println("Invalid number. (Enter number 1-5)...");
                System.out.println();
            }

            
        }

        

    }
    
    public static void create_songs(Song_list song_list)
    {
        

        Song song0 = new Song("Believer", "Imagine Dragons", 2412190548L);
        song_list.addSong(song0);

        Song song1 = new Song("Robots", "Flight of the Conchords", 9397764);
        song_list.addSong(song1);

        Song song2 = new Song("Dance Monkey", "Tones And I", 2771040544L);
        song_list.addSong(song2);

        Song song3 = new Song("Starboy", "The Weeknd featuring Daft Punk", 2260528687L);
        song_list.addSong(song3);

        Song song4 = new Song("Bad Guy", "Billie Eilish", 2223000000L);
        song_list.addSong(song4);

        Song song5 = new Song("Faded", "Alan Walker", 1699987272);
        song_list.addSong(song5);

        Song song6 = new Song("Smooth Criminal", "Michael Jackson", 537854110);
        song_list.addSong(song6);

        Song song7 = new Song("Bury the Light", "Casey Edwards, Victor Borba", 62241803);
        song_list.addSong(song7);

        Song song8 = new Song("Shape of You", "Ed Sheeran", 3400059144L);
        song_list.addSong(song8);
        
        Song song9 = new Song("Black Magic", "Little Mix", 553202007);
        song_list.addSong(song9);

    }
}


class Song
{
    private String name;
    private String artist;
    private long plays;

    public Song(String name, String artist, long plays)
    {
        this.name = name;
        this.artist = artist;
        this.plays = plays;
    }

    public String displayName()
    {
        return(this.name);
    }

    public String displayArtist()
    {
        return(this.artist);
    }

    public long displayPlays()
    {
        return(this.plays);
    }
}


class Song_list
{
    private ArrayList<Song> song_collection = new ArrayList<Song>();


    public Song_list()
    {

    }

    public void addSong(Song song)
    {
        this.song_collection.add(song);
    }

    public void printSongs()
    {
        for(Song song_from_list:(this.song_collection))
        {
            this.print(song_from_list);
        }
    }





    public void removeSongs(String input_name, String input_artist)
    {
        for(Song song_from_list:(this.song_collection))
        {

            if((song_from_list.displayName()).equals(input_name) && (song_from_list.displayArtist()).equals(input_artist))
            {
                this.song_collection.remove(song_from_list);
                System.out.println("Successfully removed song...");
                break;
            }
        }
    }



    
    public void findSongs(long input_plays)
    {
        for(Song song_from_list:(this.song_collection))
        {
            if((song_from_list.displayPlays()) > input_plays)
            {
                this.print(song_from_list);
            }
        }
    }






    public void print(Song song)
    {
        System.out.println();

        System.out.printf("%-32s %s\n", "name of song", song.displayName());
        System.out.printf("%-32s %s\n", "name of artist", song.displayArtist());
        System.out.printf("%-32s %d\n", "play count", song.displayPlays());

        System.out.println();
    }
}