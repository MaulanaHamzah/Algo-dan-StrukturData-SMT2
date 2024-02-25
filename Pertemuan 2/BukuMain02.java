public class BukuMain02 {
    public static void main(String[] args) {
        Buku02 bk1 = new Buku02();
        bk1.judul = "Today Ends Tommorow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        System.out.println("===========================");

        bk1.tampilanInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilanInformasi();
        System.out.println("===========================");

        Buku02 bk2 = new Buku02("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilanInformasi();
        System.out.println("===========================");

        Buku02 bk3 = new Buku02("Timun Mas", "Achmad Maulana", 200, 50, 25000);
        bk3.tampilanInformasi();
        bk3.terjual(20);
        bk3.gantiHarga(130000);
        int totalHarga = bk3.hitungHargaTotal();
        System.out.println("Total Harga: Rp " + totalHarga);
        double diskon = bk3.hitungDiskon();
        System.out.println("Diskon: Rp " + diskon);
        double hargaBayar = bk3.hitungHargaBayar();
        System.out.println("Harga Bayar: Rp " + hargaBayar);

    }
}