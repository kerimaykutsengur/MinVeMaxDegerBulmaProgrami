import java.util.Scanner;

public class MinVeMaxDegerBulmaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberPiece;
        int number;
        int min = 0, max = 0;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        numberPiece = input.nextInt();

        for (int i = 1; i <= numberPiece; i++) {
            System.out.print(i + ". Sayıyı giriniz :");
            number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            } else {
                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }

            }
        }
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);


    }
}
