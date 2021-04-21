package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {

        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());

        System.out.println(jobTitle.length());

        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()){
            System.out.println("JobTitle is missing, please resend");
        } else {
            System.out.println("JobTitle looks good");
        }

        System.out.println(jobTitle.equals(""));

        if ("".equals(jobTitle)) {
            System.out.println("Job title is empty");
        } else {
            System.out.println("Job title is not empty");
        }

        String word = " ";  //space is character too
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrots";

        if (!veggie.isEmpty());{
            System.out.println("we have " + veggie);
        }

    }
}
