public class uangMetode{
    static int uangJajan1,uangJajan2,
        uangJajan3,uangJajan4,
        uangJajan5;
    static int uangTransport1,uangTransport2,
        uangTransport3,uangTransport4,
        uangTransport5;
    static int uangMasuk,pengeluaran,saldo;

    public static void uang_Jajan(
        int IuangJajan1, int IuangJajan2,
        int IuangJajan3, int IuangJajan4,
        int IuangJajan5)
    {
        uangJajan1 = IuangJajan1;
        uangJajan2 = IuangJajan2;
        uangJajan3 = IuangJajan3;
        uangJajan4 = IuangJajan4;
        uangJajan5 = IuangJajan5;
    }

    public static void uang_Transport(
        int IuangTransport1, int IuangTransport2,
        int IuangTransport3, int IuangTransport4,
        int IuangTransport5)
    {
        uangTransport1 = IuangTransport1;
        uangTransport2 = IuangTransport2;
        uangTransport3 = IuangTransport3;
        uangTransport4 = IuangTransport4;
        uangTransport5 = IuangTransport5;
    }

    public static int Pengeluaran() {
        return uangJajan1+uangJajan2+
                uangJajan3+uangJajan4+
                uangJajan5 + uangTransport1+
                uangTransport2+uangTransport3+
                uangTransport4+uangTransport5;
    }

    public static int Saldo(){
        return uangMasuk - pengeluaran;
    }
    
    public static String hematTidak(int penge){
        double constrain = uangMasuk * 0.25;
        System.out.println("Constraint : "+constrain);
        if(penge < constrain)
            return "Hemat";
        else
            return "Boros";
    }
    public static void main(String[] args) {
        uangMasuk = 1000000;
        uang_Jajan(10000, 10000, 10000, 10000, 10000);
        uang_Transport(10000, 10000, 10000, 10000, 10000);
        pengeluaran = Pengeluaran();
        saldo = Saldo();
        System.out.println("Pengeluaran : "+pengeluaran);
        System.out.println("Saldo : "+saldo);
        System.out.println(hematTidak(pengeluaran));
    }
}