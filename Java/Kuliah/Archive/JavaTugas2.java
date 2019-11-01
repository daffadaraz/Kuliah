import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JavaTugas2 {
    public static void main(String[] args){
//        Deklarasi Biodata
        JTextField nama = new JTextField(20);
        JTextField npm = new JTextField(8);
        JTextField kelas = new JTextField(5);        
//        Input Biodata ke dalam Object[]
        Object[] bio = {
            "Masukkan Nama  : ", nama,
            "Masukkan NPM   : ", npm,
            "Masukkan Kelas : ", kelas,
        };       
        int biodata = JOptionPane.showConfirmDialog(null, bio, "Biodata", JOptionPane.OK_CANCEL_OPTION);
        if (biodata == JOptionPane.OK_OPTION){
//            Deklarasi Perhitungan
              JTextField uangmsk = new JTextField(10);
              JTextField uangjjn1 = new JTextField(10);
              JTextField uangtrn1 = new JTextField(10);
              JTextField uangjjn2 = new JTextField(10);
              JTextField uangtrn2 = new JTextField(10);
              JTextField uangjjn3 = new JTextField(10);
              JTextField uangtrn3 = new JTextField(10);
              JTextField uangjjn4 = new JTextField(10);
              JTextField uangtrn4 = new JTextField(10);
              JTextField uangjjn5 = new JTextField(10);
              JTextField uangtrn5 = new JTextField(10);              
//              Input Uang ke dalam Object[]
              Object[] uang = {
                  "Uang Masuk ", uangmsk,
                  "Uang Jajan Hari Senin ", uangjjn1,
                  "Uang Transport Hari Senin ", uangtrn1,
                  "Uang Jajan Hari Selasa ", uangjjn2,
                  "Uang Transport Hari Selasa ", uangtrn2,
                  "Uang Jajan Hari Rabu ", uangjjn3,
                  "Uang Transport Hari Rabu ", uangtrn3,
                  "Uang Jajan Hari Kamis ", uangjjn4,
                  "Uang Transport Hari Kamis ", uangtrn4,
                  "Uang Jajan Hari Jumat ", uangjjn5,
                  "Uang Transport Hari Jumat ", uangtrn5,
              };
              int test = JOptionPane.showConfirmDialog(null, uang, "Kalkulasi Pengeluaran", JOptionPane.OK_CANCEL_OPTION);
              if (test == JOptionPane.OK_OPTION){
//                  Perhitungan Saldo, Batas, dan Total Uang Jajan + Uang Transport
                  double sumjjntrn = Integer.parseInt(uangjjn1.getText()) + Integer.parseInt(uangtrn1.getText())+
                                     Integer.parseInt(uangjjn2.getText()) + Integer.parseInt(uangtrn2.getText())+
                                     Integer.parseInt(uangjjn3.getText()) + Integer.parseInt(uangtrn3.getText())+
                                     Integer.parseInt(uangjjn4.getText()) + Integer.parseInt(uangtrn4.getText())+
                                     Integer.parseInt(uangjjn5.getText()) + Integer.parseInt(uangtrn5.getText());
                  double p = 0.25 * Integer.parseInt(uangmsk.getText());
                  String a;
                  if(sumjjntrn < p){
                      a = "HEMAT";
                  }else{
                      a = "BOROS";
                  }
//                  Output
                  JOptionPane.showMessageDialog(null, 
                          "Biodata Anda \n" + "Nama    : " + nama.getText() + "\n" + "NPM      : " + npm.getText() + "\n" + "Kelas    : " + kelas.getText(), 
                          "BIODATA", JOptionPane.INFORMATION_MESSAGE);
                  JOptionPane.showMessageDialog(null, "Jumlah Pengeluaran Anda : " + sumjjntrn + "\n" + "Batas : " + p + "\n" + a, "Pengeluaran", JOptionPane.INFORMATION_MESSAGE);                 
//                  Loop
                  int option = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Kembali Ke Awal?", "Kembali", JOptionPane.OK_CANCEL_OPTION);
                  if(option == JOptionPane.OK_OPTION){
                      main(args);
                  }
              }
       
        }
    }
}