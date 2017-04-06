/**
 * @author Edward F. 
 * @GitHub - JavierBmrg
 * description - Main Class - Has the logical to forms
 */
package appuser;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class AppForm extends javax.swing.JFrame {
        
    boolean valtext;
    
    public AppForm() {
        initComponents();                
        
        textArea.disable();
    }

    public boolean validateText(String userName )
    {
        valtext = userName.length() >= 6;
        
        return valtext;
    }
    
    
    public boolean validateTextMatchRes(String valName)
    {
        valName = valName.replaceAll("[^a-zA-Z]|\\s+|\\d+","");
        AppResUser appresuser = new AppResUser(valName);
        boolean boolval;
        
        boolval = appresuser.validateIfExistsRes();        
        
        return boolval;
    }
    
    public static ArrayList nameSuggest(String userName)
    {
        String valNameWtoNum = userName.replaceAll("\\d+",""); 
        Random rand = new Random();
        int len = 300;
        ArrayList<Integer> listNumbers = new ArrayList<>(len);
        ArrayList<String> listNumbersP = new ArrayList<>();        
        ArrayList<String> listNumbersF = new ArrayList<>();
        
        while (listNumbers.size() < len) {

           int num = rand.nextInt(len);
           if (!listNumbers.contains(num)) {
               listNumbers.add(num);
           }
       }
        
        for(int i = 0; i < 14; i++)   
        {
            listNumbersF.add(valNameWtoNum+listNumbers.get(i));
        }
        
        for (int g = 0; g < listNumbersF.size(); g++) {
            if((g % 4) == 0)
            {
                listNumbersP.add(listNumbersF.get(g).substring(0,1).toUpperCase() + listNumbersF.get(g).substring(1));
            }
            else
            {
                listNumbersP.add(listNumbersF.get(g));
            }            
        }
        
       return listNumbersP;
     
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        textValidate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnValidate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnRestUser = new javax.swing.JButton();
        textRest = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValidateActionPerformed(evt);
            }
        });

        jLabel1.setText("User name");

        btnValidate.setText("Validate");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });

        jLabel2.setText("User name validation");

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setOpaque(false);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnValidate))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textValidate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValidate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Validate Name", jPanel1);

        jLabel3.setText("Restrict user names");

        btnRestUser.setText("Insert");
        btnRestUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestUserActionPerformed(evt);
            }
        });

        jLabel4.setText("User name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel3)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textRest)
                        .addGap(30, 30, 30)
                        .addComponent(btnRestUser)
                        .addGap(55, 55, 55))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRestUser)
                            .addComponent(textRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68)))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Restricted Names", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValidateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textValidateActionPerformed

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed

            String userName = textValidate.getText();
            ArrayList listNames = nameSuggest(userName);                       
                          
             //userName = userName.replaceAll("[^a-zA-Z]|\\s+|\\d+","");
            //System.out.println(validateTextMatch(userName)); System.exit(1);
            
            if(validateText(userName))
            {                                           
                
                AppUser appuser = new AppUser();
                                                                                              
                if(appuser.validateIfExists(userName))
                {   
                    textArea.setText("");
                    JOptionPane.showMessageDialog(null, "Failed. User name already exists.");
                    textArea.append("Other user names suggestions: \n");
                    
                    for (Object listName : listNames) {
                        textArea.append("\n" + (String) listName);
                    }
                    
                                       
                }
                else // Insert into BD
                {              
                    if(validateTextMatchRes(userName))
                    {
                        JOptionPane.showMessageDialog(null, userName+" Failed Insertion. This word is restricted.");
                    }
                    else
                    {
                        appuser.insertUser(userName); 
                        JOptionPane.showMessageDialog(null, userName+" Inserted");
                    }                                            
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "This user is invalid, Must have >= 6 characters");
            }

        
        /*
            if(textValidate.getText().length()==0)
            {
            JOptionPane.showMessageDialog(null, "Empty fields detected !");
            }
            else
            {
            AppResUser res = new AppResUser(1,"j");
            boolean mss = res.saveRes(textValidate.getText());
            JOptionPane.showMessageDialog(null,mss);
            }
        */
    }//GEN-LAST:event_btnValidateActionPerformed

    private void btnRestUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestUserActionPerformed


            String userNameRes = textRest.getText();
            userNameRes = userNameRes.replaceAll("[^a-zA-Z]+","");                        
            
            if(validateText(userNameRes))
            {
                AppResUser appresuser = new AppResUser(userNameRes);
                if(appresuser.validateIfExistsRes())
                {
                    JOptionPane.showMessageDialog(null, "Failed. Restricted User Name already exists.");
                }
                else
                {
                    appresuser.insertRes();
                    JOptionPane.showMessageDialog(null, "Insert Success.");
                }
            }
            else
            {                
               JOptionPane.showMessageDialog(null, "This word is invalid or is empty, Must have >= 6 characters");
            }
        
        
        
    }//GEN-LAST:event_btnRestUserActionPerformed

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
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestUser;
    private javax.swing.JButton btnValidate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textRest;
    private javax.swing.JTextField textValidate;
    // End of variables declaration//GEN-END:variables
}
