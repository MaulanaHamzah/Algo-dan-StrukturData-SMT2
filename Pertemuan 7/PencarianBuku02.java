import java.util.Arrays;

public class PencarianBuku02 {
    Buku02 listBk[] = new Buku02[5];
    int idx;

    void tambah(Buku02 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku02 m : listBk) {
            if (m != null) {
                m.tampilDataBuku();
            }
        }
    }

    public int findSequentialSearchByTitle(String title) {
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i] != null && listBk[i].judulBuku.equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void sortBooksByTitle() {
        Arrays.sort(listBk, (a, b) -> {
            if (a != null && b != null) {
                return a.judulBuku.compareTo(b.judulBuku);
            }
            return 0;
        });
    }

    public int findBinarySearchByTitle(String title) {
        sortBooksByTitle();

        int left = 0;
        int right = idx - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (listBk[mid] != null && listBk[mid].judulBuku.compareTo(title) == 0) {
                return mid;
            }

            if (listBk[mid] != null && listBk[mid].judulBuku.compareTo(title) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data dengan judul \"" + x + "\" ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data dengan judul \"" + x + "\" tidak ditemukan!");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Judul Buku\t : " + x);
            System.out.println("Kode Buku\t : " + listBk[pos].kodeBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t\t : " + listBk[pos].stock);
        } else {
            System.out.println("Data dengan judul \"" + x + "\" tidak ditemukan!");
        }
    }

    public void searchAndWarnDuplicateTitles(String title) {
        int count = 0;
    
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i] != null && listBk[i].judulBuku.equals(title)) {
                count++;
            }
        }
    
        if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu hasil untuk judul \"" + title + "\"");
        }
    }
    
}
