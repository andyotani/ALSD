package Pertemuan12;

public class SingleLinkedList04 {
    NodeMahasiswa04 head;
    NodeMahasiswa04 tail;

    boolean isEmpty(){
        return (head == null);
    }
public void print(){
    if (!isEmpty()) {
        NodeMahasiswa04 tmp = head;
        System.out.print("Isi Linked List:\t");
        while (tmp != null) {
            tmp.data.tampilInformasi();
            tmp = tmp.next;      
        }
        System.out.println("");
    }else{
        System.out.println("Linked List Kosong");
    }
}

public void addFirst(Mahasiswa04 input){
    NodeMahasiswa04 ndInput = new NodeMahasiswa04(input, null);
    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    }else{
        ndInput.next = head;
        head = ndInput;
    }
}

public void addLast(Mahasiswa04 input){
    NodeMahasiswa04 ndInput = new NodeMahasiswa04(input, null);
    if (isEmpty()) {
        head = ndInput;
        tail = ndInput;
    }else{
        tail.next = ndInput;
        tail = ndInput;
    }
}

public void insertAfter(String   )
}
