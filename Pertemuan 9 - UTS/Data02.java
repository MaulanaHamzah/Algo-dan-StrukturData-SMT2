public class Data02
{
    public void insertionSort(int[] array)
    {
        int n = array.length;
        for (int i = 1; i < n; i++)
        {
            int key = array[i];
            int j;
            for (j = i-1; j >= 0 && array[j] > key; j--)
            {
                array[j+1] = array[j];
            }
            array[j+1] = key;
        }
    }

    public int binarySearch(int[] array, int x)
    {
        int low = 0;
        int high = array.length-1;
        while (low <= high)
        {
            int nilaiTengah = low + (high - low) / 2;
            if (array[nilaiTengah] == x)
            {
                return nilaiTengah;
            }
            else if (array[nilaiTengah] < x)
            {
                low = nilaiTengah + 1;
            }
            else
            {
                high = nilaiTengah - 1;
            }
        }
        return -1;
    }

    public void printArray(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}