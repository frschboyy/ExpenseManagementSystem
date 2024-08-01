package apt3040_final_project;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class expense_Report extends javax.swing.JFrame {

    public expense_Report() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        department_input = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setText("EXPENSE REPORT");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setText("Department");

        department_input.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        department_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                department_inputActionPerformed(evt);
            }
        });

        submit.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Expense Type", "Cost", "Date", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jTable3.setFont(new java.awt.Font("Monospaced", 1, 11)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Budget", "Budget Used"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText(" Main Menu ");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(41, 41, 41)
                            .addComponent(department_input, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(submit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)))
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(department_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void department_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_department_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_department_inputActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // declare an ArrayList to dynamically store department names
        ArrayList<String> Departments = new ArrayList<>();

        // db credentials
        String url = "jdbc:mysql://localhost:3306/employee_expenses";
        String uname = "APT_final_project";
        String pass = "kfc4life8";

        // connection object
        Connection con = null;
        try {
            // register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // establish db connection
            con = DriverManager.getConnection(url, uname, pass);

            // instructions to query existing data (option 2)
            String sqlQueryDeptRecord = "SELECT Expense_ID, expense_tracking.Expense_Type, "
                    + "Cost, Date, Description FROM expense_tracking "
                    + "INNER JOIN expenses ON expense_tracking.Expense_Type = expenses.Expense_Type "
                    + "WHERE Department = ?";
            String sqlQueryDeptSummary = "SELECT * FROM budget_management WHERE Department = ?";

            // create a prepared statement object to execute SQL query(option 2)
            PreparedStatement psRecord = con.prepareStatement(sqlQueryDeptRecord);
            PreparedStatement psSummary = con.prepareStatement(sqlQueryDeptSummary);

            // create statement objects for executing department SQL queries
            String sqlQueryDept = "SELECT Department FROM budget_management";
            Statement st1 = con.createStatement();
            // exexuting query for existing departments and store the result in a ResultSet
            ResultSet resDept = st1.executeQuery(sqlQueryDept);
            // Iterate through result set and save Department data in arrayList
            while (resDept.next()) {
                String dept = resDept.getString("Department");
                Departments.add(dept); // add element to ArrayList
            }

            String dept;

            // input department and check its existence
            dept = department_input.getText();
            dept = existsDept(dept, Departments, this);
            if (dept == null) {
                department_input.setText("");
                department_input.requestFocus();
                return;
            }

            // set the department parameter
            psRecord.setString(1, dept);
            psSummary.setString(1, dept);
            // execute query and get the result set
            ResultSet resDeptRec = psRecord.executeQuery();
            ResultSet resDeptSum = psSummary.executeQuery();
            // define jTable model
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            // retrieve data from result set
            while (resDeptRec.next()) {
                String ID = resDeptRec.getString("Expense_ID");
                String typeExp = resDeptRec.getString("Expense_Type");
                float costE = resDeptRec.getFloat("Cost");
                Date dates = resDeptRec.getDate("Date");
                String desc = resDeptRec.getString("Description");

                // display retrieved data
                model.addRow(new Object[]{ID, typeExp, costE, dates.toString(), desc});
            }
            DefaultTableModel model2 = (DefaultTableModel) jTable3.getModel();
            model2.setRowCount(0);
            while (resDeptSum.next()) {
                float budget = resDeptSum.getFloat("Budget");
                float used = resDeptSum.getFloat("Budget_Used");
                
                // display retrieved data
                model2.addRow(new Object[]{budget, used});
            }

            // clean-up environment
            resDeptRec.close();
            resDeptSum.close();
        } catch (SQLException | ClassNotFoundException se) {
            // handle errors for JDBC
            se.printStackTrace();
            // display error to user
            JOptionPane.showMessageDialog(null, "SQL Exception occurred: " + se.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Finally block used to close resources
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
                // display error to user
                JOptionPane.showMessageDialog(null, "SQL Exception occurred: " + se.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu mm = new MainMenu();
        dispose();
        mm.setVisible(true);
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
            java.util.logging.Logger.getLogger(expense_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(expense_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(expense_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(expense_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new expense_Report().setVisible(true);
        });
    }

    // checks if Department exists in DB
    public static String existsDept(String dept, ArrayList<String> Departments, JFrame parentComp) {
        String realLabel = null;
        for (String check : Departments) {
            if (dept.toLowerCase().strip().equals(check.toLowerCase())) {
                realLabel = check;
                break;
            }
        }
        if (realLabel == null) {
            JOptionPane.showMessageDialog(parentComp, "ERROR:\n...Department does not exist!!");
        }
        return realLabel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField department_input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
