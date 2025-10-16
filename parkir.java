import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int tarifMobil = 3000;
        final int tarifMotor = 2000;
        final int tarifMaks = 12500;

        String jenis;
        int durasi;
        int totalBayar;
        int totalSemua = 0;

        System.out.println("=== Program Pembayaran Parkir ===");
        System.out.println("Ketik '0' sebagai jenis kendaraan untuk keluar.\n");

        do {
            System.out.print("Masukkan jenis kendaraan (mobil/motor/0 untuk keluar): ");
            jenis = sc.nextLine();

            if (jenis.equals("0")) {
                System.out.println("Program selesai.\n");
                break;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();
            sc.nextLine(); 

            if (durasi <= 0) {
                System.out.println("Durasi tidak valid!\n");
                continue;
            }

            // Hitung total bayar
            if (durasi > 5) {
                totalBayar = tarifMaks;
            } else if (jenis.equalsIgnoreCase("mobil")) {
                totalBayar = durasi * tarifMobil;
            } else if (jenis.equalsIgnoreCase("motor")) {
                totalBayar = durasi * tarifMotor;
            } else {
                System.out.println("Jenis kendaraan tidak dikenal!\n");
                continue;
            }

            System.out.println("Total bayar untuk " + jenis + ": Rp " + totalBayar + "\n");
            totalSemua += totalBayar;

        } while (true);

        System.out.println("Total pendapatan parkir hari ini: Rp " + totalSemua);
        sc.close();
    }
}
