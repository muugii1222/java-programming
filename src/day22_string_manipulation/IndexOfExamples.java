package day22_string_manipulation;

public class IndexOfExamples {
    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testng, maven, cucumber";

        System.out.println(technologies.indexOf(","));  // find first , of character position
        System.out.println(technologies.lastIndexOf(",")); // find last , of character position
        
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at the index = " + indexOfJava);  //return index number of where from started
        
        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at the index = " + idxOfCss);

        int idxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at the index = " + idxOfCucumber);

        int idxOfSql = technologies.indexOf("sql");
        System.out.println("sql is at the index = " + idxOfSql); //-1 cuz can't find

//        technologies contains "maven"
        if (technologies.contains("maven")) {
            System.out.println();
        } else {
            System.out.println();
        }


    }
}
