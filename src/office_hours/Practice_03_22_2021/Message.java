package office_hours.Practice_03_22_2021;
/*
Given a String variable with a message. You will check if the message contains any of these bad words: “idiot, dumb, heck”
    -> If the message contains any of those words print: “Message not sent”.
    -> If the message is bad word free print “Message sent”
 */
public class Message {
    public static void main (String[] args) {
        String message = "I love you";

        if (message.contains("idiot, dumb, heck")) {
            System.out.println("Message not sent");
        } else {
            System.out.println("Message sent");
        }
    }
}
