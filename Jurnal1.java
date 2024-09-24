import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Jurnal1 {
    public static void main(String[] args) {

        //add hello world
        System.out.println("Hello World!!");

        Object nama, nim, kelas;

        System.out.println("Masukan data mahasiswa anda");

        //berimasukan nama
        Scanner MyName = new Scanner(System.in);
        System.out.print("Masukan Nama Anda : ");

        nama = MyName.next();

        //berimasukan nim
        Scanner MyNim = new Scanner(System.in);
        System.out.print("Masukan NIM Anda : ");

        nim = MyNim.next();

        //berimasukan kelas
        Scanner MyClass = new Scanner(System.in);
        System.out.print("Masukan Kelas Anda : ");

        kelas = MyClass.next();
        System.out.println();
        System.out.println("Data diri mahasiswa : " + "\n");

        // cetak hasilnya
        System.out.print("Nama : " + nama + "\n");
        System.out.print("Nim : " + nim + "\n");
        System.out.print("Kelas : " + kelas + "\n");
    }
}
