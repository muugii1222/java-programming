package office_hours.socialMedia_task;

/**
 Instagram Class:

 •Create a class Instagram that will inherit the Social Media class

 •Add additional instance variables: username, password, number of followers, number of following, and posts (ArrayList of Post)

 •Set the platform for all objects to be "Instagram"

 •Encapsulate the variables

 •Create a constructor to initialize the username and password

    -Set up the user's person url:"Instagram.com/" + $username

 •Implement all the abstract methods coming from the Social Media class

     * Direct messaging(String username, String message)-print = %message sent to %username
     * Post(String body)
        -Let’s keep it simple and say our variable body will be a picture)
        -Create an ArrayList of Posts that will hold all of the Posts of a user
     * Notifications(int time)
        -Checks the current time. If the time is between 10am -8pm print "Notification", otherwise print "Sleep mode"

 Note: use this code to get the current hour: LocalTime.now().getHour()
    -The return value will be given in 24 hour format.
 */

public class Instagram {
}
