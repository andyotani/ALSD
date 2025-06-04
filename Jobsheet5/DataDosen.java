public class DataDosen {
    Dosen dataDosen[] = new Dosen[5];
    int idx;

    void tambah(Dosen d) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = d;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for(Dosen d: dataDosen) {
            d.tampil();
            System.out.println("--------------------------");
        }
    }

    void bubbleSortAsc() {
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 0; j < dataDosen.length - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j+1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j+1];
                    dataDosen[j+1] = temp;
                }
            }
    }
    }

    void insertionSortDesc() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen temp = dataDosen[i];
            int j = i-1;
            while (j >= 0 && dataDosen[j].usia < temp.usia) {
                dataDosen[j+1] = dataDosen[j];
                j--;
            }
            dataDosen[j+1] = temp;
        }
    }

    void selectionSortDesc() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int idxMax = i;
            for (int j = i+1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
        }
    }

