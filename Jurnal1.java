import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Jurnal1 {
    public static void main(String[] args) {
        String nama, nim, kelas;

        //berimasukan nama
        Scanner MyName = new Scanner(System.in);
        System.out.print("Masukan Nama Anda : ");

        nama = MyName.next();
        System.out.println();

        //berimasukan nim
        Scanner MyNim = new Scanner(System.in);
        System.out.print("Masukan NIM Anda : ");

        nim = MyNim.next();
        System.out.println();

        //berimasukan kelas
        Scanner MyClass = new Scanner(System.in);
        System.out.print("Masukan Kelas Anda : ");

        kelas = MyClass.next();
        System.out.println();

        // cetak hasilnya
        System.out.print("Nama : " + nama + "\n");
        System.out.print("Nim : " + nim + "\n");
        System.out.print("Kelas : " + kelas + "\n");
    }
}
