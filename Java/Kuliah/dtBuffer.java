/*
    Nama    : Daffa Daraz Aslam
    NPM     : 11117400
    Kelas   : 3KA88
*/
import java.io.*;

public class dtBuffer{
    public static void main(String[]args) throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dt = new BufferedReader(isr); //br
        System.out.print("Nama  : ");
        dt.readLine();
        System.out.print("NPM   : ");
        dt.readLine();
        System.out.print("Kelas : ");
        dt.readLine();
        System.out.println("--------");
        System.out.print("Bilangan 1   : ");
        int bil1 = Integer.parseInt(dt.readLine());
        System.out.print("Bilangan 2   : ");
        int bil2 = Integer.parseInt(dt.readLine());
        System.out.println("Penjumlahan : "+(bil1+bil2));
        System.out.println("Perkalian   : "+(bil1*bil2));
    }
}