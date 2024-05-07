import java.util.LinkedList;

public class AntrianLayanan
{
    LinkedList<Mahasiswa2> antrian;

    AntrianLayanan()
    {
        antrian = new LinkedList<>();
    }

    void enqueue(Mahasiswa2 mahasiswa)
    {
        antrian.addLast(mahasiswa);
        System.out.println("Mahasiswa dengan NIM " +mahasiswa.nim+ 
        " telah ditambah ke dalam antrian");
    }

    Mahasiswa2 dequeue()
    {
        if (antrian.isEmpty())
        {
            System.out.println("Antrian kosong !");
            return null;
        }
        else
        {
            Mahasiswa2 mahasiswa = antrian.removeFirst();
            System.out.println("Mahasiswa dengan NIM " + mahasiswa.nim + " telah dilayani dan dihapus dari antrian.");
            return mahasiswa;
        }
    }

    void displayAntrian() {
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian Layanan Unit Kemahasiswaan:");
            for (Mahasiswa2 mahasiswa : antrian) {
                System.out.println(mahasiswa);
                System.out.println();
            }
        }
    }
}