/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

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
public class penjualan extends javax.swing.JFrame {
    public String kode_barang="";
    public Connection con;
    public ResultSet rs;
    public Statement stat;
    public String sql="";
    /**
     * Creates new form penjualan
     */
    public penjualan() {
        initComponents();
          koneksi db =new koneksi();
        db.koneksi();
        con=db.con;
        rs=db.rs;
        stat=db.stat;
        tampiltabelpenjualan();
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
        laporanpenjualan = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        telppelanggan = new javax.swing.JLabel();
        nofaktur = new javax.swing.JLabel();
        kodebarang = new javax.swing.JLabel();
        jumlahbarang = new javax.swing.JLabel();
        hargabarang = new javax.swing.JLabel();
        totalbayar = new javax.swing.JLabel();
        tgljual = new javax.swing.JLabel();
        KODEPELANGGAN = new javax.swing.JLabel();
        namapelanggan = new javax.swing.JLabel();
        KASIR = new javax.swing.JLabel();
        namabarang = new javax.swing.JLabel();
        Ckode = new javax.swing.JComboBox<>();
        Tkode = new javax.swing.JTextField();
        Tkasir = new javax.swing.JTextField();
        Tfaktur = new javax.swing.JTextField();
        Tnamabrg = new javax.swing.JTextField();
        Tjumlah = new javax.swing.JTextField();
        Tharga = new javax.swing.JTextField();
        Ttglpenjualan = new javax.swing.JTextField();
        Tkodepelanggan = new javax.swing.JTextField();
        Tnamapelanggan = new javax.swing.JTextField();
        Talamat = new javax.swing.JTextField();
        alamatpelanggan = new javax.swing.JLabel();
        Ttelppelanggan = new javax.swing.JTextField();
        EXIT = new javax.swing.JButton();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        SEARCH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpenjualan = new javax.swing.JTable();
        Ttotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Cdata = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        laporanpenjualan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        laporanpenjualan.setText("LAPORAN DATA PENJUALAN");
        jPanel1.add(laporanpenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, -1));

        telppelanggan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telppelanggan.setText("TELEPON PELANGGAN");
        jPanel1.add(telppelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        nofaktur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nofaktur.setText("No. Faktur");
        jPanel1.add(nofaktur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        kodebarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kodebarang.setText("KODE BARANG");
        jPanel1.add(kodebarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jumlahbarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jumlahbarang.setForeground(new java.awt.Color(255, 255, 255));
        jumlahbarang.setText("JUMLAH BARANG");
        jPanel1.add(jumlahbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        hargabarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hargabarang.setText("HARGA BARANG");
        jPanel1.add(hargabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        totalbayar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalbayar.setForeground(new java.awt.Color(255, 255, 255));
        totalbayar.setText("TOTAL BAYAR");
        jPanel1.add(totalbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        tgljual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tgljual.setForeground(new java.awt.Color(255, 255, 255));
        tgljual.setText("TANGGAL PENJUALAN");
        jPanel1.add(tgljual, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        KODEPELANGGAN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        KODEPELANGGAN.setText("KODE PELANGGAN");
        jPanel1.add(KODEPELANGGAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        namapelanggan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namapelanggan.setText("NAMA PELANGGAN");
        jPanel1.add(namapelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        KASIR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        KASIR.setText("KASIR");
        jPanel1.add(KASIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        namabarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namabarang.setText("NAMA BARANG");
        jPanel1.add(namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        Ckode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "A01", "A02", "A03", "A04", "A05", "B01", "B02", "B03", "B04", "B05", "C01", "C02", "C03", "C04", "C05" }));
        Ckode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CkodeActionPerformed(evt);
            }
        });
        jPanel1.add(Ckode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 210, 30));
        jPanel1.add(Tkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 210, 30));
        jPanel1.add(Tkasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 210, 30));
        jPanel1.add(Tfaktur, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 210, 30));
        jPanel1.add(Tnamabrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 210, 30));

        Tjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TjumlahActionPerformed(evt);
            }
        });
        jPanel1.add(Tjumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 210, 30));

        Tharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThargaActionPerformed(evt);
            }
        });
        jPanel1.add(Tharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 210, 30));
        jPanel1.add(Ttglpenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 210, 30));
        jPanel1.add(Tkodepelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 210, 30));
        jPanel1.add(Tnamapelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 210, 30));
        jPanel1.add(Talamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 210, 30));

        alamatpelanggan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alamatpelanggan.setText("ALAMAT PELANGGAN");
        jPanel1.add(alamatpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));
        jPanel1.add(Ttelppelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 210, 30));

        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        jPanel1.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 90, 40));

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 90, 40));

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 90, 40));

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 90, 40));

        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        jPanel1.add(RESET, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 90, 40));

        SEARCH.setText("SEARCH");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });
        jPanel1.add(SEARCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 90, 40));

        tabelpenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelpenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpenjualanMouseClicked(evt);
            }
        });
        tabelpenjualan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelpenjualanKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelpenjualan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 800, 130));
        jPanel1.add(Ttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 210, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CARI DATA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        Cdata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "A01", "A02", "A03", "A04", "A05", "B01", "B02", "B03", "B04", "B05", "C01", "C02", "C03", "C04", "C05" }));
        Cdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdataActionPerformed(evt);
            }
        });
        jPanel1.add(Cdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 210, 30));

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 90, 40));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\penjualan.jpg")); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
 try {
        String kodePelanggan = Tkodepelanggan.getText();
        String namaPelanggan = Tnamapelanggan.getText();
        String alamatPelanggan = Talamat.getText();
        String telpPelanggan = Ttelppelanggan.getText();

        String cekPelangganQuery = "SELECT * FROM pelanggan WHERE kodepelanggan = ?";
        PreparedStatement cekPelangganStmt = con.prepareStatement(cekPelangganQuery);
        cekPelangganStmt.setString(1, kodePelanggan);
        ResultSet pelangganResult = cekPelangganStmt.executeQuery();

        if (!pelangganResult.next()) {
            String insertPelangganQuery = "INSERT INTO pelanggan (kodepelanggan, namapelanggan, alamatpelanggan, telp) VALUES (?, ?, ?, ?)";
            PreparedStatement insertPelangganStmt = con.prepareStatement(insertPelangganQuery);
            insertPelangganStmt.setString(1, kodePelanggan);
            insertPelangganStmt.setString(2, namaPelanggan);
            insertPelangganStmt.setString(3, alamatPelanggan);
            insertPelangganStmt.setString(4, telpPelanggan);
            insertPelangganStmt.executeUpdate();
        }

        String sql = "INSERT INTO penjualan (nofaktur, kodebarang, namabarang, harga, jumlahbrg, totalbayar, kodepelanggan, namapelanggan, telppelanggan, alamat, tglpenjualan, kasir) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, Tfaktur.getText());
        stmt.setString(2, Ckode.getSelectedItem().toString());
        stmt.setString(3, Tnamabrg.getText());
        stmt.setString(4, Tharga.getText());
        stmt.setString(5, Tjumlah.getText());
        stmt.setString(6, Ttotal.getText());
        stmt.setString(7, kodePelanggan);
        stmt.setString(8, namaPelanggan);
        stmt.setString(9, telpPelanggan);
        stmt.setString(10, alamatPelanggan);
        stmt.setString(11, Ttglpenjualan.getText());
        stmt.setString(12, Tkasir.getText());
        stmt.executeUpdate();

        Tfaktur.setText("");
        Ckode.setVisible(true);
        Ckode.setSelectedIndex(0);
        Tnamabrg.setText("");
        Tharga.setText("");
        Tjumlah.setText("");
        Ttotal.setText("");
        Tkodepelanggan.setText("");
        Tnamapelanggan.setText("");
        Ttelppelanggan.setText("");
        Talamat.setText("");
        Ttglpenjualan.setText("");
        Tkasir.setText("");
        Tkode.setVisible(false);

        JOptionPane.showMessageDialog(rootPane, "Data Telah Disimpan");
    } catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(rootPane, "Data Gagal Disimpan, Tidak dapat duplicate data");
    }

    tampiltabelpenjualan();        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void tabelpenjualanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelpenjualanKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelpenjualanKeyPressed

    private void tabelpenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpenjualanMouseClicked
  Tfaktur.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 0).toString());
        Tkode.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 1).toString());
        Tnamabrg.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 2).toString());
        Tjumlah.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 4).toString());
        Tharga.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 3).toString());
         Ttotal.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 5).toString());
        Tkodepelanggan.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 6).toString());
        Tnamapelanggan.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 7).toString());
        Ttelppelanggan.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 8).toString());
        Talamat.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 9).toString());
        Ttglpenjualan.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 10).toString());
        Tkasir.setText(tabelpenjualan.getValueAt(tabelpenjualan.getSelectedRow(), 11).toString());
        Ckode.setVisible(false);
        Tkode.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_tabelpenjualanMouseClicked

    private void CkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CkodeActionPerformed
 kode_barang = (String) Ckode.getSelectedItem();
        if (kode_barang == "A01"){
            Tnamabrg.  setText ("KOMPOR");
            Tharga. setText("100000");
        }
        
        else if (kode_barang == "A02"){
            Tnamabrg.  setText ("KULKAS");
            Tharga. setText("23000000");
        }
        
        else if (kode_barang == "A03"){
            Tnamabrg.  setText ("AC");
            Tharga. setText("3500000");
           
        }

        else if (kode_barang == "A04"){
            Tnamabrg.  setText ("SPEAKER");
            Tharga. setText("834000");
        }
        
        else if (kode_barang == "A05"){
            Tnamabrg.  setText ("LAMPU HIAS");
            Tharga. setText("15000000");
        }
        
        else if (kode_barang == "B01"){
            Tnamabrg.  setText ("DISPENSER");
            Tharga. setText("1500000");
        }
        
        else if (kode_barang == "B02"){
            Tnamabrg.  setText ("RICE COOKER");
            Tharga. setText("1200000");  
        }
        
        else if (kode_barang == "B03"){
            Tnamabrg.  setText ("KARPET");
            Tharga. setText("150000");
        }
        
        else if (kode_barang == "B04"){
            Tnamabrg.  setText ("BLENDER");
            Tharga. setText("250000");
        }
        
        else if (kode_barang == "B05"){
            Tnamabrg.  setText ("PIRING");
            Tharga. setText("350000");
        }
        else if (kode_barang == "C01"){
            Tnamabrg.  setText ("GELAS");
            Tharga. setText("400000");
        }   
        else if (kode_barang == "C02"){
            Tnamabrg.  setText ("TV");
            Tharga. setText("6450000");
        }   
        else if (kode_barang == "C03"){
            Tnamabrg.  setText ("BED");
            Tharga. setText("18000000");
        }   
        else if (kode_barang == "C04"){
            Tnamabrg.  setText ("SOFA BED");
            Tharga. setText("12400000");
        }
        else if (kode_barang == "C05"){
            Tnamabrg.  setText ("MESIN CUCI");
            Tharga. setText("45600000");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_CkodeActionPerformed

    private void TjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TjumlahActionPerformed
int jumlah,harga,totalbayar;
        jumlah = Integer.parseInt(Tjumlah.getText());
        harga = Integer.parseInt(Tharga.getText());
        totalbayar =jumlah * harga;
        Ttotal.setText(String.valueOf(totalbayar));          // TODO add your handling code here:
    }//GEN-LAST:event_TjumlahActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_EXITActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    try {
            sql="delete from penjualan where nofaktur='"+
                      Tfaktur.getText()+"'";
            stat=con.createStatement();
            stat.execute(sql);
            Tfaktur.setText("");
             Ckode.setVisible(true);
            Tkode.setVisible(false);
            Ckode.setSelectedIndex(0);
            Tnamabrg.setText("");
             Tharga.setText("");
             Tjumlah.setText("");
               Ttotal.setText("");
               Tkodepelanggan.setText("");
               Tnamapelanggan.setText("");
               Ttelppelanggan.setText("");
               Talamat.setText("");
               Ttglpenjualan.setText("");
               Tkasir.setText("");
            JOptionPane.showMessageDialog(rootPane, "data telah dihapus");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Dihapus"+e);
        }
             tampiltabelpenjualan();       // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        Tfaktur.setText("");
        Ckode.setVisible(true);
        Ckode.setSelectedIndex(0);
        Tkode.setVisible(false);
        Tnamabrg.setText("");
        Tharga.setText("");
        Tjumlah.setText("");
        Ttotal.setText("");
       Tkodepelanggan.setText("");
       Tnamapelanggan.setText("");
       Ttelppelanggan.setText("");
       Talamat.setText("");
       Ttglpenjualan.setText("");
       Tkasir.setText("");
       Cdata.setSelectedIndex(0);
    }//GEN-LAST:event_RESETActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
   try {
    sql="update penjualan set kodebarang='"+
        Tkode.getText()+"',namabarang='"+
        Tnamabrg.getText()+"',harga='"+
        Tharga.getText()+"',jumlahbrg='"+
        Tjumlah.getText()+"',totalbayar='"+
            Ttotal.getText()+"',kodepelanggan='"+
            Tkodepelanggan.getText()+"',namapelanggan='"+
            Tnamapelanggan.getText()+"',telppelanggan='"+
            Ttelppelanggan.getText()+"',alamat='"+
            Talamat.getText()+"',tglpenjualan='"+
            Ttglpenjualan.getText()+"',kasir='"+
        Tkasir.getText()+"' where nofaktur='"+
        Tfaktur.getText()+"'";
  stat=con.createStatement();
  stat.execute(sql);
            
  JOptionPane.showMessageDialog(rootPane, "data telah di edit");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "data gagal di edit"+e);
        }
        tampiltabelpenjualan();           // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
      try {
            sql="select * from penjualan where kodebarang='"+
            Cdata.getSelectedItem()+"'";
            stat=con.createStatement();
            rs=stat.executeQuery(sql);
            Tkode.setVisible(false);
            if (rs.next()) {
                Tfaktur.setText(rs.getString("nofaktur"));
                Tkode.setText(rs.getString("kodebarang"));
                Tnamabrg.setText(rs.getString("namabarang"));
                Tharga.setText(rs.getString("harga"));
                Tjumlah.setText(rs.getString("jumlahbrg"));
                Ttotal.setText(rs.getString("totalbayar"));
                Tkodepelanggan.setText(rs.getString("kodepelanggan"));
                Tnamapelanggan.setText(rs.getString("namapelanggan"));
                Ttelppelanggan.setText(rs.getString("telppelanggan"));
                Talamat.setText(rs.getString("alamat"));
                Ttglpenjualan.setText(rs.getString("tglpenjualan"));
                Tkasir.setText(rs.getString("kasir"));
                Ckode.setVisible(false);
                Tkode.setVisible(true);
                JOptionPane.showMessageDialog(rootPane, "ini data nya");
            } else {
                Ckode.setVisible(true);
                Tkode.setVisible(false);
                Ckode.setSelectedIndex(0);
                Tfaktur.setText("");
                Tnamabrg.setText("");
                Tharga.setText("");
                Tjumlah.setText("");
                Ttotal.setText("");
                Tkodepelanggan.setText("");
                Tnamapelanggan.setText("");
                Ttelppelanggan.setText("");
                Talamat.setText("");
                Ttglpenjualan.setText("");
                Tkasir.setText("");
                Cdata.setSelectedIndex(0);
                JOptionPane.showMessageDialog(rootPane, "data belum di input");
            }
        }
        catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "error" +e);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_SEARCHActionPerformed

    private void CdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CdataActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
  admin project = new admin();
        project.setVisible(true);
        this.dispose(); 
    // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void ThargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThargaActionPerformed

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
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cdata;
    private javax.swing.JComboBox<String> Ckode;
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel KASIR;
    private javax.swing.JLabel KODEPELANGGAN;
    private javax.swing.JButton RESET;
    private javax.swing.JButton SEARCH;
    private javax.swing.JTextField Talamat;
    private javax.swing.JTextField Tfaktur;
    private javax.swing.JTextField Tharga;
    private javax.swing.JTextField Tjumlah;
    private javax.swing.JTextField Tkasir;
    private javax.swing.JTextField Tkode;
    private javax.swing.JTextField Tkodepelanggan;
    private javax.swing.JTextField Tnamabrg;
    private javax.swing.JTextField Tnamapelanggan;
    private javax.swing.JTextField Ttelppelanggan;
    private javax.swing.JTextField Ttglpenjualan;
    private javax.swing.JTextField Ttotal;
    private javax.swing.JLabel alamatpelanggan;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JButton delete;
    private javax.swing.JLabel hargabarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jumlahbarang;
    private javax.swing.JLabel kodebarang;
    private javax.swing.JLabel laporanpenjualan;
    private javax.swing.JLabel namabarang;
    private javax.swing.JLabel namapelanggan;
    private javax.swing.JLabel nofaktur;
    private javax.swing.JButton save;
    private javax.swing.JTable tabelpenjualan;
    private javax.swing.JLabel telppelanggan;
    private javax.swing.JLabel tgljual;
    private javax.swing.JLabel totalbayar;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private void tampiltabelpenjualan() {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("nofaktur");
        tabel.addColumn("Kode Barang");
        tabel.addColumn("Nama Barang");
        tabel.addColumn("Harga");
        tabel.addColumn("Jumlah Barang");
        tabel.addColumn("Total Bayar");
        tabel.addColumn("Kode Pelanggan");
        tabel.addColumn("Nama Pelanggan");
        tabel.addColumn("Telepom Pelanggan");
        tabel.addColumn("Alamat Pelanggan");
        tabel.addColumn("Tanggal Penjualan");
        tabel.addColumn("Kasir");
        
        
        try {
            sql="select * from penjualan";
            stat= con.createStatement();
            rs= stat.executeQuery(sql);
            while (rs.next()){
                tabel.addRow(new Object[]{
                    rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8),
                    rs.getString(9), rs.getString(10),
                    rs.getString(11), rs.getString(12),
                });
                tabelpenjualan.setModel(tabel);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error"+e);
        }
    }
}
