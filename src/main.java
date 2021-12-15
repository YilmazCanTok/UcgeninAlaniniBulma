import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin Alanını Hesaplama");
        System.out.print("Üçgenin 1. kenarının uzunluğunu giriniz : ");
        int birincikenar = scanner.nextInt();
        System.out.print("Üçgenin 2. kenarının uzunluğunu giriniz : ");
        int ikincikenar = scanner.nextInt();
        System.out.print("Üçgenin 3. kenarının uzunluğunu giriniz : ");
        int ucuncukenar = scanner.nextInt();
        System.out.println("***********************************************");
        int cevre = birincikenar+ikincikenar+ucuncukenar;
        System.out.println("Üçgenin Çevresi = "+cevre);
        System.out.println("Üçgenin Alanının Karesi = ((Çevre/2) * (Çevre*Birinci Kenar/2) * (Çevre*İkinci Kenar/2) * (Çevre*Üçüncü Kenar/2)) ");
        int u = cevre/2;
        int a = birincikenar;
        int b = ikincikenar;
        int c = ucuncukenar;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı = "+alan);
        System.out.println("***********************************************");
    }
}
