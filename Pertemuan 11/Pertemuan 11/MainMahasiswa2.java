public class MainMahasiswa2
{
    public static void main(String[] args) {
        AntrianLayanan antrian = new AntrianLayanan();

        Mahasiswa2 mhs1 = new Mahasiswa2("111", "Anton");
        Mahasiswa2 mhs2 = new Mahasiswa2("112", "Prita");
        Mahasiswa2 mhs3 = new Mahasiswa2("113", "Yusuf");
        Mahasiswa2 mhs4 = new Mahasiswa2("114", "Doni");
        Mahasiswa2 mhs5 = new Mahasiswa2("115", "Sari");

        antrian.enqueue(mhs1);
        antrian.enqueue(mhs2);
        antrian.enqueue(mhs3);
        antrian.enqueue(mhs4);
        antrian.enqueue(mhs5);
        System.out.println();
        
        antrian.displayAntrian();

        System.out.println();

        antrian.dequeue();
        antrian.dequeue();

        System.out.println();

        antrian.displayAntrian();
    }
}