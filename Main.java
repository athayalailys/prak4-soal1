package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        int jumlahDadu = scanner.nextInt();

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daftarDadu.add(dadu);
        }

        int totalNilai = 0;
        for (int i = 0; i < daftarDadu.size(); i++) {
            int nilaiDadu = daftarDadu.get(i).getNilai();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilaiDadu);
            totalNilai += nilaiDadu;
        }
        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
    }
}