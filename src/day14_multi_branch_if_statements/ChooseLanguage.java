package day14_multi_branch_if_statements;
/*
selection -> 1 : "hello, thank for your call"
          -> 2 : "hola, gracias para llamar"
          -> 3 : "merhaba, aradiginiz icin tesekkurler"
          -> 4 : "privet, spasibo za vash zvonok"
          -> 5 : "Merci ,pour votre appel"
          else -----> "Sorry, I don't understand"
 */
public class ChooseLanguage {
    public static void main(String[] args) {

        byte language = 12;
        System.out.println("Choose your language:");

        if (language == 1){
            System.out.println("hello, thank for your call");
        } else if (language == 2){
            System.out.println("hola, gracias para llamar");
        } else if (language == 3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (language == 4) {
            System.out.println("privet, spasibo za vash zvonok");
        } else if (language == 5) {
            System.out.println("Merci ,pour votre appel");
        } else if (language == 6) {
            System.out.println("Сайн байна уу, Залгасанд баярлалаа");
        } else if (language == 7) {
            System.out.println("안녕하세요 전화 해주셔서 감사합니다");
        } else { //if not matching condition
            System.out.println("Sorry, I don't understand");
        }

    }
}
