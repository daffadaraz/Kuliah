import java.lang.reflect.Constructor;
import java.util.Scanner;

class minggu{
    // 5 = Senin Selasa Rabu Kamis Jum'at
    int uang[] = new int[5];

    public minggu() {
    }

    public minggu(int uang[]) {
        for(int i=0; i<uang.length ; i++){
            this.uang[i] = uang[i];
        }
    }
    
}

public class uangArray {
    public static Scanner scan = new Scanner (System.in);
    public static int mingguC = 1;
    public static String hari[] = {"Senin","Selasa","Rabu","Kamis","Jum'at"};

    public static minggu[] InputUang(){
        minggu m1 = new minggu();
        minggu m2 = new minggu();
        minggu m3 = new minggu();
        minggu m4 = new minggu();

        minggu[] sebulan = {m1,m2,m3,m4};

        for(int s = 0; s < mingguC; s++){
            System.out.println();
            System.out.println("Minggu ke - "+(s+1));
            for(int m = 0; m < hari.length ; m++){
                System.out.println();
                System.out.println(hari[m]);
                
                int ut = 0;
                int uj = 0;

                System.out.print("Uang Jajan     = ");
                ut = scan.nextInt();
                System.out.print("Uang Transport = ");
                uj = scan.nextInt();
                
                sebulan[s].uang[m] = uj + ut;
            }
        }
        return sebulan;
    }

    public static void PrintUang(minggu[] sebulan,int uangMasuk,String nama){
        double constraint = uangMasuk*0.25;

        System.out.println();
        System.out.println("Nama Pelapor : " + nama);
        System.out.println("Uang Masuk   : " + uangMasuk);
        System.out.println("Constraint   : " + constraint);
        System.out.println();
        System.out.println("DATA PENGELUARAN UANG");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.format("%-10s%-15s%-15s%-15s%-15s%-15s%-15s%-15s","Minggu","Senin","Selasa","Rabu","Kamis","Jum'at","Total","Status");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    
        for(int s = 0; s < mingguC; s++){
            int total = 0;
            String status = "Boros";

            for(int i = 0; i < hari.length; i++){
                total += sebulan[s].uang[i];
            }

            if(total < constraint){
                status = "Hemat";
            }

            System.out.format("%-10s%-15s%-15s%-15s%-15s%-15s%-15s%-15s",
                ("M"+(s+1)),
                sebulan[s].uang[0],
                sebulan[s].uang[1],
                sebulan[s].uang[2],
                sebulan[s].uang[3],
                sebulan[s].uang[4],
                total,status);

            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        String ulang = "Y";
        while(ulang.contains("Y") || ulang.contains("y")){
            System.out.println("\n---------------------------------");
            System.out.print("Jumlah Minggu (1..4) : ");
            mingguC = scan.nextInt(); scan.nextLine();
            if(mingguC < 1 || mingguC > 4){
                System.out.println("\nJumlah Minggu hanya 1 sampai 4");
                return;
            }
            
            System.out.print("Nama Pelapor : ");
            String nama = scan.nextLine();

            System.out.print("Uang Masuk   : ");
            int uangMasuk = scan.nextInt();

            PrintUang(InputUang(),uangMasuk,nama);
            
            scan.nextLine();
            System.out.println("\n");
            System.out.print("Ulang program ? (y/n) ");
            ulang = scan.nextLine();

        }
        scan.close();
    }
}
