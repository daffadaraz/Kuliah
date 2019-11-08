import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah Data : ");
        int juml = scan.nextInt();
        String[] nama = new String[juml];
        int[] tugas = new int[juml];
        int[] ujian = new int[juml];

        for(int i = 0; i < juml ; i++){
            System.out.println("File ke-"+(i+1));
            scan.nextLine();
            System.out.print("Nama : ");
            nama[i] = scan.nextLine();
            System.out.print("Nilai Tugas : ");
            tugas[i] = scan.nextInt();
            System.out.print("Nilai Ujian : ");
            ujian[i] = scan.nextInt();
        }

        System.out.println("-----------------------------------------");
        System.out.format("%-5s%-15s%-15s%-15s","No.","Nama","Tugas","Ujian");
        System.out.println();
        System.out.println("-----------------------------------------");
        for(int i = 0; i< juml ; i++){
            System.out.format("%-5s%-15s%-15s%-15s",(i+1),nama[i],tugas[i],ujian[i]);
            System.out.println();
        }
        System.out.println("-----------------------------------------");
        scan.close();
    }
}
