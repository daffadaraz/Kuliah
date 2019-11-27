class switchc{
    public static void main(String[] args) {
        char inisial = 'M';
        String nama = null;
        switch(inisial){
            case 'A':
                nama = "Agung";
                break;
            case 'E':
                nama = "Eko";
                break;
            case 'F':
                nama = "Fikri";
                break;
            case 'M':
                nama = "Mahmud";
                break;
            case 'S':
                nama = "Syarif";
                break;
            case 'T':
                nama = "Toosa";
                break;
            case 'Y':
                nama = "Yudo";
                break;
            default:
                nama = "Siapa ini anjir.";
        }
        System.out.println("Nama Anda adalah : "+ nama);
    }
}