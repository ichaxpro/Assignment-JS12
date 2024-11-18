import java.util.Scanner;
public class TTL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, tempatLahir;
        int tanggal, tahun;

        System.out.print("Masukan nama lengkap: ");
        nama = sc.nextLine();
        System.out.print("Masukkan tempat kelahiran: ");
        tempatLahir = sc.nextLine();
        System.out.print("Masukkan tanggal lahir: ");
        tanggal = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan bulan kelahiran: ");
        String bulan = sc.nextLine();
        
        System.out.print("Masukkan tahun kelahiran: ");
        tahun = sc.nextInt();

        System.out.println("Nama anda: " + nama);
        System.out.println("TTL: " + tempatLahir + ", " + tanggal + " " + bulan + " " + tahun);
    }
}