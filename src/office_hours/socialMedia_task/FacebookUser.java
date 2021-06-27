package office_hours.socialMedia_task;

/**
 Facebook User

 •Create a class for a facebook user which inherits the Social Media class and has additional instance variables: username, password, full name, age, number of friends, and posts (ArrayList of Post)

 •Encapsulate all the variables.

 •Set the platform for "Facebook" using static block

 •Create a constructor that will create aFacebook user by taking username and password.

     -If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.

    -Create and assign the user's person url by using 'facebook.com/' and adding their username

    -Create an empty ArrayList of Posts

 •Overload the constructor to accept username, password, and the user’s name.
 -If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’

 •Overload the constructor to accept username, password, the user’s name, age and number of friends.

    -Only store the age and number of friends into the variables if they are valid numbers. The age cannot be a negative number and the number of friends cannot be negative or more than 5000.If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.

 •Implement all methods coming from Social Media class

     * Direct messaging(String username, String message)
        -print =%message sent to %username
     * Post(String body)
        -Should be added to theArrayList of Posts of the user
     * Notifications()
        -Checks the current time. If the time is between 8 am -5 pm print "Notification", otherwise print "Sleep mode"

 Note: use this code to get the current hour: LocalTime.now().getHour()
    -The return value will be given in 24 hour format.

 •Override the toString method to print all of the information of a Facebook user when they are searched.

 •Create a sendFriendRequest method that will accept a Facebook user object and send them a friend request. The method should return a boolean of if the friend request was sent (true) or if the friend request was not sent (false).

    -If your friend list is at the 5000 limit then do not send the request and print “You have reached the limit of friends.”
    -If the user you are trying to send the request to has already hit the limit,then print “$theUsersName cannot accept any more friend request.
    -If both the user and you are under the limit print “Friend request sent to $theUsersName” and increase your number of friends by one.
 */

public class FacebookUser {
}
