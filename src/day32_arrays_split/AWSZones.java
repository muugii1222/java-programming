package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("-----Starting deploying etsy app to AWS zones-----");
        String [] zonesSplit = zones.split(",") ;
        for (String eachZones: zonesSplit){
            //            System.out.println(eachZones);

            System.out.println("Deploying ["+app+"]"+eachZones+"...");
            System.out.println("Deployment completed for " + eachZones + "...");

        }

        System.out.println("All deployment completed");


    }
}
