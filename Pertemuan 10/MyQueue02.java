public class MyQueue02
{
    Nasabah[] data;
    int front, rear, size, max;
    
    public MyQueue02(int n)
    {
        max = n;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull()
    {
        return size == max;
    }

    public void peek()
    {
        if (!isEmpty())
        {
            System.out.println("Elemen terdepan: " +data[front].norek + " " + data[front].nama
            + " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo   );
        }
        else
        {
            System.out.println("Queue masih kosong");
        }
    }

    public void print()
    {
        if (isEmpty())
        {
            System.out.println("Queue masih kosong");
        }
        else
        {
            int i = front;
            while (i != rear)
            {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat
                        + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat
                    + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear()
    {
        if (isEmpty())
        {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }
        else
        {
            System.out.println("Queue masih kosong");
        }
    }

    public void enqueue(Nasabah dt)
    {
        if (isFull())
        {
            System.out.println("Queue sudah penuh");
        }
        else
        {
            if (isEmpty())
            {
                front = rear = 0;
            }
            else
            {
                if (rear == max - 1)
                {
                    rear = 0;
                }
                else
                {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah dequeue()
    {
        Nasabah dt = new Nasabah();
        if (isEmpty())
        {
        System.out.println("Queue masih kosong");
        }
        else
        {
            dt = data[front];
            size--;
            if (isEmpty())
            {
                front = rear = -1;
            }
            else
            {
                if (front == max - 1)
                {
                    front = 0;
                }
                else
                {
                    front++;
                }
            }
        }
        return dt;
    }

    public Nasabah peekRear() 
    {
        if (!isEmpty()) 
        {
            return data[rear];
        } 
        else 
        {
            System.out.println("Queue masih kosong");
            return null;
        }
    }
    
}