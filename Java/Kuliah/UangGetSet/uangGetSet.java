package UangGetSet;

import java.util.Scanner;

class biodata{
    String nama,npm,kelas;

    public biodata(String nama,String npm,String kelas){
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    public biodata(){
        this.nama = "";
        this.npm = "";
        this.kelas = "";
    }

    public String getKelas() {
        return kelas;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
    
}

class uang{
    int uangJajan,uangTransport;

    public uang(int uangJajan,int uangTransport){
        this.uangJajan = uangJajan;
        this.uangTransport = uangTransport;
    }

    public uang(){
        this.uangJajan = 0;
        this.uangTransport = 0;
    }

    public int getUangJajan() {
        return uangJajan;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangJajan(int uangJajan) {
        this.uangJajan = uangJajan;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }
}

public class uangGetSet{
    public static Scanner br = new Scanner (System.in);

    public static int pengeluaran(uang[] seminggu) {
        int sum = 0;
        for(int i = 0; i < 5 ; i++){
            sum += seminggu[i].getUangJajan();
            sum += seminggu[i].getUangTransport();
        }
        return sum;
    }

    public static String hematTidak(int uM, int pengeluaran){
        double constrain = uM * 0.25;
        if(pengeluaran <= constrain)
            return "Hemat";
        else
            return "BOROS";
    }

    public static biodata InputBiodata(){
        biodata bios = new biodata();
        System.out.print("Nama  : ");
        bios.setNama(br.nextLine());
        System.out.print("NPM   : ");
        bios.setNpm(br.nextLine());
        System.out.print("Kelas : ");
        bios.setKelas(br.nextLine());
        return bios;
    }

    public static uang[] InputUang(){
        uang senin = new uang();
        uang selasa = new uang();
        uang rabu = new uang();
        uang kamis = new uang();
        uang jumat = new uang();
        String hari[] = {"Senin","Selasa","Rabu","Kamis","Jum'at"};
        uang[] hariobj = {senin,selasa,rabu,kamis,jumat};
        for(int i = 0; i<5; i++){
            int l = i + 1;
            System.out.println("Hari ke - "+l+" ("+hari[i]+")");
            System.out.print("Uang Jajan     : ");
            hariobj[i].setUangJajan(br.nextInt());
            System.out.print("Uang Transport : ");
            hariobj[i].setUangTransport(br.nextInt());
            System.out.println();
        }
        uang[] seminggu = {senin,selasa,rabu,kamis,jumat};
        return seminggu;
    }

    public static void main(String[] args) {
        var bio = InputBiodata();
        System.out.println("--------------------------------");
        System.out.print("Uang Masuk : ");
        int uangMasuk = br.nextInt();
        var seminggu = InputUang();
        System.out.println("--------------------------------");
        System.out.println("Nama        : " + bio.getNama());
        System.out.println("NPM         : " + bio.getNpm());
        System.out.println("Kelas       : " + bio.getKelas());
        System.out.println("--------------------------------");
        System.out.println("Saldo       : " + (uangMasuk - pengeluaran(seminggu)));
        System.out.println("Pengeluaran : " + pengeluaran(seminggu));
        System.out.println("Constraint  : " + (uangMasuk * 0.25));
        System.out.println("Keterangan  : " + hematTidak(uangMasuk, pengeluaran(seminggu)));
    }
}
