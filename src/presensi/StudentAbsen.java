/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presensi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Yessy
 */
public class StudentAbsen extends javax.swing.JFrame {

    /**
     * Creates new form StudentAbsen
     */
      String nol_jam ="";
String nol_menit = "";
String nol_detik = "";


 int uid = UserSession.getU_uid();
 String nim = UserSession.getU_nim();
 String level = UserSession.getU_level();
 int id_matkul = UserSession.getU_id_matkul();
    String nama_matkul = UserSession.getU_matkul();
    public StudentAbsen() {
        initComponents();
         tampil_matkul(nama_matkul);
         if(nama_matkul != ""){
             jTextField1.setText("");
             jTextField1.setEditable(true);
             jLabel1.setVisible(false);
             jTextField1.setVisible(false);
         } else{
             jLabel1.setVisible(true);
             jTextField1.setVisible(true);
             jTextField1.setText(String.valueOf(nim));
             jTextField1.setEditable(false);
         }
          setJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labeljam = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttanggal = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe WP Semibold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TAP");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(110, 180, 144, 32);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(50, 80, 270, 380);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 500, 0, 0);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Arrows-Back-icon.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 500, 70, 30);

        labeljam.setText("jam");
        jPanel1.add(labeljam);
        labeljam.setBounds(230, 500, 140, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 390, 540);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Segoe WP Semibold", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-PILIH-" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(50, 150, 290, 48);

        jComboBox3.setFont(new java.awt.Font("Segoe WP Semibold", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-PILIH-" }));
        jPanel2.add(jComboBox3);
        jComboBox3.setBounds(50, 250, 290, 48);

        jComboBox4.setFont(new java.awt.Font("Segoe WP Semibold", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-PILIH-", "01", "02", "03", "04", "05" }));
        jPanel2.add(jComboBox4);
        jComboBox4.setBounds(50, 350, 290, 47);

        jLabel1.setFont(new java.awt.Font("Segoe WP Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(49, 16, 144, 32);

        jLabel2.setFont(new java.awt.Font("Segoe WP Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ROOM");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 210, 77, 32);

        jLabel3.setFont(new java.awt.Font("Segoe WP Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SUBJECT");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(49, 113, 102, 32);

        jLabel4.setFont(new java.awt.Font("Segoe WP Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATE");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 420, 62, 32);

        txttanggal.setBackground(new java.awt.Color(255, 204, 51));
        txttanggal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txttanggal);
        txttanggal.setBounds(50, 460, 310, 50);

        jLabel11.setFont(new java.awt.Font("Segoe WP Semibold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("READER");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(50, 310, 93, 32);

        jTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(50, 60, 290, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(390, 0, 380, 540);

        setSize(new java.awt.Dimension(788, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
          Student A = new Student();
                    A.setVisible(true);
                    setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        tampil_kelas(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        boolean isLectureTap;

        int id_matkul_selected = 0, uid_selected = 0;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tgl = dateFormat.format(txttanggal.getDate());

        try
        {
            KoneksiDB a =new KoneksiDB();
            String sql = "select * from matkul where nama_matkul = '"+jComboBox1.getSelectedItem().toString()+"'";
            ResultSet res= a.executeQuery(sql);
            while(res.next())
            {
                id_matkul_selected = res.getInt("id_matkul");
            }
        }
        catch(Exception ex)
        {

        }
        if(nama_matkul == ""){
            isLectureTap = cekLectureTap(jComboBox1.getSelectedItem().toString(),tgl);
        } else{
            isLectureTap = true;
        }
        if(isLectureTap) {
            if(nama_matkul == ""){
                try
                {
                    KoneksiDB a2 =new KoneksiDB();
                    String sql2 = "select * from pengguna where nim ="+jTextField1.getText();
                    ResultSet res2= a2.executeQuery(sql2);
                    while(res2.next())
                    {
                        uid_selected = res2.getInt("uid");
                    }
                }
                catch(Exception ex)
                {

                }
            } else{
                uid_selected = UserSession.getU_uid();
            }
            if ( "".equals(tgl)|| "".equals(jComboBox1.getSelectedItem().toString())|| "".equals(jComboBox3.getSelectedItem().toString())|| "".equals(jComboBox4.getSelectedItem().toString()))
            {JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);

            }
            int j = 0;
            String jam = getCurrentTimeUsingDate();

            String SQL = "INSERT INTO absensi (uid,id_matkul,kelas_absensi,reader,tanggal,jam_absensi)"
            + "VALUES ('"+uid_selected
            +"','"+id_matkul_selected
            +"','"+jComboBox3.getSelectedItem().toString()
            +"','"+jComboBox4.getSelectedItem().toString()
            +"','"+tgl
            +"','"+jam+"')";

            int status = KoneksiDB.execute(SQL);
            if (status == 1 ){
                JOptionPane.showMessageDialog(this, "Tapping data berhasil","Sukses",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(this, "Tapping data gagal","Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(this, "Tapping data gagal, dosen anda belum hadir(tapping)","Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanel3MouseClicked
       
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
            java.util.logging.Logger.getLogger(StudentAbsen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAbsen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAbsen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAbsen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAbsen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labeljam;
    private com.toedter.calendar.JDateChooser txttanggal;
    // End of variables declaration//GEN-END:variables
public void tampil_matkul(String nama_matkul)
    {
        if(nama_matkul == ""){
        try
        {
            KoneksiDB a =new KoneksiDB();
            String sql = "select * from matkul INNER JOIN jadwal_matkul ON jadwal_matkul.id_matkul=matkul.id_matkul where jadwal_matkul.uid = "+UserSession.getU_uid();
            ResultSet res= a.executeQuery(sql);
            while(res.next())
            {
                jComboBox1.addItem(res.getString("nama_matkul"));
            }
        }
        catch(Exception ex)
        {
            
        }
        } else{
            jComboBox1.addItem(nama_matkul);
        
        }
        }
public void tampil_kelas(String nama_matkul)
    {
        jComboBox3.removeAllItems();
        try
        {
            KoneksiDB a =new KoneksiDB();
            String sql = "select * from matkul inner join jadwal_matkul on jadwal_matkul.id_matkul = matkul.id_matkul where matkul.nama_matkul = '"+nama_matkul+"' group by kelas_matkul";
            ResultSet res= a.executeQuery(sql);
            while(res.next())
            {
                jComboBox3.addItem(res.getString("kelas_matkul"));
            }
        }
        catch(Exception ex)
        {
            
        }
        
        }
  

   
    private void foo(String matkul_selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setJam() {
           ActionListener taskPerformer;
        taskPerformer = new ActionListener(){
            String nol_hour,nol_minute,nol_sec;
            public void actionPerformed(ActionEvent evt){
                Date dt=new Date();
                int hour=dt.getHours();
                int minute=dt.getMinutes();
                int sec=dt.getSeconds();
                if (hour<=9) {
                    nol_hour="0";
                }
                if(minute<=9){
                    nol_minute="0";
                }
                if(sec<=9){
                    nol_sec="0";
                }
                String jam=Integer.toString(hour);
                String menit=Integer.toString(minute);
                String detik=Integer.toString(sec);
                labeljam.setText(jam+" : "+menit+" : "+detik);
            }

        };
        new Timer(100, taskPerformer).start();//To change body of generated methods, choose Tools | Templates.
    }
    public static String getCurrentTimeUsingDate() {
        Calendar cal = Calendar.getInstance();
        Date date=cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedDate=dateFormat.format(date);
        return formattedDate;
    }
    
   
    public static boolean cekLectureTap(String nama_matkul, String tanggal_tap){
        boolean isTap = false;
        int uid_lecture = 0,id_matkul = 0;
        try
        {
            KoneksiDB a =new KoneksiDB();
            String sql = "select * from matkul where nama_matkul = '"+nama_matkul+"'";
            ResultSet res= a.executeQuery(sql);
            while(res.next())
            {
               uid_lecture = res.getInt("uid"); 
               id_matkul = res.getInt("id_matkul");

            }
        }
        catch(Exception ex)
        {
            
        }
        try
        {
            KoneksiDB a =new KoneksiDB();
            String sql = "select * from absensi where uid = '"+uid_lecture+"' and id_matkul ='"+id_matkul+"' and tanggal='"+tanggal_tap+"'";
            ResultSet res= a.executeQuery(sql);
            int i = 0;
            while (res.next()) {
            i++;
            }
            res.last(); //mengecek jumlah baris pada hasil query
            if(res.getRow()>=1){
                isTap = true;
            }
        }
        catch(Exception ex)
        {
            
        }
        return isTap;
    }

}
