package day15_logicalops_switch_ternary;

public class JodOfferSelector {
    public static void main(String[] args) {
      String location = "Chicago";
      double salary = 150_000;
      boolean isRemote = true;
      boolean hasBenefits = true;

      if (location.equals("Chicago") && salary >= salary && isRemote && hasBenefits) {
          System.out.println("Sure, I'll accept this offer");
      } else {
          System.out.println("Lets consider another offer or negotiate");
      }


    }
}
