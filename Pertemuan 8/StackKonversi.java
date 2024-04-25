public class StackKonversi 
{
    int size, top;
    int[] tumpukanBiner;

    public StackKonversi(int size) 
    {
        this.size = size;
        top = -1;
        tumpukanBiner = new int[size];
    }

    public boolean isEmpty() 
    {
        return top == -1;
    }

    public boolean isFull() 
    {
        return top == size - 1;
    }

    public void push(int data) 
    {
        if (isFull()) {
            System.out.println("Stack penuh.");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack kosong.");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}