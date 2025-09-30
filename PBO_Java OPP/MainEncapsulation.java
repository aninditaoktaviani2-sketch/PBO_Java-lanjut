package encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Anindita");
        mhs.setUmur(20);

        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Umur: " + mhs.getUmur());
    }
}
