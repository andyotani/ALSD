class AntrianTransaksi {
  NodeTransaksi head;
  NodeTransaksi tail;
  int maxSize;

  public int getSize() {
    NodeTransaksi temp = head;
    int size = 0;
    while (temp != null) {
      size++;
      temp = temp.next;
    }
    return size;
  }

  public AntrianTransaksi(int maxSize) {
    head = null;
    tail = null;
    this.maxSize = maxSize;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public boolean isFull() {
    return getSize() == maxSize;
  }

  public void tambahTransaksi(TransaksiLayanan data) {
    if (isFull()) {
      System.out.println("Antrian Sudah Penuh");
      return;
    }
    NodeTransaksi temp = new NodeTransaksi(data, null);
    if (head == null) {
      head = temp;
      tail = temp;
    } else {
      tail.next = temp;
      tail = temp;
    }
  }

  public void tampilkanRiwayat() {
    if (isEmpty()) {
      System.out.println("Antrian Kosong");
    } else {
      System.out.println("Riwayat Transaksi Pasien");
      NodeTransaksi temp = head;
      while (temp != null) {
        System.out.println(
            temp.data.pasien.nama
                + "( "
                + temp.data.durasiLayanan
                + " Jam ) : Rp."
                + temp.data.hitungBiaya());
        temp = temp.next;
      }
    }
  }
}
