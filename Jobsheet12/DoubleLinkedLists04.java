public class DoubleLinkedLists04 {
    Node04 head;
    Node04 tail;

    public DoubleLinkedLists04(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Mahasiswa04 data){
        Node04 newNode = new Node04(data);
        if (isEmpty()){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa04 data){
        Node04 newNode = new Node04(data);
        if (isEmpty()) {
            head = tail = newNode;      
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa04 data){
        Node04 current = head;
        //Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equalsIgnoreCase(keyNim)) {
            current = current.next;     
        }
        if (current == null) {
            System.out.println("Node dengan Nim" +keyNim+ "tidak ditemukan.");
            return; 
        }
        Node04 newNode = new Node04(data);

        //Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else{
            //Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NiM " +keyNim);
    }

    public void print(){
        Node04 current = head;
        while (current!=null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
            
        }
        public Node04 search(String nim) {
        Node04 current = head;
        while (current != null) {
        if (current.data.nim.equalsIgnoreCase(nim)) {
            return current;
        }
        current = current.next;
    }
        return null; // tidak ditemukan
}

    }

