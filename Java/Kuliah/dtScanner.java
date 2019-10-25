/*
    Nama    : Daffa Daraz Aslam
    NPM     : 11117400
    Kelas   : 3KA88
*/
import java.util.Scanner;

public class dtScanner{
    public static void main(String[]args){
        Scanner dt = new Scanner (System.in);
        System.out.print("Nama  : ");
        dt.nextLine();
        System.out.print("NPM   : ");
        dt.nextLine();
        System.out.print("Kelas : ");
        dt.nextLine();
        System.out.println("--------");
        System.out.print("Bilangan 1   : ");
        int bil1 = dt.nextInt();
        System.out.print("Bilangan 2   : ");
        int bil2 = dt.nextInt();
        System.out.println("Penjumlahan : "+(bil1+bil2));
        System.out.println("Perkalian   : "+(bil1*bil2));
        dt.close();
    }
}