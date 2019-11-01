public class uangKonstruktor{

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
        if(pengeluaran < constrain)
            return "Hemat";
        else
            return "BOROS";

    }

    public static void main(String[] args) {
        int uangMasuk = 1000000;
        uang senin = new uang(10000, 10000);
        uang selasa = new uang(10000, 10000);
        uang rabu = new uang(10000, 10000);
        uang kamis = new uang(10000, 10000);
        uang jumat = new uang(10000, 10000);
        uang[] seminggu = {senin,selasa,rabu,kamis,jumat};
        System.out.println("Pengeluaran : " + pengeluaran(seminggu));
        System.out.println("Saldo       : " + (uangMasuk - pengeluaran(seminggu)));
        System.out.println("Keterangan  : " + hematTidak(uangMasuk, pengeluaran(seminggu)));
    }
}
