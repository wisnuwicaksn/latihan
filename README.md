1. Membuat file Person :

public class Person{
    String Nama, JenisKelamin;
    int Umur;
}

https://user-images.githubusercontent.com/92707545/197341465-3b2d1abd-9f32-45b8-a875-511de2852253.png

2. Membuat objek :

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
}# latihan
