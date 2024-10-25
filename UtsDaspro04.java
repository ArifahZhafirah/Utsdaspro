import java.util.Scanner;

public class UtsDaspro04 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jam, menit, detik keberangkatan : ");
        int jam1 = sc.nextInt(), menit1 = sc.nextInt(), detik1 = sc.nextInt();
        
        System.out.print("Masukkan jam, menit, detik kedatangan : ");
        int jam2 = sc.nextInt(), menit2 = sc.nextInt(), detik2 = sc.nextInt();

        int totalKeberangkatan = (jam1 * 60 + menit1) * 60 + detik1;
        int totalKedatangan = (jam2 * 60 + menit2) * 60 + detik2;

        int selisih = (totalKedatangan - totalKeberangkatan + 86400) % 86400;

        System.out.println("Selisih waktu: " + (selisih / 60 / 60) + " jam " + (selisih / 60 % 60) + " menit " + (selisih % 60) + " detik.");
    
        sc.close();
    }
}
