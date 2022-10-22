public class panggil{
    public static void main(String[] args) {
        Person Anton = new Person();

        Anton.Nama = "Anton";
        Anton.JenisKelamin = "Laki-Laki";
        Anton.Umur = 18;
        System.out.println("Nama : " + Anton.Nama);
        System.out.println("Gender : " + Anton.JenisKelamin);
        System.out.println("Nama : " + Anton.Umur);
    
        Person Riko = new Person();

        Riko.Nama = "Riko";
        Riko.JenisKelamin = "Laki-Laki";
        Riko.Umur = 19;
        System.out.println("Nama : " + Riko.Nama);
        System.out.println("Gender : " + Riko.JenisKelamin);
        System.out.println("Nama : " + Riko.Umur);
    }
}