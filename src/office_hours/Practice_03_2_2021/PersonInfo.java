package office_hours.Practice_03_2_2021;

/*Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information



    - Challenge: print your name in a cool way (unicode)
    - Challenge: char star

 */

public class PersonInfo {
    public static void main(String[] args) {
        String name = "Munkhjargal";
        byte age = 34;
        char gender = 'F';
        boolean student = true;
        short siblings = 1;
        long favoriteNumber = 1000000000L;
        int season = 4;
        double birthDate = 12.22;
        int birthYear = 1987;
        String fullBirthday = "" + birthDate + "." + birthYear ;
        String quote = "Practice makes Progress";

        System.out.println("Name:\t\t\t\t\t\t\t" + name);
        System.out.println("Age:\t\t\t\t\t\t\t" + age);
        System.out.println("Gender:\t\t\t\t\t\t\t" + gender);
        System.out.println("Student:\t\t\t\t\t\t" + student);
        System.out.println("Number of siblings:\t\t\t\t" + siblings);
        System.out.println("Favorite number:\t\t\t\t" + favoriteNumber);
        System.out.println("Number of season in your area:\t" + season);
        System.out.println("Birth date:\t\t\t\t\t\t" + birthDate);
        System.out.println("Birth year:\t\t\t\t\t\t" + birthYear);
        System.out.println("Name:\t\t\t\t\t\t\t" + name);
        System.out.println("Full birthday date with year:\t" + fullBirthday);
        System.out.println("Favorite quote:\t\t\t\t\t" + quote);

        char m = 77;
        char u = 117;
        char n = 110;
        char k = 107;
        char h = 104;
        char j = 106;
        char a = 97;
        char r = 114;
        char g = 103;
        char l = 108;
        System.out.println(m);
        System.out.println(u);
        System.out.println(n);
        System.out.println(k);
        System.out.println(h);
        System.out.println(j);
        System.out.println(a);
        System.out.println(r);
        System.out.println(g);
        System.out.println(a);
        System.out.println(l);

        char s = 115;
        char t = 116;
        char star = 42;

        System.out.println();
        System.out.println(star);
        System.out.println(s);
        System.out.println(t);
        System.out.println(a);
        System.out.println(r);

    }
}
