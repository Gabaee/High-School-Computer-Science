/*
This is my state song program, by: Gabriel Sicurella
 */
public class StateSongGS {
    public static void main(String[] args) {
        // Literal
        String flag = "You're a Grand Old Flag";
        // Class Constructor
        String flagSongWriter= new String("This song was written by George M. Cohan.");
        String writerName = "George M. Cohan";
        // Immutable
        final String flagSong1stPerf = "This song was first played on February 6, 1906, in New York's Herald Square Theater.";

        // Implicit conversation
        int copies = 1000000;
        String copiesSold = flag + " was the first song from a musical to sell over" + copies;
        // += Operator
        copiesSold += "That's a lot of copies!!";

        // + Operator
        String writerInfo = writerName + "is a very distinguished composer";

        // Escape sequences 1 and 2
        String escape = "Over There \\ You're a Grand Old Flag \\ and Yankee Doodle Dandy";

        System.out.println("Song:" + flag);
        System.out.println(flagSongWriter);
        System.out.println(flagSong1stPerf);
        System.out.println(copiesSold);
        System.out.println(writerInfo);
        // Escape sequence 3
        System.out.print("Cohan's best selling songs include: \n" + escape);
    }
}