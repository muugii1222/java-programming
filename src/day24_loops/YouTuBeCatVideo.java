package day24_loops;

public class YouTuBeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: World's smallest cat 🐈- BBC");
        int second = 0;

        while (second <= 117){
            System.out.println("Watching YouTube 🐈 - video: " + second);
            second++;
            Thread.sleep(1000); //PAUSE the code for a 1000 milliseconds. (1 second).
              //  to changing number, can control speed !
        }

        System.out.println("Finished watching cat 🐈 - video, let's start another one");

    }
}


