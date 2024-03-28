public class MainHotel
{
    public static void main(String[] args)
    {
        HotelService hs = new HotelService();

        hs.tambah(new Hotel("Hotel A", "Kota Surabaya", 300000, (byte) 4));
        hs.tambah(new Hotel("Hotel B", "Kota Bandung", 250000, (byte) 2));
        hs.tambah(new Hotel("Hotel A", "Kota Malang", 350000, (byte) 5));
        hs.tambah(new Hotel("Hotel A", "Kota Yogyakarta", 300000, (byte) 3));
        hs.tambah(new Hotel("Hotel A", "Kota Bali", 400000, (byte) 5));

        System.out.println("Daftar Hotel sebelum sorting:");
        hs.tampilAll();

        System.out.println("===================================================");
        System.out.println("Daftar Hotel setelah sorting berdasarkan harga:");
        hs.bubbleSortByPrice();
        hs.tampilAll();

        System.out.println("===================================================");
        System.out.println("Daftar Hotel setelah sorting berdasarkan rating bintang:");
        hs.selectionSortByStarRating();
        hs.tampilAll();
    }
}