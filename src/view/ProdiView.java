/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.ProdiControl;
import entity.Prodi;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

/**
 *
 * @author tkg
 */
public class ProdiView extends javax.swing.JFrame {

    /**
     * Creates new form ProdiView
     */

    private ProdiControl pc;
    String action = null;

    public void showProdi() {
        txaDisplay.setText(pc.showDataProdi());
    }

    public ProdiView() {
        initComponents();
        pc = new ProdiControl();
        setComponent(false);
        setEditDeleteBtn(false);
        showProdi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProdi = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblKode = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();
        btnMenuMahasiswa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Diskusi Obj. Persistence 1 Kelompok 6 PBO B");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelProdi.setBackground(new java.awt.Color(239, 241, 245));
        panelProdi.setName("panelProdi"); // NOI18N

        lblTitle.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(76, 79, 105));
        lblTitle.setText("Program Studi");
        lblTitle.setName("lblTitle"); // NOI18N

        btnAdd.setBackground(new java.awt.Color(204, 208, 218));
        btnAdd.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(76, 79, 105));
        btnAdd.setText("Tambah");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.setMargin(new java.awt.Insets(2, 32, 2, 32));
        btnAdd.setName("btnAdd"); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(204, 208, 218));
        btnEdit.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(76, 79, 105));
        btnEdit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setLabel("Ubah");
        btnEdit.setMargin(new java.awt.Insets(2, 32, 2, 32));
        btnEdit.setName("btnEdit"); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(221, 120, 120));
        btnDelete.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(239, 241, 245));
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setLabel("Hapus");
        btnDelete.setMargin(new java.awt.Insets(2, 32, 2, 32));
        btnDelete.setName("btnDelete"); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblKode.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        lblKode.setForeground(new java.awt.Color(76, 79, 105));
        lblKode.setText("Kode Program Studi");
        lblKode.setName("lblKode"); // NOI18N

        txtKode.setBackground(new java.awt.Color(204, 208, 218));
        txtKode.setForeground(new java.awt.Color(76, 79, 105));
        txtKode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtKode.setName("txtKode"); // NOI18N
        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });

        txtNama.setBackground(new java.awt.Color(204, 208, 218));
        txtNama.setForeground(new java.awt.Color(76, 79, 105));
        txtNama.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNama.setName("txtNama"); // NOI18N

        lblNama.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        lblNama.setForeground(new java.awt.Color(76, 79, 105));
        lblNama.setText("Nama Program Studi");
        lblNama.setName("lblNama"); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtSearch.setBackground(new java.awt.Color(204, 208, 218));
        txtSearch.setForeground(new java.awt.Color(76, 79, 105));
        txtSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtSearch.setName("txtSearch"); // NOI18N

        btnSearch.setBackground(new java.awt.Color(204, 208, 218));
        btnSearch.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(76, 79, 105));
        btnSearch.setText("Cari");
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setMargin(new java.awt.Insets(2, 32, 2, 32));
        btnSearch.setName("btnSearch"); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(204, 208, 218));
        btnCancel.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(76, 79, 105));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setMargin(new java.awt.Insets(2, 32, 2, 32));
        btnCancel.setName("btnCancel"); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(114, 135, 253));
        btnSave.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        btnSave.setForeground(new java.awt.Color(239, 241, 245));
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setMargin(new java.awt.Insets(2, 32, 2, 32));
        btnSave.setName("btnSave"); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txaDisplay.setBackground(new java.awt.Color(220, 224, 232));
        txaDisplay.setColumns(20);
        txaDisplay.setForeground(new java.awt.Color(76, 79, 105));
        txaDisplay.setRows(5);
        jScrollPane1.setViewportView(txaDisplay);

        btnMenuMahasiswa.setBackground(new java.awt.Color(239, 241, 245));
        btnMenuMahasiswa.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        btnMenuMahasiswa.setForeground(new java.awt.Color(200, 200, 200));
        btnMenuMahasiswa.setText("Mahasiswa");
        btnMenuMahasiswa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMenuMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuMahasiswaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProdiLayout = new javax.swing.GroupLayout(panelProdi);
        panelProdi.setLayout(panelProdiLayout);
        panelProdiLayout.setHorizontalGroup(
            panelProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdiLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProdiLayout.createSequentialGroup()
                        .addGroup(panelProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProdiLayout.createSequentialGroup()
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGap(34, 34, 34))
                    .addGroup(panelProdiLayout.createSequentialGroup()
                        .addGroup(panelProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProdiLayout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMenuMahasiswa))
                            .addGroup(panelProdiLayout.createSequentialGroup()
                                .addGroup(panelProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKode)
                                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNama)
                                    .addGroup(panelProdiLayout.createSequentialGroup()
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(103, Short.MAX_VALUE))))
        );
        panelProdiLayout.setVerticalGroup(
            panelProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdiLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnMenuMahasiswa))
                .addGap(13, 13, 13)
                .addGroup(panelProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProdiLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panelProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProdiLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProdiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        setComponent(true);
        clearText();
        action = "Tambah";
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        setComponent(true);
        txtKode.setEnabled(false); //supaya kode prodi tidak bisa diubah
        action = "Ubah";
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Prodi prodi = pc.searchProdi(txtKode.getText());
        pc.deleteDataProdi(prodi.getKodeProdi());
        setEditDeleteBtn(false);
        clearText();
        showProdi();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void btnSearchActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // Ketika button cari diklik maka akan menonaktifkan component Input
        setComponent(false);

        Prodi prodi = pc.searchProdi(txtSearch.getText());

        if (prodi == null) {
            //Ketika data yang dicari tidak ditemukan
            clearText();
            setEditDeleteBtn(false);
            JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
        }
        else {
            //Ketika data yang dicari ditemukan
            txtKode.setText(prodi.getKodeProdi());
            txtNama.setText(prodi.getNamaProdi());
            setEditDeleteBtn(true);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
         setComponent(false);
         setEditDeleteBtn(false);
         clearText();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Prodi p = new Prodi(txtKode.getText(), txtNama.getText());

        if (action.equals("Tambah")) {
            //Ketika action berstatus tambah maka akan memanggil fungsi insert
            pc.insertDataProdi(p);
        } else {
            //Ketika action berstatus ubah maka akan memanggil fungsi update
            pc.updateDataProdi(p);
        }

        setComponent(false);
        setEditDeleteBtn(false);
        clearText();
        showProdi();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnMenuMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuMahasiswaActionPerformed
        MahasiswaView mv = new MahasiswaView();
        this.dispose();
        mv.setVisible(true);
    }//GEN-LAST:event_btnMenuMahasiswaActionPerformed

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
            java.util.logging.Logger.getLogger(ProdiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdiView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnMenuMahasiswa;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblKode;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelProdi;
    private javax.swing.JTextArea txaDisplay;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public void setComponent(boolean value) {
        txtKode.setEnabled(value);
        txtNama.setEnabled(value);

        btnSave.setEnabled(value);
        btnCancel.setEnabled(value);
    }

    public void setEditDeleteBtn(boolean value) {
        btnEdit.setEnabled(value);
        btnDelete.setEnabled(value);
    }

    public void clearText() {
        txtKode.setText("");
        txtNama.setText("");
        txtSearch.setText("");
    }
}