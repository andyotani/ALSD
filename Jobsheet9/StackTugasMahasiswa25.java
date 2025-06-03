public class StackTugasMahasiswa25 {
    Mahasiswa25[] stack;
    int size;
    int top;

    StackTugasMahasiswa25(int size) {
        this.size = size;
        stack = new Mahasiswa25[size];
        top = -1;
    }

    boolean isFull() {
        return this.top == this.size - 1;
    }

    boolean isEmpty() {
        return this.top == -1;
    }

    void push(Mahasiswa25 m) {
        if (!isFull()) {
            top++;
            stack[top] = m;
        } else {
            System.out.println("stack penuh! tidak bisa menambahkan tugas lagi!");
        }
    }

    Mahasiswa25 pop() {
        if(!isEmpty()) {
           Mahasiswa25 mhs = stack[top];
            top--;
            return mhs; 
        } else {
            System.out.println("stack kosong! tidak ada tugas untuk dinilai");
            return null;
        }
    } 

    Mahasiswa25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    Mahasiswa25 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    int jumlahTugas() {
        if (!isEmpty()) {
            return top + 1;
        } else {
            return 0;
        }
    }

    public void print() {
        for(int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    String konversiDesimalKeBiner(int nilai) {
        StackKonversi stack = new StackKonversi();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai /= 2;
        }

        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }


}
