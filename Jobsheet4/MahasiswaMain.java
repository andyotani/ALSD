public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa mhs[] = new Mahasiswa[8];
        mhs[0] = new Mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        mhs[1] = new Mahasiswa("Budi", "220101002", 2022, 85, 88);
        mhs[2] = new Mahasiswa("Cindy", "220101003", 2021, 90, 87);
        mhs[3] = new Mahasiswa("Dian", "220101004", 2021, 76, 79);
        mhs[4] = new Mahasiswa("Eko", "220101005", 2023, 92, 95);
        mhs[5] = new Mahasiswa("Fajar", "220101006", 2020, 88, 85);
        mhs[6] = new Mahasiswa("Gina", "220101007", 2023, 80, 83);
        mhs[7] = new Mahasiswa("Hadi", "220101008", 2020, 82, 84);

        Mahasiswa mhsUtsTertinggi = new Mahasiswa();
        System.out.println("Mahasiswa dengan nilai uts tertinggi : " + mhsUtsTertinggi.nilaiUtsTertinggi(mhs, 0, (mhs.length - 1)).nama);
        System.out.println("Dengan Nilai : " + mhsUtsTertinggi.nilaiUtsTertinggi(mhs, 0, (mhs.length - 1)).nilaiUts);

        System.out.println();

        Mahasiswa mhsUtsTerendah = new Mahasiswa();
        System.out.println("Mahasiswa dengan nilai uts tertinggi : " + mhsUtsTerendah.nilaiUtsTerendah(mhs, 0, (mhs.length - 1)).nama);
        System.out.println("Dengan Nilai : " + mhsUtsTerendah.nilaiUtsTerendah(mhs, 0, (mhs.length - 1)).nilaiUts);

        System.out.println();
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println("rata - rata nilai UAS : " + mahasiswa.rataRataUas(mhs));
    }
}
