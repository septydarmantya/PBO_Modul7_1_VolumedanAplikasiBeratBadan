
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Frame3 extends javax.swing.JFrame {
    String temp="";
    Double ti, bt, h1;
    
    
    public Frame3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ideal = new javax.swing.JTextField();
        Saran = new javax.swing.JTextField();
        Tinggi = new javax.swing.JTextField();
        LK = new javax.swing.JRadioButton();
        PR = new javax.swing.JRadioButton();
        Keluar = new javax.swing.JButton();
        Hitung = new javax.swing.JButton();
        Cobalagi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Berat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Hasil = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 120, 30);

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 290, 160, 20);

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jLabel3.setText("kg");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 250, 20, 20);

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jLabel4.setText("Tinggi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 60, 20);

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jLabel5.setText("Berat Badan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 140, 70, 20);

        Ideal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdealActionPerformed(evt);
            }
        });
        getContentPane().add(Ideal);
        Ideal.setBounds(170, 250, 40, 30);

        Saran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaranActionPerformed(evt);
            }
        });
        getContentPane().add(Saran);
        Saran.setBounds(20, 360, 340, 30);

        Tinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TinggiActionPerformed(evt);
            }
        });
        getContentPane().add(Tinggi);
        Tinggi.setBounds(130, 90, 40, 30);

        buttonGroup1.add(LK);
        LK.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        LK.setText("Laki-laki");
        getContentPane().add(LK);
        LK.setBounds(230, 170, 93, 23);

        buttonGroup1.add(PR);
        PR.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        PR.setText("Perempuan");
        getContentPane().add(PR);
        PR.setBounds(130, 170, 83, 29);

        Keluar.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(260, 210, 80, 29);

        Hitung.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        getContentPane().add(Hitung);
        Hitung.setBounds(50, 210, 80, 29);

        Cobalagi.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        Cobalagi.setText("Coba Lagi");
        Cobalagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobalagiActionPerformed(evt);
            }
        });
        getContentPane().add(Cobalagi);
        Cobalagi.setBounds(140, 210, 110, 29);

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 180, 80, 20);

        Berat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeratActionPerformed(evt);
            }
        });
        getContentPane().add(Berat);
        Berat.setBounds(130, 130, 40, 30);

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jLabel7.setText("Nama");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 60, 60, 20);

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jLabel8.setText("cm");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 100, 20, 20);

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jLabel9.setText("kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(170, 140, 20, 20);

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jLabel10.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 250, 160, 20);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama);
        Nama.setBounds(130, 50, 170, 30);

        Hasil.setEditable(false);
        Hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilActionPerformed(evt);
            }
        });
        getContentPane().add(Hasil);
        Hasil.setBounds(20, 320, 340, 30);

        setBounds(0, 0, 416, 444);
    }// </editor-fold>//GEN-END:initComponents

    private void IdealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdealActionPerformed

    private void SaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaranActionPerformed

    private void TinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TinggiActionPerformed

    private void BeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeratActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void HasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HasilActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        if(Nama.getText().equals("")||Berat.getText().equals("")
                ||Tinggi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data masukan harus diisi semua");
        }else if(PR.isSelected()||LK.isSelected()){
            try{
                Proses();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Inputan harus salah");
            }
        }else {
                JOptionPane.showMessageDialog(null, "Radio button harus dipilih");
        }    
    }//GEN-LAST:event_HitungActionPerformed

    private void CobalagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobalagiActionPerformed
        Nama.setText("");
        Tinggi.setText("");
        Berat.setText("");
        buttonGroup1.clearSelection();
        Ideal.setText("");
        Hasil.setText("");
        Saran.setText("");
    }//GEN-LAST:event_CobalagiActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Berat;
    private javax.swing.JButton Cobalagi;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField Ideal;
    private javax.swing.JButton Keluar;
    private javax.swing.JRadioButton LK;
    private javax.swing.JTextField Nama;
    private javax.swing.JRadioButton PR;
    private javax.swing.JTextField Saran;
    private javax.swing.JTextField Tinggi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        
        ti = Double.parseDouble(Tinggi.getText());
        bt = Double.parseDouble(Berat.getText());
        
        if (PR.isSelected()){
            h1 = (ti - 100) *1;
        }else if (LK.isSelected()){
            h1 = (ti - 104) * 1;
        }
        temp = Double.toString(h1.intValue());
        
        if (h1 < bt){
            Ideal.setText(temp);
            Hasil.setText("Maaf " + Nama.getText() + " ,Sepertinya anda Overweight");
            Saran.setText("Banyaklah berolahraga dan hindari makanan berkolestrol");
        } else if (h1 > bt){
            Ideal.setText(temp);
            Hasil.setText("Maaf " + Nama.getText() + " ,Sepertinya anda Underweight");
            Saran.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
        } else {
            Ideal.setText(temp);
            Hasil.setText("Hallo " + Nama.getText() + ", Berat badan anda sudah ideal");
            Saran.setText("Lanjutkan pola makan teratur dan gaya hidup sehat");
        }
        
        
    }
}
