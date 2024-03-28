import java.util.Arrays;

public class HotelService 
{
    Hotel[] rooms;
    int size;

    public HotelService() 
    {
        rooms = new Hotel[5];
        size = 0;
    }

    public void tambah(Hotel H) 
    {
        rooms[size++] = H;
    }

    public void tampilAll() 
    {
        for (int i = 0; i < size; i++) 
        {
            System.out.println("Nama: " + rooms[i].nama + ", Kota: " + rooms[i].kota +
                    ", Harga: " + rooms[i].harga + ", Bintang: " + rooms[i].bintang);
        }
    }

    public void bubbleSortByPrice() 
    {
        for (int i = 0; i < size - 1; i++) 
        {
            for (int j = 0; j < size - i - 1; j++) 
            {
                if (rooms[j].harga > rooms[j + 1].harga) 
                {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortByStarRating() 
    {
        for (int i = 0; i < size - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) 
            {
                if (rooms[j].bintang > rooms[minIndex].bintang) 
                {
                    minIndex = j;
                }
            }
            Hotel temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
}