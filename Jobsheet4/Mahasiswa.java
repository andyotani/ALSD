class Mahasiswa {
        String nama, nim;
        int tahunMasuk, nilaiUts, nilaiUas;
        Mahasiswa mhs[];

        Mahasiswa () {

        }

        Mahasiswa (String nama, String nim, int tahun, int uts, int uas) {
            this.nama = nama;
            this.nim = nim;
            tahunMasuk = tahun;
            nilaiUts = uts;
            nilaiUas = uas;
        }

        Mahasiswa nilaiUtsTertinggi(Mahasiswa mhs[], int l, int r) {
            if (l == r) {
                return mhs[l];
            } else {
                int mid = (l+r) / 2;
                Mahasiswa left = nilaiUtsTertinggi(mhs, l, mid);
                Mahasiswa right = nilaiUtsTertinggi(mhs, mid+1, r);
                if (left.nilaiUts > right.nilaiUts) {
                    return left;
                } else {
                    return right;
                }

            }
        }

        Mahasiswa nilaiUtsTerendah(Mahasiswa mhs[], int l, int r) {
            if (l == r) {
                return mhs[l];
            } else {
                int mid = (l+r) / 2;
                Mahasiswa left = nilaiUtsTerendah(mhs, l, mid);
                Mahasiswa right = nilaiUtsTerendah(mhs, mid+1, r);
                if (left.nilaiUts < right.nilaiUts) {
                    return left;
                } else {
                    return right;
                }

            }
        }

        double rataRataUas (Mahasiswa mhs[]) {
            double sum = 0;
            for (int i = 0; i < mhs.length; i++) {
                sum += mhs[i].nilaiUas;
            }
            
            return sum / mhs.length;

        }


    
}
