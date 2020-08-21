/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentInfo;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Anonymous
 */
public class Manage extends javax.swing.JFrame {

    /**
     * Creates new form Manage
     */
    
    private DefaultTableModel model;
    private String[]columns = {"ID","First Name","Last Name","Gender","BirthDate","Phone","Email","Address"};
    private String[]rows = new String[8];
    private int numberOFrow;
            
    public Manage(){
        initComponents();
        model = new DefaultTableModel();
        Font font = new Font("Calibri",Font.BOLD,14);
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setRowHeight(30);
        table.setFont(font);
        DBtoTable();
        
    }
    
    void DBtoTable(){
        try{
            Connection DBcon = DBconnect.mySqlCon();
            Statement myStmt = DBcon.createStatement();
            String sql = "SELECT id,first_name,last_name,sex,birthdate,phone,email,address FROM studentinfo";
            ResultSet rs = myStmt.executeQuery(sql);

            while(rs.next()){
                rows[0] = rs.getString("id");
                rows[1] = rs.getString("first_name");
                rows[2] = rs.getString("last_name");
                rows[3] = rs.getString("sex");
                rows[4] = rs.getString("birthdate");
                rows[5] = rs.getString("phone");
                rows[6] = rs.getString("email");
                rows[7] = rs.getString("address");

                model.addRow(rows);
               
            }
            
            myStmt.close();
            rs.close();
            DBcon.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id_no = new javax.swing.JTextField();
        fName = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        birthDate = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Sex");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("BirthDate");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Phone");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Address");

        id_no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        fName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        birthDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        birthDate.setText("dd/mm/yyyy");

        phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        address.setColumns(20);
        address.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        gender.add(radMale);
        radMale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radMale.setText("Male");
        radMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMaleActionPerformed(evt);
            }
        });

        gender.add(radFemale);
        radFemale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radFemale.setText("Female");

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone)
                            .addComponent(email)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(radFemale))
                                    .addComponent(lName)))
                            .addComponent(jScrollPane1)
                            .addComponent(birthDate)
                            .addComponent(fName)
                            .addComponent(id_no)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addComponent(update)
                        .addGap(20, 20, 20)
                        .addComponent(delete)
                        .addGap(20, 20, 20)
                        .addComponent(clear)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radMale)
                        .addComponent(radFemale))
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(clear)
                    .addComponent(add)
                    .addComponent(update))
                .addGap(22, 22, 22))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Search");

        searchField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Manage Student Information");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(531, 531, 531)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radMaleActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        numberOFrow = table.getSelectedRow();
        getData();
        
        String updateHelp = model.getValueAt(numberOFrow, 0).toString();
        
        model.setValueAt(rows[0], numberOFrow, 0);
        model.setValueAt(rows[1], numberOFrow, 1);
        model.setValueAt(rows[2], numberOFrow, 2);
        model.setValueAt(rows[3], numberOFrow, 3);
        model.setValueAt(rows[4], numberOFrow, 4);
        model.setValueAt(rows[5], numberOFrow, 5);
        model.setValueAt(rows[6], numberOFrow, 6);
        model.setValueAt(rows[7], numberOFrow, 7);
        
        try{
            Connection DBcon = DBconnect.mySqlCon();
            String sql = "UPDATE studentinfo SET id=?,first_name=?,last_name=?,sex=?,birthdate=?,phone=?,email=?,address=? WHERE id = "+updateHelp;
            PreparedStatement myStmt = DBcon.prepareStatement(sql);
            
            myStmt.setString(1, rows[0]);
            myStmt.setString(2, rows[1]);
            myStmt.setString(3, rows[2]);
            myStmt.setString(4, rows[3]);
            myStmt.setString(5, rows[4]);
            myStmt.setString(6, rows[5]);
            myStmt.setString(7, rows[6]);
            myStmt.setString(8, rows[7]);

            myStmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        clearAll();
    }//GEN-LAST:event_clearActionPerformed
    
    void clearAll(){
        id_no.setText(null);
        fName.setText(null);
        lName.setText(null);
        gender.clearSelection();
        birthDate.setText(null);
        phone.setText(null);
        email.setText(null);
        address.setText(null);
    }
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        getData();
        model.addRow(rows);
        try {
            // TODO add your handling code here:
            Connection DBcon = DBconnect.mySqlCon();
            String sql = "INSERT into studentinfo values(?,?,?,?,?,?,?,?)";
            PreparedStatement myStmt = DBcon.prepareStatement(sql);
            
            myStmt.setString(1,rows[0]);
            myStmt.setString(2,rows[1]);
            myStmt.setString(3,rows[2]);
            myStmt.setString(4,rows[3]);
            myStmt.setString(5,rows[4]);
            myStmt.setString(6,rows[5]);
            myStmt.setString(7,rows[6]);
            myStmt.setString(8,rows[7]);
            
            myStmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

    void getData(){
        rows[0] = id_no.getText();
        rows[1] = fName.getText();
        rows[2] = lName.getText();
        if(radMale.isSelected())
            rows[3] = "Male";
        else
            rows[3] = "Female";
        rows[4] = birthDate.getText();
        rows[5] = phone.getText();
        rows[6] = email.getText();
        rows[7] = address.getText();
    }
    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        if(numberOFrow>=0){
            model.removeRow(numberOFrow);
            try{
                Connection DBcon = DBconnect.mySqlCon();
                String sql = "DELETE FROM studentinfo where id = ?";
                PreparedStatement myStmt = DBcon.prepareStatement(sql);
                myStmt.setString(1, rows[0]);
                myStmt.executeUpdate();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "No Row has been Selected!");
        }
        clearAll();
    }//GEN-LAST:event_deleteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        numberOFrow = table.getSelectedRow();
        
        rows[0] = model.getValueAt(numberOFrow, 0).toString();
        rows[1] = model.getValueAt(numberOFrow, 1).toString();
        rows[2] = model.getValueAt(numberOFrow, 2).toString();
        rows[3] = model.getValueAt(numberOFrow, 3).toString();
        rows[4] = model.getValueAt(numberOFrow, 4).toString();
        rows[5] = model.getValueAt(numberOFrow, 5).toString();
        rows[6] = model.getValueAt(numberOFrow, 6).toString();
        rows[7] = model.getValueAt(numberOFrow, 7).toString();
        
        id_no.setText(rows[0]);
        fName.setText(rows[1]);
        lName.setText(rows[2]);
//        if(rows[3].equals("Male")){
//            gender.setSelected((ButtonModel) radMale, true);
//        }else{
//            gender.setSelected((ButtonModel) radFemale, true);
//        }
        birthDate.setText(rows[4]);
        phone.setText(rows[5]);
        email.setText(rows[6]);
        address.setText(rows[7]);
    }//GEN-LAST:event_tableMouseClicked

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchField.getText().trim()));
    }//GEN-LAST:event_searchFieldKeyReleased
    

    
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
            java.util.logging.Logger.getLogger(Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Manage manageFrame = new Manage();
                manageFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField birthDate;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fName;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JTextField id_no;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField phone;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}