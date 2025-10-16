import java.util.Scanner;

public class tiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int hargaTiket = 50000;
        int jumlahTiket;
        double totalHarga;
        double totalPenjualan = 0;
        int totalTiketTerjual = 0;

        System.out.println("=== Program Penjualan Tiket Bioskop ===");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("Transaksi selesai.");
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.\n");
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;

            // Diskon 
            if (jumlahTiket > 10) {
                totalHarga *= 0.85; // diskon 15%
                System.out.println("Diskon 15% diterapkan!");
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90; // diskon 10%
                System.out.println("Diskon 10% diterapkan!");
            }

            System.out.println("Total harga pembelian: Rp " + totalHarga + "\n");

            totalPenjualan += totalHarga;
            totalTiketTerjual += jumlahTiket;
        }

        System.out.println("\n=== Rekapitulasi Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan: Rp " + totalPenjualan);

        sc.close();
    }
}
