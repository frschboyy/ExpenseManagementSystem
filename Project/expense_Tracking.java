package apt3040_final_project;

import java.sql.*;
import java.util.Random;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class expense_Tracking extends javax.swing.JFrame {

    public expense_Tracking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        department_input = new javax.swing.JTextField();
        eType_input = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        description_input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setText("ADD NEW EXPENSE...");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setText("Department");

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setText("Expense Type");

        department_input.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        department_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                department_inputActionPerformed(evt);
            }
        });

        eType_input.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        eType_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eType_inputActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setText("Description");

        description_input.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        description_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                description_inputActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText(" Main Menu ");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eType_input))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(description_input))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addComponent(department_input, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(department_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eType_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(description_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eType_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eType_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eType_inputActionPerformed

    private void description_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_description_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_description_inputActionPerformed

    private void department_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_department_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_department_inputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // declare an ArrayList to dynamically store department names
        ArrayList<String> Departments = new ArrayList<>();
        // declare an ArrayList ot dynamically store expense types
        ArrayList<String> Expenses = new ArrayList<>();
        // declare an ArrayList ot dynamically store transaction IDs
        ArrayList<String> Transactions = new ArrayList<>();

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

            // create statement objects for executing SQL queries (option 1)
            Statement st1 = con.createStatement();
            Statement st2 = con.createStatement();
            Statement st3 = con.createStatement();

            // instructions to query existing data (option 1)
            String sqlQueryDept = "SELECT Department FROM budget_management";
            String sqlQueryExpense = "SELECT Expense_Type FROM expenses";
            String sqlQueryID = "SELECT Expense_ID FROM expense_tracking";

            // instruction to insert data into db (option 1)
            String sqlInsertTrans = "INSERT INTO expense_tracking (Expense_ID, "
                    + "Department, Expense_Type, Date, Description) "
                    + "VALUES (?, ?, ?, ?, ?)";

            // create a prepared statement object for insert transaction into db (option 1)
            PreparedStatement psTrans = con.prepareStatement(sqlInsertTrans);

            // exexuting query and storing the result in a ResultSet (option 1)
            ResultSet resDept = st1.executeQuery(sqlQueryDept);
            ResultSet resExp = st2.executeQuery(sqlQueryExpense);
            ResultSet resID = st3.executeQuery(sqlQueryID);

            // Iterate through result set and save Department data in arrayList
            while (resDept.next()) {
                String dept = resDept.getString("Department");
                Departments.add(dept); // add element to ArrayList
            }
            // Iterate through result set and save Expense Type data in arrayList
            while (resExp.next()) {
                String typeE = resExp.getString("Expense_Type");
                Expenses.add(typeE); // add element to ArrayList
            }
            // Iterate through result set and save Transaction Type data in arrayList
            while (resID.next()) {
                String ID = resID.getString("Expense_ID");
                Transactions.add(ID); // add element to ArrayList
            }

            boolean exist;
            String dept, typeE;
            String randID = "";

            // input department and check its existence
            dept = department_input.getText();
            dept = existsDept(dept, Departments, this);
            if (dept == null) {
                department_input.setText("");
                department_input.requestFocus();
                return;
            }

            // input expense type and check its existence
            typeE = eType_input.getText(); // Get input value inside the loop
            typeE = existsExpense(typeE, Expenses, this);
            if (typeE == null) {
                eType_input.setText("");
                eType_input.requestFocus();
                return;
            }

            exist = true;
            // generate a random 5-digit number
            while (exist) {
                randID = randomID();
                exist = existsID(randID, Transactions);
            }

            // get current date
            LocalDate now = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
            String date = now.format(formatter);
            Date currDate = Date.valueOf(date); // change to sql date

            // set values for the insert instructions
            psTrans.setString(1, randID);
            psTrans.setString(2, dept);
            psTrans.setString(3, typeE);
            psTrans.setDate(4, currDate);
            psTrans.setString(5, description_input.getText());

            // execute the insert operation
            int newRecords = psTrans.executeUpdate();

            // check if insertion was successful
            if (newRecords > 0) {
                JOptionPane.showMessageDialog(this, "\nTransaction recorded successfully");
                // reset form
                department_input.setText("");
                eType_input.setText("");
                description_input.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "\nFailed to record transaction!!!");
            }

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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainMenu mm = new MainMenu();
        dispose();
        mm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(expense_Tracking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new expense_Tracking().setVisible(true);
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

    // checks if Expense type exists in DB
    public static String existsExpense(String typeE, ArrayList<String> Expenses, JFrame parentComp) {
        String realLabel = null;
        for (String check : Expenses) {
            if (typeE.toLowerCase().strip().equals(check.toLowerCase())) {
                realLabel = check;
                break;
            }
        }
        if (realLabel == null) {
            JOptionPane.showMessageDialog(parentComp, "INVALID!!\n...We do not support this type of expense!!");
        }
        return realLabel;
    }

    // checks if transaction ID already exists in DB
    public static boolean existsID(String randID, ArrayList<String> Transactions) {
        boolean exist = false;
        for (String check : Transactions) {
            if (randID.equals(check.toLowerCase())) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    // randomly generates 5-digit alphanumeric string
    public static String randomID() {
        // Define the characters allowed in the random string
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";

        String randID = "";

        // generate 5 random characters and append them to the string
        for (int i = 0; i < 5; i++) {
            int randIndex = rand.nextInt(characters.length());
            char randChar = characters.charAt(randIndex);
            randID = randID + randChar;
        }
        return randID;
    }

    static Random rand = new Random();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField department_input;
    private javax.swing.JTextField description_input;
    private javax.swing.JTextField eType_input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
