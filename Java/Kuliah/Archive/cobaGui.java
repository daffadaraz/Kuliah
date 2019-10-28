/*
    Nama    : Daffa Daraz Aslam
    NPM     : 11117400
    Kelas   : 3KA88
*/
import javax.swing.JOptionPane;

public class cobaGui{
    public static void main(String[]args) {

        String nilai = JOptionPane.showInputDialog("TEST");
        int a = Integer.parseInt(nilai);
        JOptionPane.showMessageDialog(null, "Selamat.. Nilai Anda : "+a);
    }
}