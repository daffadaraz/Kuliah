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

    /**
     * @return the kelas
     */
    public String getKelas() {
        return kelas;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the npm
     */
    public String getNpm() {
        return npm;
    }

    /**
     * @param kelas the kelas to set
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param npm the npm to set
     */
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
}

public class uangGetSet{
    public static Scanner br = new Scanner (System.in);

    public static int pengeluaran(uang[] seminggu) {
        int sum = 0;
        for(int i = 0; i < 5 ; i++){
            sum += seminggu[i].uangJajan;
            sum += seminggu[i].uangTransport;
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
        String nama,npm,kelas;
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
        int uj[] = {0,0,0,0,0};
        int ut[] = {0,0,0,0,0};
        String hari[] = {"Senin","Selasa","Rabu","Kamis","Jum'at"};
        for(int i = 0; i<5; i++){
            int l = i + 1;
            System.out.println("Hari ke - "+l+" ("+hari[i]+")");
            System.out.print("Uang Jajan     : ");
            uj[i] = br.nextInt();
            System.out.print("Uang Transport : ");
            ut[i] = br.nextInt();
            System.out.println();
        }
        uang senin = new uang(ut[0], uj[0]);
        uang selasa = new uang(ut[1], uj[1]);
        uang rabu = new uang(ut[2], uj[2]);
        uang kamis = new uang(ut[3], uj[3]);
        uang jumat = new uang(ut[4], uj[4]);
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
        System.out.println("Nama        : " + bio.nama);
        System.out.println("NPM         : " + bio.npm);
        System.out.println("Kelas       : " + bio.kelas);
        System.out.println("--------------------------------");
        System.out.println("Saldo       : " + (uangMasuk - pengeluaran(seminggu)));
        System.out.println("Pengeluaran : " + pengeluaran(seminggu));
        System.out.println("Constraint  : " + (uangMasuk * 0.25));
        System.out.println("Keterangan  : " + hematTidak(uangMasuk, pengeluaran(seminggu)));
    }
}
