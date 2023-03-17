package module_1_programming_concepts.task_2;
import java.util.Scanner;                           //imports scanner allowing for user input
import java.util.ArrayList;                         //imports ArrayList to allow storing a list of objects
public class spotify_copy {
    public static void main(String[] args)
    {
        Song_list song_list = new Song_list();      //creates song_list object to allow all options to work
        spotify_copy.create_songs(song_list);       //runs create_songs passing in the song_list object

        boolean run = true;                         //allows while loop to run infinately
        Scanner sc = new Scanner(System.in);        //creates scanner object for user input

        while(run == true)
        {
            

            System.out.println();
            System.out.println("1. Add new song");
            System.out.println("2. Remove song");
            System.out.println("3. Print all songs");
            System.out.println("4. Print songs above inputed number of plays");         //displays brilliant user interface
            System.out.println("5. Quit the program");
            System.out.println();

            System.out.print("select option (e.g: 1): ");
            String num = sc.nextLine();                             //gets user input as num
            

            int value = 0;
            try {
                value = Integer.parseInt(num);                      //checks that num is an int
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number...");     // if not an int (NumberFormatException) then displays error and gets user to try again
                System.out.println();
                continue;
            }



            if(value == 1)                          //asks user for song name, artist name and view count and creates a new song object then adds it to the ArrayList using addSong method of the Song_list class
            {
                System.out.println();
                System.out.println("Add new song...");
                System.out.print("Input song name: ");
                String name = sc.nextLine();

                System.out.print("Input artist name: ");
                String artist = sc.nextLine();

                System.out.print("input number of plays: ");
                long plays = sc.nextLong();                             //is a long because int is too short for the number of plays some songs can have (billions)

                Song new_song = new Song(name, artist, plays);      //creates new song object with user's information

                song_list.addSong(new_song);
                sc.nextLine();                  //this clears the scanner so that there is no ghost input causing a wierd scanner error 
            }                                   //(no error message but it thinks that there was an input when there wasn't and it gets caught by the error handeling in the loop and looks a bit odd)

            else if(value == 2)                             //asks user for song name and artist name and sends this information to removeSongs in Song_list class
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

            else if(value == 3)         //runs method printSongs in the Song_list class
            {
                song_list.printSongs();
            }

            else if(value == 4)                 //user is asked for a number to search from and that number is then sentto the findSongs method in the Song_list class
            {

                System.out.println();
                System.out.println("Find songs...");
                System.out.print("Input number of plays to search from: ");
                long input_plays = sc.nextLong();                                       //is a long because int is too short for the number of plays some songs can have (billions)

                song_list.findSongs(input_plays);
                sc.nextLine();                                       //this clears the scanner    
            }

            else if(value == 5)                     //if user enter number 5 then an exit message is displayed, scanner is closed and the loop ends so the program ends (as run is set to false)
            {
                System.out.println("Goodbye");
                run = false;
                sc.close();
            }

            else
            {
                System.out.println("Invalid number. (Enter number 1-5)...");            //if user inputted int that isn't an option they are given an error message and have to try again
                System.out.println();
            }

            
        }

        

    }
    
    public static void create_songs(Song_list song_list)            //create_songs method part of the main class that populates the Song_list arrayList with a selection of songs to allow for tests 
    {                                                               //(also because 10 songs is one of teh requirenments)
        

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


class Song          //defines Song class
{
    private String name;          //variables used in Song class
    private String artist;
    private long plays;                                       //is a long because int is too short for the number of plays some songs can have (billions)

    public Song(String name, String artist, long plays)     //constructor for Song class, creates song object with the variables used
    {
        this.name = name;
        this.artist = artist;
        this.plays = plays;
    }

    public String displayName()         //when called it returns the song name of the object its called upon
    {
        return(this.name);
    }

    public String displayArtist()         //when called it returns the artist name of the object its called upon
    {
        return(this.artist);
    }

    public long displayPlays()         //when called it returns the number of plays of the object its called upon
    {
        return(this.plays);
    }
}


class Song_list          //defines Song_list class
{
    private ArrayList<Song> song_collection = new ArrayList<Song>();            //creates the ArrayList song_collection


    public Song_list()      //constructor for Song_list class (run once at top of code to create object for Song_list to allow access to the ArrayList)
    {

    }

    public void addSong(Song song)      //adds a song object to the ArrayList (called when program is ran and also called from user option 1)
    {
        this.song_collection.add(song);
    }

    public void printSongs()                    //called from user option 3
    {
        for(Song song_from_list:(this.song_collection))         //runs a loop over everything in the ArrayList and sends that object to the print method
        {
            this.print(song_from_list);
        }
    }





    public void removeSongs(String input_name, String input_artist)         //called from user option 2 (user inputs song name and artist name)
    {
        for(Song song_from_list:(this.song_collection))         //loops over everything in the arrayList
        {

            if((song_from_list.displayName()).equals(input_name) && (song_from_list.displayArtist()).equals(input_artist))      //checks if the current object being looped over is the same as 
            {                                                                                                                   //both the user inputs using methods from the Song class

                this.song_collection.remove(song_from_list);                    //if both are the same then the object is removed from the ArrayList
                System.out.println("Successfully removed song...");         //suitable message displayed
                break;          //escapes the loop to prevent ArrayList error when continuing to loop after removing something breaks the code
            }
        }
    }



    
    public void findSongs(long input_plays)             //called form user option 4
    {
        for(Song song_from_list:(this.song_collection))         //runs a loop over everything in the ArrayList
        {
            if((song_from_list.displayPlays()) > input_plays)       //checks if the current object has a higher play count than the user input
            {
                this.print(song_from_list);         //if it is higher then it is sent to the print method
            }
        }
    }






    public void print(Song song)        //called to print out a song object thats human readable and formated nicely
    {
        System.out.println();

        System.out.printf("%-32s %s\n", "name of song", song.displayName());
        System.out.printf("%-32s %s\n", "name of artist", song.displayArtist());        //formats so that whats being displayed is in line with the other lines
        System.out.printf("%-32s %d\n", "play count", song.displayPlays());             //uses Song class methods to display the information about the song object that was passed into this method

        System.out.println();
    }
}