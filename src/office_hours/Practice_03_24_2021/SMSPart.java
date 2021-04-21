package office_hours.Practice_03_24_2021;
/*
Given a String in the following format:

“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”

Separate these parts and print them separately: “Sender: actualSender” “Number: actualNumber” “Message: actualMessage”
 */
public class SMSPart {
    public static void main(String[] args) {
        String sms = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        System.out.println("Sender: " + sms.substring(sms.indexOf("<")+1,sms.indexOf(">")));
        System.out.println("Number: " + sms.substring(sms.indexOf("[")+1,sms.indexOf("]")));
        System.out.println("Number: " + sms.substring(sms.indexOf("{")+1,sms.indexOf("}")));
    }
}
