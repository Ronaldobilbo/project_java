/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbodealer;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class dataservis extends javax.swing.JFrame {
public String kode_montir="";
    public Connection con;
    public ResultSet rs;
    public Statement stat;
    public String sql="";
    /**
     * Creates new form dataservis
     */
    public dataservis() {
        initComponents();
         koneksidatabase db =new koneksidatabase();
        db.koneksidatabase();
        con=db.con;
        rs=db.rs;
        stat=db.stat;
        tabeldataservis();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        laporandataservis = new javax.swing.JLabel();
        no = new javax.swing.JLabel();
        kodemontir = new javax.swing.JLabel();
        nofaktur = new javax.swing.JLabel();
        noplat = new javax.swing.JLabel();
        namacustomer = new javax.swing.JLabel();
        biayaservis = new javax.swing.JLabel();
        idcustomer = new javax.swing.JLabel();
        namamontir = new javax.swing.JLabel();
        tanggalservis = new javax.swing.JLabel();
        Tbiaya = new javax.swing.JTextField();
        Tno = new javax.swing.JTextField();
        Tfaktur = new javax.swing.JTextField();
        Ttanggal = new javax.swing.JTextField();
        Tmontir = new javax.swing.JTextField();
        Tidcustomer = new javax.swing.JTextField();
        Tnamacustomer = new javax.swing.JTextField();
        Tplat = new javax.swing.JTextField();
        Ckode = new javax.swing.JComboBox<>();
        Tkode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Cdata = new javax.swing.JComboBox<>();
        exit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldataservis = new javax.swing.JTable();
        search = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 690, -1));

        laporandataservis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        laporandataservis.setText("LAPORAN DATA SERVIS");
        jPanel1.add(laporandataservis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        no.setText("NO");
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        kodemontir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kodemontir.setForeground(new java.awt.Color(255, 255, 255));
        kodemontir.setText("KODE MONTIR");
        jPanel1.add(kodemontir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        nofaktur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nofaktur.setText("NO FAKTUR");
        jPanel1.add(nofaktur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        noplat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noplat.setForeground(new java.awt.Color(255, 255, 255));
        noplat.setText("NO PLAT");
        jPanel1.add(noplat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        namacustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namacustomer.setForeground(new java.awt.Color(255, 255, 255));
        namacustomer.setText("NAMA CUSTOMER");
        jPanel1.add(namacustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        biayaservis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        biayaservis.setForeground(new java.awt.Color(255, 255, 255));
        biayaservis.setText("BIAYA SERVIS");
        jPanel1.add(biayaservis, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        idcustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idcustomer.setForeground(new java.awt.Color(255, 255, 255));
        idcustomer.setText("ID CUSTOMER");
        jPanel1.add(idcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        namamontir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namamontir.setForeground(new java.awt.Color(255, 255, 255));
        namamontir.setText("NAMA MONTIR");
        jPanel1.add(namamontir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        tanggalservis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tanggalservis.setText("TANGGAL ");
        jPanel1.add(tanggalservis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        Tbiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbiayaActionPerformed(evt);
            }
        });
        jPanel1.add(Tbiaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 170, 30));

        Tno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnoActionPerformed(evt);
            }
        });
        jPanel1.add(Tno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 170, 30));

        Tfaktur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfakturActionPerformed(evt);
            }
        });
        jPanel1.add(Tfaktur, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 170, 30));

        Ttanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtanggalActionPerformed(evt);
            }
        });
        jPanel1.add(Ttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, 30));

        Tmontir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TmontirActionPerformed(evt);
            }
        });
        jPanel1.add(Tmontir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 170, 30));

        Tidcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidcustomerActionPerformed(evt);
            }
        });
        jPanel1.add(Tidcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 170, 30));

        Tnamacustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnamacustomerActionPerformed(evt);
            }
        });
        jPanel1.add(Tnamacustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 170, 30));

        Tplat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TplatActionPerformed(evt);
            }
        });
        jPanel1.add(Tplat, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 170, 30));

        Ckode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "J001", "J002", "J003", "J004", "J005", "K001", "K002", "K003", "K004", "K005" }));
        Ckode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CkodeActionPerformed(evt);
            }
        });
        jPanel1.add(Ckode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 170, 30));
        jPanel1.add(Tkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 170, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CARI DATA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 70, -1));

        Cdata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "J001", "J002", "J003", "J004", "J005", "K001", "K002", "K003", "K004", "K005" }));
        Cdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdataActionPerformed(evt);
            }
        });
        jPanel1.add(Cdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 170, 30));

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 70, 50));

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 70, 50));

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, 50));

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 400, 80, 50));

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 70, 50));

        tabeldataservis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeldataservis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataservisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldataservis);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 690, 130));

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 80, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 530));

        Menu.setText("Menu");

        jMenuItem2.setText("customer");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Menu.add(jMenuItem2);

        jMenuItem3.setText("montir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Menu.add(jMenuItem3);

        jMenuItem4.setText("motor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Menu.add(jMenuItem4);

        jMenuBar1.add(Menu);

        jMenu2.setText("Laporan");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TbiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TbiayaActionPerformed

    private void TnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnoActionPerformed

    private void TfakturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfakturActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfakturActionPerformed

    private void TtanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtanggalActionPerformed

    private void TmontirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TmontirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TmontirActionPerformed

    private void TidcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidcustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TidcustomerActionPerformed

    private void TnamacustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnamacustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnamacustomerActionPerformed

    private void TplatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TplatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TplatActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
try {
     sql ="insert into tbdataservis values('"+
             Tno.getText()+"','"+
             Tfaktur.getText()+"','"+
             Ckode.getSelectedItem()+"','"+
             Tmontir.getText()+"','"+
             Ttanggal.getText()+"','"+
             Tidcustomer.getText()+"','"+
             Tnamacustomer.getText()+"','"+
             Tplat.getText()+"','"+
             Tbiaya.getText()+"')";
         stat=con.createStatement();
            stat.execute(sql);
        Tno.setText("");
        Tfaktur.setText("");
        Ckode.setSelectedIndex(0);
        Tmontir.setText("");
        Ttanggal.setText("");
        Tidcustomer.setText("");
        Tnamacustomer.setText("");
        Tplat.setText("");
        Tbiaya.setText("");
        JOptionPane.showMessageDialog(rootPane, "Data Telah Disimpan");
    } catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Disimpan, Tidak dapat duplicate data");
        } 
      tabeldataservis();    // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
 try {
            sql="delete from tbdataservis where nofaktur='"+
                      Tfaktur.getText()+"'";
            stat=con.createStatement();
            stat.execute(sql);
            Tfaktur.setText("");
             Ckode.setVisible(true);
            Tkode.setVisible(false);
            Ckode.setSelectedIndex(0);
            Tno.setText("");
             Tfaktur.setText("");
             Tmontir.setText("");
               Ttanggal.setText("");
               Tidcustomer.setText("");
               Tnamacustomer.setText("");
               Tplat.setText("");
               Tbiaya.setText("");
            JOptionPane.showMessageDialog(rootPane, "data telah dihapus");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Dihapus"+e);
        }
             tabeldataservis();         // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
    try {
    sql="update tbdataservis set nofaktur='"+
        Tfaktur.getText()+"',kodemontir='"+
        Tkode.getText()+"',namamontir='"+
        Tmontir.getText()+"',tanggalservis='"+
        Ttanggal.getText()+"',idcustomer='"+
            Tidcustomer.getText()+"',namacustomer='"+
            Tnamacustomer.getText()+"',noplat='"+
            Tplat.getText()+"',biayaservis='"+
             Tbiaya.getText()+"' where no='"+
        Tno.getText()+"'";
  stat=con.createStatement();
  stat.execute(sql);
            
  JOptionPane.showMessageDialog(rootPane, "data telah di edit");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "data gagal di edit"+e);
        }
        tabeldataservis();        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void tabeldataservisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataservisMouseClicked
 Tno.setText(tabeldataservis.getValueAt(tabeldataservis.getSelectedRow(), 0).toString());
        Tfaktur.setText(tabeldataservis.getValueAt(tabeldataservis.getSelectedRow(), 1).toString());
        Tkode.setText(tabeldataservis.getValueAt(tabeldataservis.getSelectedRow(), 2).toString());
        Tmontir.setText(tabeldataservis.getValueAt(tabeldataservis.getSelectedRow(), 3).toString());
        Ttanggal.setText(tabeldataservis.getValueAt(tabeldataservis.getSelectedRow(), 4).toString());
         Tidcustomer.setText(tabeldataservis.getValueAt(tabeldataservis.getSelectedRow(), 5).toString());
        Tnamacustomer.setText(tabeldataservis.getValueAt(tabeldataservis.getSelectedRow(), 6).toString());
        Tplat.setText(tabeldataservis.getValueAt(tabeldataservis.getSelectedRow(), 7).toString());
        Tbiaya.setText(tabeldataservis.getValueAt(tabeldataservis.getSelectedRow(), 8).toString());
        Ckode.setVisible(false);     // TODO add your handling code here:
        Tkode.setVisible(true);
    }//GEN-LAST:event_tabeldataservisMouseClicked

    private void CkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CkodeActionPerformed
kode_montir = (String) Ckode.getSelectedItem();
        if (kode_montir == "J001"){
            Tmontir.  setText ("Rafael");
        }
        
        else if (kode_montir == "J002"){
            Tmontir.  setText ("Gerry");
        }
        
        else if (kode_montir == "J003"){
            Tmontir.  setText ("Jonathan");
        }

        else if (kode_montir == "J004"){
            Tmontir.  setText ("Frizzy");
        }
        
        else if (kode_montir == "J005"){
            Tmontir.  setText ("Marco");
        }
        
        else if (kode_montir == "K001"){
            Tmontir.  setText ("Bilbo");
        }
        
        else if (kode_montir == "K002"){
            Tmontir.  setText ("Theoria");  
        }
        
        else if (kode_montir == "K003"){
            Tmontir.  setText ("Ricky");
        }
        
        else if (kode_montir == "K004"){
            Tmontir.  setText ("Richard");
        }
        
        else if (kode_montir == "K005"){
            Tmontir.  setText ("Fernando");
        }       
    }//GEN-LAST:event_CkodeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
 Tno.setText("");
        Tfaktur.setText("");
        Ckode.setSelectedIndex(0);
        Tmontir.setText("");
        Ttanggal.setText("");
        Tidcustomer.setText("");
        Tnamacustomer.setText("");
        Tplat.setText("");
        Tbiaya.setText("");  
        Ckode.setVisible(true);
        Tkode.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
try {
            sql="select * from tbdataservis where kodemontir='"+
            Cdata.getSelectedItem()+"'";
            stat=con.createStatement();
            rs=stat.executeQuery(sql);
            if (rs.next()) {
                Tno.setText(rs.getString("no"));
                Tfaktur.setText(rs.getString("nofaktur"));
                Tkode.setText(rs.getString("kodemontir"));
                Tmontir.setText(rs.getString("namamontir"));
                Ttanggal.setText(rs.getString("tanggalservis"));
                Tidcustomer.setText(rs.getString("idcustomer"));
                Tnamacustomer.setText(rs.getString("namacustomer"));
                Tplat.setText(rs.getString("noplat"));
                Tbiaya.setText(rs.getString("biayaservis"));
                 Ckode.setVisible(false);
                Tkode.setVisible(true);
                JOptionPane.showMessageDialog(rootPane, "ini data nya");
            }else {
                Ckode.setVisible(true);
                Tkode.setVisible(false);
                Ckode.setSelectedIndex(0);
                Tno.setText("");
                Tfaktur.setText("");
                Tmontir.setText("");
                Ttanggal.setText("");
                Tidcustomer.setText("");
                Tnamacustomer.setText("");
                Tplat.setText("");
                Tbiaya.setText("");
                 Cdata.setSelectedIndex(0);
                JOptionPane.showMessageDialog(rootPane, "data belum di input");
            }
        }    
      catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "error" +e);
        }      // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void CdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CdataActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
 customer project = new customer(); 
  project.setVisible(true);
        this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
 montir project = new montir(); 
  project.setVisible(true);
        this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
 motor project = new motor(); 
  project.setVisible(true);
        this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(dataservis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataservis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataservis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataservis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataservis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cdata;
    private javax.swing.JComboBox<String> Ckode;
    private javax.swing.JMenu Menu;
    private javax.swing.JTextField Tbiaya;
    private javax.swing.JTextField Tfaktur;
    private javax.swing.JTextField Tidcustomer;
    private javax.swing.JTextField Tkode;
    private javax.swing.JTextField Tmontir;
    private javax.swing.JTextField Tnamacustomer;
    private javax.swing.JTextField Tno;
    private javax.swing.JTextField Tplat;
    private javax.swing.JTextField Ttanggal;
    private javax.swing.JLabel biayaservis;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JLabel idcustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kodemontir;
    private javax.swing.JLabel laporandataservis;
    private javax.swing.JLabel namacustomer;
    private javax.swing.JLabel namamontir;
    private javax.swing.JLabel no;
    private javax.swing.JLabel nofaktur;
    private javax.swing.JLabel noplat;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTable tabeldataservis;
    private javax.swing.JLabel tanggalservis;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void tabeldataservis() {
      DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("No");
        tabel.addColumn("No Faktur");
        tabel.addColumn("Kode Montir");
        tabel.addColumn("Nama Montir");
        tabel.addColumn("Tanggal Servis");
        tabel.addColumn("Id Customer");
        tabel.addColumn("Nama Customer");
        tabel.addColumn("No Plat");
        tabel.addColumn("Biaya Servis");
        
        try {
            sql="select * from tbdataservis";
            stat= con.createStatement();
            rs= stat.executeQuery(sql);
            while (rs.next()){
                tabel.addRow(new Object[]{
                    rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8),
                    rs.getString(9), 
                });
                tabeldataservis.setModel(tabel);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error"+e);
        }
    }
}
