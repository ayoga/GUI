/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Kuis2 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis2
     */
    public Kuis2() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Diskon = new javax.swing.JTextField();
        Harga1 = new javax.swing.JTextField();
        Harga2 = new javax.swing.JTextField();
        Harga3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        Harga4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(158, 11, 80, 14);

        jLabel2.setText("Diskon");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 170, 80, 20);

        jLabel3.setText("Harga Barang1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 50, 90, 20);

        jLabel4.setText("Harga Barang2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 80, 90, 20);

        jLabel5.setText("Harga Barang3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 110, 90, 20);
        getContentPane().add(Diskon);
        Diskon.setBounds(140, 160, 130, 30);
        getContentPane().add(Harga1);
        Harga1.setBounds(140, 40, 130, 30);
        getContentPane().add(Harga2);
        Harga2.setBounds(140, 70, 130, 30);
        getContentPane().add(Harga3);
        Harga3.setBounds(140, 100, 130, 30);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 200, 73, 23);

        jButton2.setText("Proses");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 200, 65, 23);

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 200, 73, 23);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 230, 240, 290);

        jLabel6.setText("Harga Barang4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 140, 90, 20);
        getContentPane().add(Harga4);
        Harga4.setBounds(140, 130, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int Hargabarang1 = Integer.parseInt(Harga1.getText());
        int HargaBarang2 = Integer.parseInt(Harga2.getText());
        int HargaBarang3 = Integer.parseInt(Harga3.getText());
        int HargaBarang4 = Integer.parseInt(Harga4.getText());
        int TotalHarga = Hargabarang1+HargaBarang2+HargaBarang3+HargaBarang4;
        int dskon = Integer.parseInt(Diskon.getText());
        
        int TotalBayar = TotalHarga*dskon/100;
        
        TA.setText("Harga Barang 1 :"+Hargabarang1+"\n"+"Harga Barang 2 :"+HargaBarang2+"\n"+"Harga Barang 3 :"+HargaBarang3+"\n"+"Harga Barang 4 :"+HargaBarang4+"\n"+"Diskon anda :"+dskon+"\n"+"Total Harga : "+TotalHarga+"\n"+"Total Bayar :"+TotalBayar)  ;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
TA.setText("");
        Harga1.setText("");
        Harga2.setText("");
        Harga3.setText("");
        Diskon.setText("");
        Diskon.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Diskon;
    private javax.swing.JTextField Harga1;
    private javax.swing.JTextField Harga2;
    private javax.swing.JTextField Harga3;
    private javax.swing.JTextField Harga4;
    private javax.swing.JTextArea TA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
