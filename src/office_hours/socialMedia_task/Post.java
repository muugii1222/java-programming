package office_hours.socialMedia_task;

/**
 Post class

 •Create a class that has the following instance variable:
 String body, and String dateTime

     -Encapsulate body. Provide a public getter and setter(update)
     -Make dateTime final and read only (getter)

 •Create a constructor that will take the body and initialize the body instance variable. Upon creation of the post the current date and time should be taken and stored into the dateTime variable

 Note: Since we didn’t learn this class use the follow code:
 this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));

 Need to have these two imports for the above code: import java.time.LocalDateTime;import java.time.format.DateTimeFormatter;
 */

public class Post {

    private String body;
    private final String dateTime = null;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateTime() {
        return dateTime;
    }
}
