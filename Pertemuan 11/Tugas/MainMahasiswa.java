public class MainMahasiswa
{
    public static void main(String[] args)
    {
        SingleLinkedList2 ndInput = new SingleLinkedList2();

        Mahasiswa mhs1 = new Mahasiswa("111", "Anton");
        Mahasiswa mhs2 = new Mahasiswa("112", "Prita");
        Mahasiswa mhs3 = new Mahasiswa("113", "Yusuf");
        Mahasiswa mhs4 = new Mahasiswa("114", "Doni");
        Mahasiswa mhs5 = new Mahasiswa("115", "Sari");

        ndInput.addFirst(mhs1);
        ndInput.addLast(mhs2);
        ndInput.addLast(mhs3);
        ndInput.addLast(mhs4);
        ndInput.addLast(mhs5);
        
        ndInput.print();
    }
}