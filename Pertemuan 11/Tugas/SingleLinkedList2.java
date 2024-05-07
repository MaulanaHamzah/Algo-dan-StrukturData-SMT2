public class SingleLinkedList2
{
    ListNode head;
    ListNode tail;

    SingleLinkedList2()
    {
        head = null;
        tail = null;
    }

    boolean isEmpty()
    {
        return head == null;
    }

    void print()
    {
        if (isEmpty())
        {
            System.out.println("Linked List Kosong!");
        }
        else
        {
            ListNode temp = head;
            System.out.println("Head: ");
            while (temp != null)
            {
                System.out.println("Mhs " + temp.data.nim);
                System.out.println("NIM: " + temp.data.nim);
                System.out.println("Nama: " + temp.data.nama + "\n");
                temp = temp.next;
            }
            System.out.println("Tail");
        }
    }

    void addFirst(Mahasiswa data)
    {
        ListNode newNode = new ListNode(data);
        if (isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(Mahasiswa data)
    {
        ListNode newNode = new ListNode(data);
        if (isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter(Mahasiswa key, Mahasiswa data)
    {
        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        while (temp != null)
        {
            if (temp.data == key)
            {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null)
                {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, Mahasiswa data)
    {
        if (index < 0)
        {
            System.out.println("Indeks tidak valid !");
            return;
        }
        if (index == 0)
        {
            addFirst(data);
        }
        else
        {
            ListNode temp = head;
            for (int i = 0; i < index - 1 && temp != null; i++)
            {
                temp = temp.next;
            }
            if (temp == null)
            {
                System.out.println("Indeks melebihi batas linked list !");
                return;
            }
            ListNode newNode = new ListNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
            if (newNode.next == null)
            {
                tail = newNode;
            }
        }
    }
}