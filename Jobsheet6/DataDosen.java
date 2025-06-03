public class DataDosen {
    int idx;
    Dosen dataDosen[];

    DataDosen (int jmlDosen) {
      dataDosen = new Dosen[jmlDosen];
      idx = 0;
    }

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

    void insertionSortAsc() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen temp = dataDosen[i];
            int j = i-1;
            while (j >= 0 && dataDosen[j].usia > temp.usia) {
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

    int pencarianDataSequential (String target) {
            int posisi = -1;
            int counter = 0;
            for (int i = 0; i < dataDosen.length; i++) {
                if (dataDosen[i].nama.equalsIgnoreCase(target)) {
                    counter++;
                    posisi = i;
                }
            }

            if (counter > 1) {
                posisi = -2;
            }
            return posisi;
        }    

        int pencarianDataBinary (Dosen arr[], int target) {
                int counter = 0;
                int low = 0;
                int high = arr.length - 1;
                int posIndex = -1;
            
                while (low <= high) {
                    int middle = (low+high)/2;
                    if (target == arr[middle].usia) {
                        posIndex = middle;
                        counter++;

                        int left = middle - 1;
                        while (left >= low && target == arr[left].usia) {
                            counter++;
                            left--;
                        }

                        int right = middle + 1;
                        while (right <= high && target == arr[right].usia) {
                            counter++;
                            right++;
                        }
                        break;
                    } else if (target > arr[middle].usia) {
                        low = middle + 1;
                    } else {
                        high = middle - 1;
                    }
                }

                if (counter == 1) {
                    return posIndex;
                } else if (counter > 1) {
                    return -2;
                }
            
                return -1;
            
        }

        void tampilPosisi (int pos) {
            if (pos >= 0) {
                System.out.println("Data Dosen ditemukan pada index " + pos);
            } else if (pos == -2) {
                System.out.println("data memiliki duplikat (lebih dari 1)");
            } else {
                System.out.println("data tidak ditemukan");
            }
        }
    
        void tampilDataSearch(int pos) {
            if (pos >= 0) {
                dataDosen[pos].tampil();
            } 
        }


    
    }

