package mugi;

public class Email {
    public static void main(String[] args) {

        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

        String sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        String phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
        String messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));

        System.out.println(sender);
        System.out.println(phoneNumber);
        System.out.println(messageBody);


    }

    }

