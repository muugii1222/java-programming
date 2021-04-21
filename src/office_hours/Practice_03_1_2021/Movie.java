package office_hours.Practice_03_1_2021;

public class Movie {
    public static void main(String[] args){
        String name = "Penguin Bloom";
        String genre = "Movies based on real life";
        short duration = 95;
        String releaseDate = "03-05-2021";
        char rating = 'G';
        boolean sequels = false;
        byte rottenTomatoRating = 98;
        boolean dvd = true;

        System.out.println("Name:\t\t\t\t\t" + name);
        System.out.println("Genre:\t\t\t\t\t" + genre);
        System.out.println("Duration:\t\t\t\t" + duration);
        System.out.println("Release Date:\t\t\t" + releaseDate);
        System.out.println("Rating:\t\t\t\t\t" + rating);
        System.out.println("Sequels:\t\t\t\t" + sequels);
        System.out.println("Rotten tomato rating:\t" + rottenTomatoRating);
        System.out.println("On Dvd:\t\t\t\t\t" + dvd);
        System.out.println();
        System.out.println("------ Welcome to the Cinema ------");
        System.out.println();
        System.out.println("Tonight we are streaming \"" + name + "\" which was released on " + releaseDate + "." +
                "\nThis " + genre + " movie got a " + rottenTomatoRating +  " rating on Rotten Tomatoes.\nThe rating is "
                + rating + " and it runs for " + duration + " hours.\nThis is sequel " + sequels + " and is on DVD " + dvd + ".");






    }
}
