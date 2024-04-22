import java.util.Scanner;
public class Main02
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        Data02 data = new Data02();
        int[] array = {31,30,41,29,50,3,25,47,5,8,27,24,40,16,33,4,16};
        System.out.println("- INSERTION SORT -");
        System.out.println("Array sebelum diurutkan");
        data.printArray(array);
        data.insertionSort(array);
        System.out.println("Array setelah diurutkan");
        data.printArray(array);
        System.out.println("\n- BINARY SEARCH -");
        System.out.print("Masukkan angka yang ingin dicari: ");
        int x = input.nextInt();
        int hasil = data.binarySearch(array, x);
        if (hasil != -1)
        {
            System.out.println("Angka " + x + " ditemukan pada index ke " + hasil);
        }
        else
        {
            System.out.println("Angka " + x + " tidak ditemukan");
        }
        input.close();
    }   
}