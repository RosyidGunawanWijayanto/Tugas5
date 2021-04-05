package pbo1;

class mahasiswa {
    private String nim;
    private String nama;
    protected String teori;
    protected String praktik;
 
    public String getNim() {
        return nim;
    }
 
    public void setNim(String nim) {
        this.nim = nim;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public String getTeori() {
        return teori;
    }
 
    public void setTeori(String teori) {
        this.teori = teori;
    }
 
    public String getPraktik() {
        return praktik;
    }
 
    public void setPraktik(String praktik) {
        this.praktik = praktik;
    }
 
}

    public class mhs{
    public static void main(String[] pbo1) {
        
        
        mahasiswa objekKelas_1 = new mahasiswa();
        objekKelas_1.setNim("IX A");
        objekKelas_1.setNama("Rosyid");
        objekKelas_1.setTeori("88");
        objekKelas_1.setPraktik("89");
 
        mahasiswa objekKelas_2 = new mahasiswa();
        objekKelas_2.setNim("IX B");
        objekKelas_2.setNama("Bejo");
        objekKelas_2.setTeori("75");
        objekKelas_2.setPraktik("75");
 
        
        String nim_1 = objekKelas_1.getNim();
        String nama_1 = objekKelas_1.getNama();
        String teori_1 = objekKelas_1.getTeori();
        String praktik_1 = objekKelas_1.getPraktik();
 
        String nim_2 = objekKelas_2.getNim();
        String nama_2 = objekKelas_2.getNama();
        String teori_2 = objekKelas_2.getTeori();
        String praktik_2 = objekKelas_2.getPraktik();
 
        
        System.out.println("NIM  : " + nim_1);
        System.out.println("Nama  : " + nama_1);
        System.out.println("Nilai Teori  : " + teori_1);
        System.out.println("Nilai Praktik  : " + praktik_1);

        System.out.println("NIM  : " + nim_2);
        System.out.println("Nama  : " + nama_2);
        System.out.println("Nilai Teori  : " + teori_2);
        System.out.println("Nilai Praktik  : " + praktik_2);
 
 
    }
}