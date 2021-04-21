package mugi;

public class UtopianTree {
    public static void main(String[] args) {
        int growth1 = 1;
        int growth2 = 2;
        int treeSize = 0;

        for (int i = 1; i<= 10; i++) {
            if(i<=3) {
                System.out.println("year " + i + " - growth " + growth1 + " cm");
                treeSize = treeSize + growth1;
                System.out.println("tree size: " + treeSize + "cm");

            } else if(i>3){
                System.out.println("year " + i + " - growth " + growth2 + " cm");
                treeSize= treeSize + growth2;
                System.out.println("tree size: " + treeSize + "cm");

            }

        }
    }
}
