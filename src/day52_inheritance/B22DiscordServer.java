package day52_inheritance;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Mugi");
        user1.setRole("student");

        Admin admin1 = new Admin();
        admin1.setId(43145);
        admin1.setName("Sergiu");
        admin1.setRole("admin");


        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2 = new Admin("Gulia", 4138);
        System.out.println(admin2.toString());
    }
}


