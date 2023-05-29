import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        int dogumYili = input.nextInt();

        String cinZodyagiBurcu = getCinZodyagiBurcu (dogumYili);
        System.out.println("Çin Zodyağı Burcunuz : " + cinZodyagiBurcu);
    }

    public static String getCinZodyagiBurcu (int dogumYili) {
        String[] zodyakBurclari = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        return zodyakBurclari[dogumYili % 12];
    }

}