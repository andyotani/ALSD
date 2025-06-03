class AntrianPasien {
  Pasien[] antrian;
  int front;
  int rear;
  int size;
  int max;

  public AntrianPasien() {
    max = 20;
    antrian = new Pasien[max];
    front = size = 0;
    rear = -1;
  }

  public boolean isFull() {
    return size == max;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void tampilkanAntrian() {
    if (isEmpty()) {
      System.out.println("== Antrian Pasien ==");
      System.out.println("Tidak ada data.");
      return;
    }
    System.out.println("== Antrian Pasien ==");
    for (int i = 0; i < size; i++) {
      int index = (front + i) % max;
      antrian[index].tampilkanInformasi();
    }
  }

  public void tambahPasien(Pasien pasien) {
    if (isFull()) {
      System.out.println("Antrian sudah penuh, tidak dapat menambahkan Pasien");
      return;
    }
    rear = (rear + 1) % max;
    antrian[rear] = pasien;
    size++;
    System.out.println(pasien.nama + " berhasil masuk ke antrian.");
  }

  public Pasien layaniPasien() {
    if (isEmpty()) {
      System.out.println("Antrian kosong.");
      return null;
    }
    Pasien dilayani = antrian[front];
    front = (front + 1) % max;
    size--;

    return dilayani;
  }

  public void sisaPasien() {
    if (isEmpty()) {
      System.out.println("Tidak terdapat pasien di antrian.");
      return;
    } else {
      System.out.println("Masih Terdapat " + size + " Pasien di Antrian.");
    }
  }
}
