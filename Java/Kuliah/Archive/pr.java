/*
    Nama    : Daffa Daraz Aslam
    NPM     : 11117400
    Kelas   : 3KA88
*/
import java.io.*;

public class pr{
    public static void main(String[]args) {
        String pil = "Y";

        Console dt = System.console();
        System.out.print("Nama  : ");
        dt.readLine();
        System.out.print("NPM   : ");
        dt.readLine();
        System.out.print("Kelas : ");
        dt.readLine();
        while(pil.equals("Y") || pil.equals("y") || pil.equals("Ya") || pil.equals("YA")){   
            System.out.println("--------");
            System.out.print("Uang Masuk : ");
            int um = Integer.parseInt(dt.readLine());
            System.out.println();

            int uj = 0;
            int ut = 0;
            String hari[] = {"Senin","Selasa","Rabu","Kamis","Jum'at"};
            for(int i = 0; i<5; i++){
                int l = i + 1;
                System.out.println("Hari ke - "+l+" ("+hari[i]+")");
                System.out.print("Uang Jajan     : ");
                uj += Integer.parseInt(dt.readLine());
                System.out.print("Uang Transport : ");
                ut += Integer.parseInt(dt.readLine());
                System.out.println();
            }
            int total = uj+ut;
            float cons = um/4;
            System.out.println("--------");
            System.out.println("Saldo");
            System.out.println("Total     : "+total);
            System.out.println("Constrain : "+cons);
            String ket;
            if(total > cons){
                ket = "BOROS";
            }
            else{
                ket = "HEMAT";
            }
            System.out.println("Keterangan : "+ket);    
            System.out.print("Input Lagi? (Ya/Tidak) : ");
            pil = dt.readLine();

        }
    }
}