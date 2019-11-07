import javax.lang.model.type.ArrayType;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class prGui {
    public static boolean InputanTidakKosong(Object[] obj){
        for (Object arrayItem : obj){
            if(arrayItem instanceof JTextField){
                JTextField arrayItemString = (JTextField) arrayItem;
                String temp = arrayItemString.getText();
                if(temp.equals("")){
                    JOptionPane.showMessageDialog(null, "Tolong Input Semua TextBox terlebih dahulu");
                    return false;
                }
            }
        }
        return true;
    }
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
        if (biodata == JOptionPane.OK_OPTION && InputanTidakKosong(bio)){
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
                  "--Senin--",
                  "Uang Jajan ", uangjjn1,
                  "Uang Transport ", uangtrn1,
                  "--Selasa--",
                  "Uang Jajan", uangjjn2,
                  "Uang Transport", uangtrn2,
                  "--Rabu--",
                  "Uang Jajan", uangjjn3,
                  "Uang Transport", uangtrn3,
                  "--Kamis--",
                  "Uang Jajan", uangjjn4,
                  "Uang Transport", uangtrn4,
                  "--Jum'at--",
                  "Uang Jajan", uangjjn5,
                  "Uang Transport", uangtrn5,
              };
              int test = JOptionPane.showConfirmDialog(null, uang, "Kalkulasi Pengeluaran", JOptionPane.OK_CANCEL_OPTION);
              if (test == JOptionPane.OK_OPTION && InputanTidakKosong(uang)){
//                  Perhitungan Saldo, Batas, dan Total Uang Jajan + Uang Transport
                  double sum = 0;
                  for (Object arrayItem : uang){
                      if(arrayItem instanceof JTextField){
                          JTextField arrayItemString = (JTextField) arrayItem;
                          String temp = arrayItemString.getText();
                          int nilai = Integer.parseInt(temp);
                          sum += nilai;
                      }
                  }

                  sum = sum - Integer.parseInt(uangmsk.getText());
                  double batas = 0.25 * Integer.parseInt(uangmsk.getText());
                  String a;
                  if(sum < batas){
                      a = "HEMAT";
                  }else{
                      a = "BOROS";
                  }
//                  Output
                  JOptionPane.showMessageDialog(null, 
                          "Biodata Anda \n" + "Nama    : " + nama.getText() + "\n" + "NPM      : " + npm.getText() + "\n" + "Kelas    : " + kelas.getText(), 
                          "BIODATA", JOptionPane.INFORMATION_MESSAGE);
                  JOptionPane.showMessageDialog(null, "Jumlah Pengeluaran Anda : " + sum + "\n" + "Batas : " + batas + "\n" + a, "Pengeluaran", JOptionPane.INFORMATION_MESSAGE);                 
//                  Loop
                  int option = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Kembali Ke Awal?", "Kembali", JOptionPane.OK_CANCEL_OPTION);
                  if(option == JOptionPane.OK_OPTION){
                      main(args);
                  }
              }
       
        }
    }
}