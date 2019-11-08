import java.util.Scanner;

public class uangArray {
    public static Scanner scan = new Scanner (System.in);
    public static String minggu[] = {"M1","M2","M3","M4"};
    public static String hari[] = {"Senin","Selasa","Rabu","Kamis","Jum'at"};

    public static int[][] InputUang(){
        int uang[][] = new int[minggu.length][hari.length];

        for(int s = 0; s < minggu.length; s++){
            System.out.println();
            System.out.println("Minggu ke - "+minggu[s]);
            for(int m = 0; m < hari.length ; m++){
                System.out.println();
                System.out.println(hari[m]);
                
                int ut = 0;
                int uj = 0;

                System.out.print("Uang Jajan     = ");
                ut = scan.nextInt();
                System.out.print("Uang Transport = ");
                uj = scan.nextInt();
                
                uang[s][m] = uj + ut;
            }
        }
        return uang;
    }

    public static void PrintUang(int[][] uang,int uangMasuk,String nama){
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
    
        for(int s = 0; s < minggu.length; s++){
            int total = 0;
            String status = "Boros";

            for(int i = 0; i < hari.length; i++){
                total += uang[s][i];
            }

            if(total < constraint){
                status = "Hemat";
            }

            System.out.format("%-10s%-15s%-15s%-15s%-15s%-15s%-15s%-15s",minggu[s],uang[s][0],uang[s][1],uang[s][2],uang[s][3],uang[s][4],total,status);
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        System.out.print("Nama Pelapor : ");
        String nama = scan.nextLine();

        System.out.print("Uang Masuk   : ");
        int uangMasuk = scan.nextInt();

        PrintUang(InputUang(),uangMasuk,nama);
        
        scan.close();
    }
}
